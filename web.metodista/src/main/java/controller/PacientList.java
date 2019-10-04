package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employeeDao;
import model.pacient;

@WebServlet(urlPatterns = { "/pacientlist" })
public class PacientList extends HttpServlet {

	private static final long serialVersionUID = 6708931644752526055L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//FuncionarioDao dao = new FuncionarioDao();
		List<pacient> pacienteLista = employeeDao.pacients;
		req.setAttribute("listaP", pacienteLista);
		req.getRequestDispatcher("pacientlist.jsp").forward(req, resp);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<pacient> pacienteLista = employeeDao.pacients;
		req.setAttribute("listaP", pacienteLista);
		req.getRequestDispatcher("pacientlist.jsp").forward(req, resp);
	}
}