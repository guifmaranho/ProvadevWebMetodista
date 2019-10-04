package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employeeDao;
import model.pacient;

@WebServlet(urlPatterns = { "/updaterecord" })
public class UpdateRecord extends HttpServlet {

	private static final long serialVersionUID = 8290558137441827185L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		employeeDao dao = new employeeDao();
		String record = req.getParameter("record");
		String pacientname = req.getParameter("paciente");
		pacient paciente = dao.checkPacient(pacientname);
		paciente.setRecord(record);
		resp.sendRedirect("/web.metodista/login");
	}
}
