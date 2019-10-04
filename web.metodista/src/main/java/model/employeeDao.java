package model;

import java.util.ArrayList;
import java.util.List;
import model.employee;

public class employeeDao {
	private static List<employee> employee = new ArrayList<employee>();
	public static List<pacient> pacients = new ArrayList<pacient>();
	static {
		try {
			employee.add(new employee("Teste", "1234", "Secretaria", "", ""));
			employee.add(new employee("gui", "1234", "Medico", "paciente01", "01/01/2020 09:00"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void cadastrarSecretaria(String login, String pw) {
		employee.add(new employee(login, pw, "Secretaria"));
	}

	public void cadastrarMedico(String login, String pw) {
		employee.add(new employee(login, pw, "Medico"));
	}

	public void cadastrarPaciente(String name, String phone, String symptoms) {
		pacients.add(new pacient(name, phone, symptoms, ""));
	}

	public void removerConsulta(String doctorlogin, String pacient) {
		if (!pacient.equals("Sem")) {
			for (employee f : employee)
				if (f.getLogin().equals(doctorlogin)) {
					int i = f.paciente.indexOf(pacient);
					f.paciente.remove(i);
					f.horario.remove(i);
				}
		}
	}

	public void agendarConsulta(String doctor, String pacients, String time) {
		for (employee f : employee)
			if (f.getLogin().equals(doctor)) {
				f.setPaciente(pacients);
				f.setHorario(time);
			}
	}

	public ArrayList<String> checkPacients(String doctorName) {
		ArrayList<String> agendamento = new ArrayList<String>();
		for (employee f : employee)
			if (f.getLogin().equals(doctorName)) {
				if (f.paciente != null && f.paciente.size() > 0) {
					agendamento = f.paciente;
				} else {
					agendamento.add("Sem pacientes.");
				}
			}
		return agendamento;
	}

	public pacient checkPacient(String pacientName) {
		for (pacient p : pacients) {
			if (p.getName().equals(pacientName)) {
				return p;
			}
		}
		return null;
	}

	public ArrayList<String> checkTime(String doctorName) {
		ArrayList<String> agendamento = new ArrayList<String>();
		for (employee f : employee)
			if (f.getLogin().equals(doctorName)) {
				if (f.horario != null && f.horario.size() > 0) {
					for (int i = 0; i < f.paciente.size(); i++) {
						agendamento.add(f.paciente.get(i) + " - " + f.horario.get(i));
					}
				} else {
					agendamento.add("Sem consultas.");
				}
			}
		return agendamento;
	}

	public employee verificarLogin(String login, String senha) {
		employee funcionario = null;
		for (employee f : employee) {
			String logins = f.getLogin();
			String senhas = f.getSenha();

			if (logins.equals(login) && senhas.equals(senha)) {
				funcionario = f;
			}
		}
		if (funcionario == null) {
			funcionario = new employee("1", "1", "1", "1", "1");
		}
		return funcionario;
	}
}
