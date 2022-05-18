<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 
<!DOCTYPE html>
<html>
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous"> 
		<style>
     		<%@ include file="style.css"%>
		</style>

		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<div class ="container">
		
			<div class="row">
			
				<div class="col-12 login-content">
					<section class="form-section">
						<div class="form-wrapper">
							<form action="?action=Login"  method="post" >
						
								<div class="input-block">
									<label for="login-user">Usuário</label>
									<input id="login-user"  type="text" name="user"/>
								</div>
						
								<div class="input-block">
									<label for="login-password">Senha</label>
									<input id="login-password" type="password" name="password"/>
								</div>
								<button disabled id="btn-submit" type="submit" class="btn-login" >Login</button>
							</form>
						</div>
					</section>					
					
				</div>
				
			</div>
			
		</div>
		<script type="text/javascript">
			<%@ include file="./js/validateLogin.js" %>
		</script>
	</body>
</html>