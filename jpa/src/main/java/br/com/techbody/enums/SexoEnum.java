package br.com.techbody.enums;

import br.com.techbody.entities.Sexo;

public enum SexoEnum {
	
	MASCULINO (1,"M"), FEMININO(2,"F");
	
	private Integer id;
	private String desc;
	
	private SexoEnum(Integer id, String desc) {
		this.id = id;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public String getDesc() {
		return desc;
	}
	
	
			
	

}
