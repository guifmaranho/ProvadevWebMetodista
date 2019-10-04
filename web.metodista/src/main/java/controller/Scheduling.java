package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.employeeDao;

@WebServlet(urlPatterns = { "/pacientschedule" })
public class Scheduling extends HttpServlet {

	private static final long serialVersionUID = -4727726527910061931L;
	employeeDao dao = new employeeDao();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		if (session.getAttribute("secretaria") != null) {
			String medico = req.getParameter("medico");
			String paciente = req.getParameter("paciente");
			String horario = req.getParameter("agenda");
			if (dao.checkPacient(paciente) == null) {
			} else {
				dao.agendarConsulta(medico, paciente, horario);
			}
			resp.sendRedirect("secretarylogin.jsp");
		} else {
			resp.sendRedirect("index.jsp");
		}
	}
}