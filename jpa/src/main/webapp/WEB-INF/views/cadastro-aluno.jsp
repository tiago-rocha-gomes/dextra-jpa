<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<jsp:include page="menu.jsp" />
<script src="resources/globais/js/bootstrap-table.js"></script>
</head>

<body>
	<!--  formulario que o fernando tá fazendo -->
	
	<table data-toggle="table" data-url="recuperarDados.json">
    <thead>
        <tr>
            <th data-field="id">Primeiro Nome</th>
            <th data-field="name">Sobrenome</th>
            <th data-field="price">Sexo</th>
            <th data-field="price">Perfil do Treino</th>
            <th data-field="price">Valor Mensalidade</th>
            <th data-field="price">Status Débito</th>
            <th data-field="price">Status Matrícula</th>
                       								
        </tr>
    </thead>
	</table>
	
	
	
	
	
</body>
</html>