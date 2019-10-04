package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employeeDao;

@WebServlet(urlPatterns = { "/delete" })
public class DeleteQuery extends HttpServlet {
	private static final long serialVersionUID = -2921710009693193935L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employeeDao dao = new employeeDao();
		String horario = req.getParameter("horario");
		String[] agenda = horario.split(" - ");
		String doctorName = req.getParameter("medico");
		dao.removerConsulta(doctorName, agenda[0]);
		req.getRequestDispatcher("/login").forward(req, resp);
	}
}
