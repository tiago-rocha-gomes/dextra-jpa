package br.com.techbody.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class HistoricoImc {

	@GeneratedValue(strategy=GenerationType.AUTO, generator="sexo_gen")
	@SequenceGenerator(name = "sexo_gen", sequenceName = "seq_sexo")
	@Cascade(CascadeType.ALL)
	@Id
	private Long id;
	
	@Column
	private double valorIMC;
	
	@Column
	private Date dataCalculo;
	
	@Column
	private double ImcAtual;
	
	@JsonIgnore(value=true)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "alunoId", insertable = true, updatable = true)
	private Aluno aluno;
	
	@JsonIgnore(value=true)
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "imcId", insertable = true, updatable = true)
	private TipoIMC imc;
	
	public HistoricoImc(){
		
	}

	public HistoricoImc(Long id, double valorIMC, Date dataCalculo,
			double iMCatual, Aluno aluno, TipoIMC imc) {
		super();
		this.id = id;
		this.valorIMC = valorIMC;
		this.dataCalculo = dataCalculo;
		ImcAtual = iMCatual;
		this.aluno = aluno;
		this.imc = imc;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getValorIMC() {
		return valorIMC;
	}

	public void setValorIMC(double valorIMC) {
		this.valorIMC = valorIMC;
	}

	public Date getDataCalculo() {
		return dataCalculo;
	}

	public void setDataCalculo(Date dataCalculo) {
		this.dataCalculo = dataCalculo;
	}

	public double getIMCatual() {
		return ImcAtual;
	}

	public void setImcAtual(double ImcAtual) {
		this.ImcAtual = ImcAtual;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public TipoIMC getImc() {
		return imc;
	}

	public void setImc(TipoIMC imc) {
		this.imc = imc;
	}
	
	
	
}
