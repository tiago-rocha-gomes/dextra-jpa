package br.com.techbody.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
@DiscriminatorValue(value="A")
public class Aluno extends Pessoa{
	
	@GeneratedValue(strategy=GenerationType.AUTO, generator="aluno_gen")
	@SequenceGenerator(name = "aluno_gen", sequenceName = "seq_aluno")
	@Id
	private Long id;
	
	@Column
	private double peso;
	
	@Column
	private double altura;
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Column
	private String login;
	
	@Column
	private String senha;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}


	/*
	As colunas abaixo serão FKs de tabelas (entidades)
	@Column
	//TODO
	private Matricula matricula;
	
	@Column
	//TODO
	private SituacaoDebito situacaoDebito;
	
	@Column
	//TODO
	private PerfilTreino perfilTreino;*/
	
	
}
