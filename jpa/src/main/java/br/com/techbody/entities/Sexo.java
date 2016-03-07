package br.com.techbody.entities;

import java.util.Collection;

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

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Sexo {

	@GeneratedValue(strategy=GenerationType.AUTO, generator="sexo_gen")
	@SequenceGenerator(name = "sexo_gen", sequenceName = "seq_sexo")
	@Cascade(CascadeType.ALL)
	@Id
	private Long id;
	
	public Sexo(Long id, Character descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}

	@JsonIgnore(value=true)
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "sexo")
	private Collection<Pessoa> pessoa;
	
	@Column
	private Character descricao;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Character getDescricao() {
		return descricao;
	}

	public void setDescricao(Character descricao) {
		this.descricao = descricao;
	}
}
