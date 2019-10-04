<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css" href="index.css">
</head>
<body>
	<section class="container">
		<div class="form-login">
			<header class="title">Hospital Meto</header>
			<h2 class="title">Faça login ou cadastre-se</h2>
			<form class="login" action="login" method="post">
				<label>Login: <input type="text" name="login"
					placeholder="Usuario" required />
				</label> <label>Senha: <input type="password" name="senha"
					placeholder="Senha" required />
				</label>
				<button><a>Entrar</a></button>
				<button><a href=register.jsp>Cadastrar</a></button>
			</form>
		</div>
	</section>
</body>
</html>