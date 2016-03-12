<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Instrutor</title>
<jsp:include page="menu.jsp" />
<script src="resources/globais/js/bootstrap-table.js"></script>
<script src="resources/globais/js/bootstrap-table-flat-json.js"></script>
 

</head>

<body>
<script src="resources/js/cadastrar-Instrutor.js"></script>
<div class="panel panel-default">
	<div class="panel-body">
		<div class="alert alert-success" role="alert" style="font-weight: bold;">
			<!-- DIV DE MSG DE SUCESSO -->
		</div>
		<div class="alert alert-danger" role="alert" style="font-weight: bold;">
			<!-- DIV DE MSG DE ERRO -->
		</div>
	<!-- !!!!!!!!!!!!!!!!!!!!AQUI COMEÇA O FORMULÁRIO DE CADASTRO DE INSTRUTOR!!!!!!!!!!!!!!!!!!!!!!!-->
	
<form class="form-horizontal" id="form-instrutor">
<fieldset>

<!-- Form Name -->
<legend>Cadastro de Instrutor</legend>




 
  <input  id="id" name="id"  class="form-control input-md"  type="hidden">
    






<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nome">Nome</label>  
  <div class="col-md-5">
  <input id="nome" name="nome" placeholder="Nome do instrutor..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="sobrenome">Sobrenome</label>  
  <div class="col-md-5">
  <input id="sobrenome" name="sobrenome" placeholder="Sobrenome do instrutor..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="idade">Idade</label>  
  <div class="col-md-4">
  <input id="idade" name="idade" placeholder="Idade do instrutor..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="sexo">Sexo</label>
  <div class="col-md-4">
    <select id="sexo" name="sexo" class="form-control">
      <option value="M">Masculino</option>
      <option value="F">Feminino</option>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="salario">Salário</label>  
  <div class="col-md-2">
  <input id="salario" name="salario" placeholder="Salário do instrutor..." class="form-control input-md"  type="text">
    
  </div>
</div>


<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="login">Login</label>  
  <div class="col-md-2">
  <input id="login" name="login" placeholder="Login..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="senha">Senha</label>  
  <div class="col-md-2">
  <input type="password" id="senha" name="senha" placeholder="Senha..." class="form-control input-md"  type="text">
    
  </div>
</div>

</fieldset>
</form>
<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="button1id"></label>
  <div class="col-md-8">
    <button id="button1id" onclick="sendToServer()" name="button1id" class="btn btn-success">Salvar</button>
    <button id="button2id" onclick="limpar()" name="button2id" class="btn btn-danger">Limpar</button>
  </div>   
</div>   
</div>
	</div>
	
<!-- !!!!!!!!!!!!!!!!!!!!TERMINA AQUI O FORMULÁRIO DE CADASTRO DE INSTRUTOR!!!!!!!!!!!!!!!!!!!!!!!!!-->

<!--  Grid de consulta alunos -->
	<div  class="container">
		<button 
			id="btnRemover" 
			onclick="remover()" 
			name="btnRemover" 
			class="btn btn-danger">Remover</button>
	
		<table 
			data-toggle="table" 
			data-pagination="true" 
			data-page-size="5" 
			data-page-list="[10,15,30]" 
			data-url="consulta-instrutores" 
			data-click-to-select="true"
			id="grid-instrutor"
		>
	    <thead>
	        <tr>
	         	<th data-field="state" data-checkbox="true" ></th>
	            <th data-field="id" data-visible="false">ID</th>
	            <th data-field="nome" >Nome</th>
	            <th data-field="sobrenome" >Sobrenome</th>
	            <th data-field="sexo.descricao" >Sexo</th>
	            <th data-field="salario" >Salario</th>
	            <th data-field="usuario" >Login</th>
	            <th data-field="dataCadastro" data-formatter="formataData">Data Cadastro</th>
	            <th data-formatter="formataAlterar"></th>
	        </tr>
	    </thead>
		</table>
	</div>
</body>
</html>