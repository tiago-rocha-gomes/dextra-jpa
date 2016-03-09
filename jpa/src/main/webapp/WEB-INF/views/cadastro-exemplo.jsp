<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>

<!-- INCLUDE DO MENU -->
<jsp:include page="menu.jsp" />
<body>
<!-- JAVASCRIPT DA PÁGINA AQUI -->
<script src="resources/js/cadastro-endereco.js"></script>


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