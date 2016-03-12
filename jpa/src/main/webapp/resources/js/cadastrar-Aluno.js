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
		errorEl.append("Digite o primeiro nome do(a) aluno(a)!");
	} else if ($('#sobrenome').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite o sobrenome do(a) aluno(a)");
	} else if ($('#idade').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite a idade do(a) aluno(a)!");
	}
	else if ($('#sexo').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Selecione o sexo do(a) aluno(a)");
	}
	else if ($('#altura').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite a altura do(a) aluno(a)");
	}
	else if ($('#peso').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Selecione o peso do(a) aluno(a)");
	}
	return valid;
};

function sendToServer() {
	succesEl.empty();
	errorEl.empty()
	if (validateFields()) {
		var id = $('#id').val();
		var form = $("#form-aluno");
		var datastring = form.serialize();
		var url = "";
		if(typeof(id)=="undefined" || id==""){
			url = "inserir-aluno";
		}else {
			url = "atualiza-aluno";
		}
			
		
		$.ajax({
			type : "POST",
			url : url,
			data : datastring,
			success : function(data) {
				succesEl.show();
				succesEl.append(data.message);
				
				errorEl.hide();
				form[0].reset();
				$("#grid_alunos").bootstrapTable('refresh');
			},
			error : function(data) {
				errorEl.show();
				errorEl.append(data.message);
				succesEl.hide();
			}
		});
	}

};

function alteraAluno(value,  row, index){
	return "<a href='javascript:alterar("+JSON.stringify(row)+");'>Alterar</a>";
};

function alterar(row){	
	$('#id').val(row['id']);
	$('#nome').val(row['nome']);
	$('#sobrenome').val(row['sobrenome']);
	$('#idade').val(row['idade']);
	$('#sexo').val(row.sexo['descricao']);
	$('#altura').val(row['altura']);
	$('#peso').val(row['peso']);
};

function limpar(){
	var form = $("#form-aluno")
	form[0].reset();
};


function remover(){
	succesEl.empty();
	errorEl.empty()
	var $table = $("#grid-alunos");
	var selectionsToRemove = $table.bootstrapTable('getAllSelections');
	var listIdsToRemove = [];
	for(var i = 0; i < selectionsToRemove.length; i++){
		var row = selectionsToRemove[i];
		listIdsToRemove.push(row['id']);
	}
	if(listIdsToRemove.length > 0){
		$.ajax({
			type : "POST",
			url: "excluir-aluno",
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
};


