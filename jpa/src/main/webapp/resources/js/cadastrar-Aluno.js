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
		var form = $("#form-aluno");
		var datastring = form.serialize();
		$.ajax({
			type : "POST",
			url : "inserir-aluno",
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
	console.debug(arguments);
	return "<a href='javascript:alterar("+JSON.stringify(row)+");'>Alterar</a>";
};

function alterar(row){	
	$('#nome').val(row['nome']);
	$('#sobrenome').val(row['sobrenome']);
	$('#idade').val(row['idade']);
	$('#id').val(row.sexo['id']);
	$('#altura').val(row['altura']);
	$('#peso').val(row['peso']);
	console.debug(row['nome']);
	console.debug(row);	
}

function limpar(){
	var form = $("#form-aluno")
	form[0].reset();
}



