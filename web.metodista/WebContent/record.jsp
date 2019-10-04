<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, model.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
<title>record - ${paciente.nome}</title>
<a>href=/web.metodista/logout>Sair</a>
</head>
<body>
	<h1 class="nome">${paciente.nome}</h1>
	<br>
	<label class="sintoma">Sintomas: ${paciente.sintomas}</label>
	<br>
	<form class="record" action="atualizarrecord" method="post">
		<input type="hidden" name="paciente" value="${paciente.nome }" /> <label>record:
			<textarea name="record" rows="10" cols="60"> ${paciente.record}</textarea>
		</label>
		<button>
			<br>Enviar/Atualizar<br>
		</button>
	</form>
</body>
<button><a href=index.jsp>Voltar ao inicio</a></button>
</html>