package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employeeDao;
import model.pacient;

@WebServlet(urlPatterns = { "/record" })
public class Record extends HttpServlet {
	private static final long serialVersionUID = -2113159070295189709L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employeeDao dao = new employeeDao();
		String horario = req.getParameter("horario");
		String[] record = horario.split(" - ");
		pacient paciente = dao.checkPacient(record[0]);
		req.setAttribute("paciente", paciente);
		req.getRequestDispatcher("record.jsp").forward(req, resp);
	}
}