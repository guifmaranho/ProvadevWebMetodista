package model;

import java.util.ArrayList;

public class employee {

	private String login;
	private String senha;
	private String tipoFunc;
	public ArrayList<String> paciente = new ArrayList<String>();
	public ArrayList<String> horario = new ArrayList<String>();

	public employee(String login, String senha, String tipo) {
		this.login = login;
		this.senha = senha;
		this.tipoFunc = tipo;
	}

	public employee(String login, String senha, String tipo, String paciente, String horario) {
		this.login = login;
		this.senha = senha;
		this.tipoFunc = tipo;
		this.setPaciente(paciente);
		this.setHorario(horario);

	}

	public employee(String login, String senha) {
		this.login = login;
		this.senha = senha;
	}

	public void setPaciente(String nome) {
		paciente.add(nome);
	}

	public void setHorario(String hora) {
		horario.add(hora);

	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipoFunc() {
		return tipoFunc;
	}

	public void setTipoFunc(String tipoFunc) {
		this.tipoFunc = tipoFunc;
	}

}
