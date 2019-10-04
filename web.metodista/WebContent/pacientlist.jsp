<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, model.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<h1>Cadastro de pacientes - Hospital Meto</h1>
	<section class="horarioLista">
		<table class="listaDePacientes" style="border: 1px solid black">
			<thead>
				<tr>
					<th>Pacientes</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="lista" items="${listaP}">
					<tr>
						<td class="pacientlist"><c:out value="${lista.nome}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
<button><a href=/web.metodista/login>Voltar.</a></button>
</html>