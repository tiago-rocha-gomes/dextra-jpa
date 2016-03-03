<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>TechBody Cadastro Endereço</title>

<!-- Bootstrap -->
<link href="resources/globais/css/bootstrap.min.css" rel="stylesheet">

<!-- jQuery (obrigatório para plugins JavaScript do Bootstrap) -->
<script src="resources/globais/js/jquery.min.js"></script>
<!-- Inclui todos os plugins compilados (abaixo), ou inclua arquivos separadados se necessário -->
<script src="resources/globais/js/bootstrap.min.js"></script>
<script src="resources/js/cadastro-endereco.js"></script>
</head>
<body>
<!-- INCLUDE DO MENU -->
<jsp:include page="menu.jsp" />

	<div class="panel panel-default">
		<div class="panel-body">
			<div class="alert alert-success" role="alert" style="font-weight: bold;">
				<!-- DIV DE MSG DE SUCESSO -->
			</div>
			<div class="alert alert-danger" role="alert" style="font-weight: bold;">
				<!-- DIV DE MSG DE ERRO -->
			</div>
			<form class="form-horizontal" id="cadastro-endereco">
				<fieldset>

					<!-- Form Name -->
					<legend>Cadastro de Endereços</legend>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="endereco">Endereço</label>
						<div class="col-md-5">
							<input id="endereco" name="endereco"
								placeholder="Digite o endereço..." class="form-control input-md"
								required="" type="text">

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="numero">Número</label>
						<div class="col-md-2">
							<input id="numero" name="numero" placeholder="n°"
								class="form-control input-md" type="number">

						</div>
					</div>

					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="bairro">Bairro</label>
						<div class="col-md-5">
							<input id="bairro" name="bairro" placeholder="Digite o bairro..."
								class="form-control input-md" type="text">

						</div>
					</div>


					<!-- Text input-->
					<div class="form-group">
						<label class="col-md-4 control-label" for="complemento">Complemento</label>
						<div class="col-md-5">
							<input id="complemento" name="complemento"
								placeholder="Digite o complemento..."
								class="form-control input-md" type="text"> <span
								class="help-block">Ap, Bloco, Quadra, Ponto de
								Referência, etc</span>
						</div>
					</div>
				</fieldset>
			</form>
			<!-- Button (Double) -->
			<div class="form-group">
				<label class="col-md-4 control-label" for="button1id"></label>
				<div class="col-md-8">
					<button onclick="sendToServer()" class="btn btn-success">Enviar</button>
					<button type="reset" class="btn btn-danger">Limpar</button>
				</div>
			</div>
		</div>
	</div>
</body>
</html>