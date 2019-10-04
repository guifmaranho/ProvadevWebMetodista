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
	<h1>Consultas agendadas - ${medico}</h1>
	<button><a href=/web.metodista/logout>Sair</a></button>
	<button><a href=/web.metodista/pacientlist>Pacientes</a></button>
	<section class="horarioLista">
		<table class="tabelaAgenda" style="border: 1px solid black">
			<thead>
				<tr>
					<th>Consultas</th>
					<th>Ficha</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="horario" items="${horarios}">
					<tr>
						<td class="listaConsulta"><c:out value="${horario}" /></td>
						<td class="index.css"><a
							href=/web.metodista/record?horario= <c:out value="${horario}"/>>record</a></td>
						<td class="index.css"><a
							href=/web.metodista/delete?medico=${medico}&horario=
							<c:out value="${horario}"/>>RemoverTest.</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
<button><a href=index.jsp>Voltar</a></button>
</html>