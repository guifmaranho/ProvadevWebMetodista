<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
<title>Login Secretária</title>
</head>
<body>
	<header class="title">Hospital Meto</header>
	<h1 class="titulopagina">Olá ${secretaria}</h1>
	<section class="container">
		<section class="paciente">
			<div class="formPaciente">
				<h2 class="title">Cadastrar Paciente</h1>
				<form class="formPaciente" action="pacientregister" method="Post">
					<label>Nome: <input type="text" name="Nome"
						placeholder="Paciente" required />
					</label> <label>Telefone: <input type="tel" name="phone"
						placeholder="Contato" required />
					</label> <label>Sintomas: <textarea name="sintomas" rows="10"
							cols="30"></textarea>
					</label>

					<button>Cadastrar</button>
				</form>
			</div>
		</section>
		<section class="agenda">
			<div class="Agenda">
				<h2 class="title">Agendar Consulta</h1>
				<form class="Agenda" action="schedulePacient" method="post">
					<label>Médico: <input type="text" name="medico"
						placeholder="Medico" required />
					</label> <label>Paciente: <input type="text" name="paciente"
						placeholder="Paciente" required />
					</label> <label>Data: <input class="date" type="datetime-local"
						name="date" min="2019-01-01" required />
					</label>
					<button>Agendar</button>
				</form>
			</div>
		</section>
	</section>
	<button>
		<a href=index.jsp>Sair</a>
	</button>
</body>
</html>