<script src="resources/js/login.js"></script>



<!-- legend align="top">BEM VINDO À TechBody</legend-->




<div class="container">
	<div class="alert alert-success" role="alert" style="font-weight: bold;">
		<!-- DIV DE MSG DE SUCESSO -->
	</div>
	
	<div class="alert alert-warning" role="alert" style="font-weight: bold;">
		<!-- DIV DE MSG DE ERRO -->
	</div>
			
	<div id="loginbox" style="margin-top: 50px;"
		class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
		<div class="panel panel-info">
			<div class="panel-heading">
				<div class="panel-title">Bem vindo a TechBody</div>
				<div
					style="float: right; font-size: 80%; position: relative; top: -10px">
					<a href="#">Esqueceu sua senha?</a>
				</div>
			</div>

			<div style="padding-top: 30px" class="panel-body">

				<form id="loginform" action="POST" class="form-horizontal"
					role="form">

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-user"></i></span> <input id="login-username"
							type="text" class="form-control" name="username" value=""
							placeholder="usuário">
					</div>

					<div style="margin-bottom: 25px" class="input-group">
						<span class="input-group-addon"><i
							class="glyphicon glyphicon-lock"></i></span> <input id="login-password"
							type="password" class="form-control" name="password"
							placeholder="senha">
					</div>

					<div style="margin-top: 10px" class="form-group">
						<!-- Button -->

						<div class="col-sm-12 controls">
							<a id="btn-login" href="#" onclick="sendToServer()" class="btn btn-success">Login </a>
						</div>
					</div>



				</form>

			</div>

		</div>
	</div>
</div>