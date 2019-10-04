<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cadastro</title>
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<section class="container">
		<h1>Cadastro de Usuário</h1>
		<h2>Secretária - Médico</h2>
		<form class="register" action="register" method="POST">
			<label>Usuário: <input type="text" name='login'
				placeholder="Usuário" required />
			</label> <label>Senha: <input type='password' name='senha'
				placeholder='Senha' required />
			</label> <input type='radio' class="radiobut" name='tipoFunc' value='medico'>
			Médico<br> <input type='radio' class="radiobut" name='tipoFunc'
				value='Secretaria'> Secretária <br>
			<button><a>Incluir</a></button>
		</form>
	</section>
</body>
<button><a href=index.jsp>Voltar</a></button>
</html>