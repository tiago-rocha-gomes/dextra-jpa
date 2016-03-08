package br.com.techbody.entities;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Instrutor extends Pessoa {

	@Column
	private double salario;

	@Column
	private String usuario;

	@Column
	private String senha;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
