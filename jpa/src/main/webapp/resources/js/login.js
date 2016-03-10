var succesEl, errorEl;
$(document).ready(function() {
	//Funções para serem executadas assim que a página carrega
	succesEl = $('.alert-success');
	errorEl = $('.alert-warning');

	succesEl.hide();
	errorEl.hide();
});

function validateFields() {
	succesEl.hide();
	errorEl.hide();
	var valid = true;
	if ($('#login-username').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite o usuário!");
	} else if ($('#login-password').val() === '') {
		valid = false;
		errorEl.show();
		errorEl.append("Digite a senha!");
	} 
	return valid;
};

function sendToServer() {
	succesEl.empty();
	errorEl.empty()
	if (validateFields()) {
		var form = $("#loginform");
		var datastring = form.serialize();
		$.ajax({
			type : "POST",
			url : "login",
			data : datastring,
			success : function(data) {
				succesEl.show();
				succesEl.append(data.message);
				sucess.append(datastring);
				errorEl.hide();
				form[0].reset();
			},
			error : function(data) {
				console.debug('data :: ', data);
				errorEl.show();
				errorEl.append(data.responseJSON.message);
				succesEl.hide();
			}
		});
	}

};