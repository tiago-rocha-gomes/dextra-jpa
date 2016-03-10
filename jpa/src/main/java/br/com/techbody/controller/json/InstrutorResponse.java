package br.com.techbody.controller.json;

import java.io.Serializable;
import java.util.List;

import br.com.techbody.entities.Instrutor;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class InstrutorResponse implements Serializable{
	
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 7286297972374345795L;
		private boolean success;
		private String message;
		private List<Instrutor> instrutores;
		
		
		
		public InstrutorResponse(boolean success, String message) {
			super();
			this.success = success;
			this.message = message;
		}
		
		public InstrutorResponse(boolean success, String message,List<Instrutor> instrutores ) {
			super();
			this.success = success;
			this.message = message;
			this.instrutores = instrutores;
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
		public List<Instrutor> getAlunos() {
			return instrutores;
		}
		public void setInstrutores(List<Instrutor> instrutores) {
			this.instrutores = instrutores;
		}


		

	}

