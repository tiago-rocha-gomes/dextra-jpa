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

function sendToServer() {
	succesEl.empty();
	errorEl.empty()
	if (validateFields()) {
		var form = $("#form-instrutor");
		var datastring = form.serialize();
		$.ajax({
			type : "POST",
			url : "inserir-instrutor",
			data : datastring,
			success : function(data) {
				succesEl.show();
				succesEl.append(data.message);
				sucess.append(datastring);
				errorEl.hide();
				form[0].reset();
			},
			error : function(data) {
				errorEl.show();
				errorEl.append(data.message);
				succesEl.hide();
			}
		});
	}

};