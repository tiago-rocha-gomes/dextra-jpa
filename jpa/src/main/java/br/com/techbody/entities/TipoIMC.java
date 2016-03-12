package br.com.techbody.entities;

import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
public class TipoIMC {

	@GeneratedValue(strategy=GenerationType.AUTO, generator="imc_gen")
	@SequenceGenerator(name = "imc_gen", sequenceName = "seq_imc")
	@Cascade(CascadeType.ALL)
	@Id
	private Long id;
	
	@Column
	private double min;
	
	@Column
	private double max;
	
	@Column
	private String decricao;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "imc")
	@Cascade(CascadeType.ALL)
	private Collection<HistoricoImc> historico;


	public TipoIMC(Long id, double min, double max, String decricao) {
		super();
		this.id = id;
		this.min = min;
		this.max = max;
		this.decricao = decricao;
	}
	
	public TipoIMC(){

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}
	
}
