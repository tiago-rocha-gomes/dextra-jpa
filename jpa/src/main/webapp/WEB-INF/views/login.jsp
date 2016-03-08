<head>
<!-- Bootstrap -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>TechBody</title>

<link href="resources/globais/css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
<script src="resources/globais/js/jquery.min.js"></script>
<!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
<script src="resources/globais/js/bootstrap.min.js"></script>
</head>



<!-- legend align="top">BEM VINDO À TechBody</legend-->




<div class="container">
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

				<div style="display: none" id="login-alert"
					class="alert alert-danger col-sm-12"></div>

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
							<a id="btn-login" href="#" class="btn btn-success">Login </a>
							<!--<a id="btn-fblogin" href="#" class="btn btn-primary">Login with Facebook</a>-->

						</div>
					</div>



				</form>

			</div>

		</div>
	</div>
</div>