package br.com.techbody.controller.json;

import java.io.Serializable;
import java.util.List;

import br.com.techbody.entities.Aluno;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown=true)
public class AlunoResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private boolean success;
	private String message;
	private List<Aluno> alunos;
	
	
	
	public AlunoResponse(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	
	public AlunoResponse(boolean success, String message,List<Aluno> alunos ) {
		super();
		this.success = success;
		this.message = message;
		this.alunos = alunos;
	}
	

	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}


	

}