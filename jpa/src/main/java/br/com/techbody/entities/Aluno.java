package br.com.techbody.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="A")
public class Aluno extends Pessoa{
	
	
	@Column
	private double peso;
	
	@Column
	private double altura;

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
