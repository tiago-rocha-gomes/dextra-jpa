package br.com.techbody.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

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
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "aluno")
	@Cascade(CascadeType.ALL)
	private List<HistoricoImc> historico;


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
