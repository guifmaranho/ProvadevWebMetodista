package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.employee;
import model.employeeDao;
import model.pacient;

@WebServlet(urlPatterns = { "/login" })
public class Login extends HttpServlet {

	private static final long serialVersionUID = -9109311005532043020L;

	String login = "";
	String senha = "";
	employeeDao FUNCIONARIO = new employeeDao();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employeeDao nDAO = new employeeDao();
		HttpSession session = req.getSession();
		login = req.getParameter("login");
		senha = req.getParameter("senha");
		employee funcionario01 = FUNCIONARIO.verificarLogin(login, senha);

		if (funcionario01.getTipoFunc() == "Medico") {
			session.setAttribute("medico", login);
			List<String> pacientes = nDAO.checkPacients(login);
			List<String> horarios = nDAO.checkTime(login);
			List<pacient> pacienteLista = employeeDao.pacients;
			req.setAttribute("listaP", pacienteLista);
			req.setAttribute("pacientes", pacientes);
			req.setAttribute("horarios", horarios);
			req.setAttribute("medico", login);
			req.getRequestDispatcher("doctorlogin.jsp").forward(req, resp);
		} else if (funcionario01.getTipoFunc() == "Secretaria") {
			session.setAttribute("secretaria", login);
			req.getRequestDispatcher("secretarylogin.jsp").forward(req, resp);
		} else {
			resp.sendRedirect("invalid.jsp");
		}
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employeeDao nDAO = new employeeDao();
		HttpSession session = req.getSession();
		if (session.getAttribute("medico") != null) {
			List<pacient> pacienteLista = employeeDao.pacients;
			List<String> pacientes = nDAO.checkPacients(login);
			List<String> horarios = nDAO.checkTime(login);
			req.setAttribute("listaP", pacienteLista);
			req.setAttribute("pacientes", pacientes);
			req.setAttribute("horarios", horarios);
			req.setAttribute("medico", login);
			req.getRequestDispatcher("doctorlogin.jsp").forward(req, resp);
		} else if (session.getAttribute("secretaria") != null) {
			req.getRequestDispatcher("secretarylogin.jsp").forward(req, resp);
		} else {
			req.getRequestDispatcher("index.jsp").forward(req, resp);
		}
	}
}
