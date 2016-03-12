var succesEl, errorEl;
$(document).ready(function() {
	//Funções para serem executadas assim que a página carrega
	succesEl = $('.alert-success');
	errorEl = $('.alert-danger');

	succesEl.hide();
	errorEl.hide();
});

function validateFields() {
	succesEl.hide();
	errorEl.hide();
	var valid = true;
	if ($('#nome').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite o primeiro nome do(a) instrutor(a)!");
	} else if ($('#sobrenome').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite o sobrenome do(a) instrutor(a)");
	} else if ($('#idade').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite a idade do(a) instrutor(a)!");
	}
	else if ($('#sexo').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Selecione o sexo do(a) instrutor(a)");
	}
	else if ($('#salario').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite o salário do(a) instrutor(a)");
	}
	else if ($('#data_cadastro').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Selecione a data cadastro do(a) instrutor(a)");
	}
	return valid;
};

function parseDate(date){
	var day = date.getDate();
	var month = date.getMonth()+1;
	var year = date.getFullYear();
	if(day < 10){
		day = '0'+day;
	}
	if(month < 10){
		month = '0'+month;
	}
	return day + '/' + month + '/' + year;
}

function formataData(value, row, index){
	return parseDate(new Date(value));
}

function formataAlterar(value,  row, index){
	return "<a href='javascript:alterarInstrutor("+JSON.stringify(row)+");'>Alterar</a>";
};

function alterarInstrutor(row){	
	$('#id').val(row['id']);
	$('#nome').val(row['nome']);
	$('#sobrenome').val(row['sobrenome']);
	$('#idade').val(row['idade']);
	$('#sexo').val(row.sexo['descricao']);
	$('#salario').val(row['salario']);
	$('#login').val(row['usuario']);
	$('#password').val(row['senha']);
}

function limpar(){
	var form = $("#form-instrutor")
	form[0].reset();
}

function sendToServer() {
	succesEl.empty();
	errorEl.empty()
	if (validateFields()) {
		var id = $('#id').val();
		var form = $("#form-instrutor");
		var datastring = form.serialize(); 
		var url = "";
	
		
			if(typeof(id) == "undefined" || id == ""){
				url = "inserir-instrutor";
			}
			else{
				url = "atualiza-instrutor";
			}
			
			$.ajax({
				type : "POST",
				url: url,
				data : datastring,
				success : function(data) {
					succesEl.show();
					succesEl.append(data.message);
					errorEl.hide();
					form[0].reset();
					$("#grid-instrutor").bootstrapTable('refresh');
				},
				error : function(data) {
					errorEl.show();
					errorEl.append(data.message);
					succesEl.hide();
				}
			});
	}

}//sendto server
	
function remover(){
	var $table = $("#grid-instrutor");
	var selectionsToRemove = $table.bootstrapTable('getAllSelections');
	var listIdsToRemove = [];
	for(var i = 0; i < selectionsToRemove.length; i++){
		var row = selectionsToRemove[i];
		listIdsToRemove.push(row['id']);
	}
	if(listIdsToRemove.length > 0){
		$.ajax({
			type : "POST",
			url: "remover-instrutores",
			data: JSON.stringify(listIdsToRemove),
	        contentType: "application/json; charset=utf-8",
	        dataType: "json",
			success : function(data) {
				succesEl.show();
				succesEl.append(data.message);
				errorEl.hide();
				$table.bootstrapTable('refresh');
			},
			error : function(data) {
				errorEl.show();
				errorEl.append(data.message);
				succesEl.hide();
			}
		});
	}
}