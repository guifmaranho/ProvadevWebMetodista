package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.employeeDao;

@WebServlet(urlPatterns = { "/pacientregister" })
public class PacientRegister extends HttpServlet {

	private static final long serialVersionUID = -4855914994149928785L;
	employeeDao FUNCIONARIO = new employeeDao();

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String nome = req.getParameter("Nome");
		String telefone = req.getParameter("telefone");
		String sintomas = req.getParameter("sintomas");
		FUNCIONARIO.cadastrarPaciente(nome, telefone, sintomas);
		resp.sendRedirect("secretarylogin.jsp");
	}
}
