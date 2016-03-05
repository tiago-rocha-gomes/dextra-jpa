<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Cadastro de Aluno</title>


<!--  JQUERY-UI (only sortable and datepicker is needed) -->
<link rel="stylesheet" type="text/css" href="/path/to/jquery-ui.min.css">
<script type="text/javascript" src="/path/to/jquery-ui.min.js"></script>
<!--  if timepicker is used in filters -->
<link rel="stylesheet" type="text/css" href="/path/to/jquery-ui-timepicker-addon.min.css"/>
<script type="text/javascript" src="/path/to/jquery-ui-timepicker-addon.min.js"></script>
<!--  if touch event support is needed (mobile devices) -->
<script type="text/javascript" src="/path/to/jquery.ui.touch-punch.min.js"></script>
  
<!--  PAGINATION plugin -->
<link rel="stylesheet" type="text/css" href="/path/to/jquery.bs_pagination.min.css">
<script type="text/javascript" src="/path/to/jquery.bs_pagination.min.js"></script>
<script type="text/javascript" src="/path/to/bs_pagination/localization/en.min.js"></script>
 
<!--  FILTERS plugin --> 
<link rel="stylesheet" type="text/css" href="/path/to/jquery.jui_filter_rules.bs.min.css">
<script type="text/javascript" src="/path/to/jquery.jui_filter_rules.min.js"></script>
<script type="text/javascript" src="/path/to/jui_filter_rules/localization/en.min.js"></script>
<!--  required from filters plugin -->
<script type="text/javascript" src="/path/to/moment.min.js"></script>
 
<!--  DATAGRID plugin -->
<link rel="stylesheet" type="text/css" href="/path/to/jquery.bs_grid.min.css">
<script type="text/javascript" src="/path/to/jquery.bs_grid.min.js"></script>
<script type="text/javascript" src="/path/to/bs_grid/localization/en.min.js"></script>
</head>
<jsp:include page="menu.jsp" />
<body>
	
	<!-- !!!!!!!!!!!!!!!!!!!!AQUI COMEÇA O FORMULÁRIO DE CADASTRO DE ALUNOS!!!!!!!!!!!!!!!!!!!!!!!-->
	
	<form class="form-horizontal">
<fieldset>

<!-- Form Name -->
<legend>Cadastro de Aluno</legend>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="nome">Nome</label>  
  <div class="col-md-5">
  <input id="nome" name="nome" placeholder="Nome do aluno..." class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="sobrenome">Sobrenome</label>  
  <div class="col-md-5">
  <input id="sobrenome" name="sobrenome" placeholder="Sobrenome do aluno..." class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="idade">Idade</label>  
  <div class="col-md-4">
  <input id="idade" name="idade" placeholder="Idade do Aluno..." class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Select Basic -->
<div class="form-group">
  <label class="col-md-4 control-label" for="sexo">Sexo</label>
  <div class="col-md-4">
    <select id="sexo" name="sexo" class="form-control">
      <option value="M">Masculino</option>
      <option value="F">Feminio</option>
    </select>
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="altura">Altura</label>  
  <div class="col-md-2">
  <input id="altura" name="altura" placeholder="Altura do Aluno..." class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="peso">Peso</label>  
  <div class="col-md-2">
  <input id="peso" name="peso" placeholder="Peso do Aluno..." class="form-control input-md" required="" type="text">
    
  </div>
</div>

<!-- Button (Double) -->
<div class="form-group">
  <label class="col-md-4 control-label" for="button1id"></label>
  <div class="col-md-8">
    <button id="button1id" name="button1id" class="btn btn-success">Salvar</button>
    <button id="button2id" name="button2id" class="btn btn-danger">Limpar</button>
  </div>
</div>

</fieldset>
</form>
	
<!-- !!!!!!!!!!!!!!!!!!!!TERMINA AQUI O FORMULÁRIO DE CADASTRO DE ALUNOS!!!!!!!!!!!!!!!!!!!!!!!!!-->
	<div id="demo_grid1"></div>
	
</body>
</html>