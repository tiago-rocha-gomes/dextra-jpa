<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Aluno</title>
<jsp:include page="menu.jsp" />
<script src="resources/globais/js/bootstrap-table.js"></script>
<script src="resources/globais/js/bootstrap-table-flat-json.js"></script>
 

</head>

<body>
<script src="resources/js/cadastrar-Aluno.js"></script>
<div class="panel panel-default">
	<div class="panel-body">
		<div class="alert alert-success" role="alert" style="font-weight: bold;">
			<!-- DIV DE MSG DE SUCESSO -->
		</div>
		<div class="alert alert-danger" role="alert" style="font-weight: bold;">
			<!-- DIV DE MSG DE ERRO -->
		</div>
	<!-- !!!!!!!!!!!!!!!!!!!!AQUI COMEÇA O FORMULÁRIO DE CADASTRO DE ALUNOS!!!!!!!!!!!!!!!!!!!!!!!-->
	
<form class="form-horizontal" id="form-aluno" >
<fieldset>

<!-- Form Name -->
<legend>Cadastro de Aluno</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nome">Nome</label>  
  <div class="col-md-5">
  <input id="nome" name="nome" placeholder="Nome do aluno..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="sobrenome">Sobrenome</label>  
  <div class="col-md-5">
  <input id="sobrenome" name="sobrenome" placeholder="Sobrenome do aluno..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="idade">Idade</label>  
  <div class="col-md-4">
  <input id="idade" name="idade" placeholder="Idade do Aluno..." class="form-control input-md"  type="text">
    
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
  <label class="col-md-4 control-label" for="altura">Altura</label>  
  <div class="col-md-2">
  <input id="altura" name="altura" placeholder="Altura do Aluno..." class="form-control input-md"  type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="peso">Peso</label>  
  <div class="col-md-2">
  <input id="peso" name="peso" placeholder="Peso do Aluno..." class="form-control input-md"  type="text">
    
  </div>
</div>



</fieldset>
</form>
<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="button1id"></label>
  <div class="col-md-8">
    <button id="button1id" onclick="sendToServer()" name="button1id" class="btn btn-success">Salvar</button>
    <button id="button2id" name="button2id" onclick="limpar()" class="btn btn-danger">Limpar</button>
  </div>   
</div>   
</div>
	</div>
	
<!-- !!!!!!!!!!!!!!!!!!!!TERMINA AQUI O FORMULÁRIO DE CADASTRO DE ALUNOS!!!!!!!!!!!!!!!!!!!!!!!!!-->

<!--  Grid de consulta alunos -->
	<div  class="container" >
	<table data-toggle="table" data-pagination="true" data-page-size="5" data-page-list="[10,15,30]" id="grid_alunos" data-url="consulta-alunos" data-click-to-select="true">
    <thead>
        <tr>
         	<th data-field="state"  data-checkbox="true" ></th>
            <th data-field="id" >Id</th>
            <th data-field="nome" >Primeiro Nome</th>
            <th data-field="sobrenome" >Sobrenome</th>
            <th data-field="sexo.descricao" >Sexo</th>
            <th data-field="perfil_treino" >Perfil do Treino</th>
            <th data-field="vlr_mensalidade" >Valor Mensalidade</th>
            <th data-field="status_debito" >Status Débito</th>
            <th data-field="status_matricula" >Status Matrícula</th>
            <th data-formatter="alteraAluno"></th>
        </tr>
    </thead>
	</table>
	</div>


	
</body>
</html>