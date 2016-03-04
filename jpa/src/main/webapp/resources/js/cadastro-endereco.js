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
	if ($('#endereco').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Informe o endereço!");
	} else if ($('#numero').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Informe o número!");
	} else if ($('#bairro').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Informe o bairro!");
	}
	return valid;
};

function sendToServer() {
	succesEl.empty();
	errorEl.empty()
	if (validateFields()) {
		var form = $("#cadastro-endereco");
		var datastring = form.serialize();
		$.ajax({
			type : "POST",
			url : "cadastrar-endereco",
			data : datastring,
			success : function(data) {
				succesEl.show();
				succesEl.append(data.message);
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