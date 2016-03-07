package br.com.techbody.enums;

import br.com.techbody.entities.Sexo;

public enum SexoEnum {
	
	MASCULINO (1,'M'), FEMININO(2,'F');
	
	private Integer id;
	private Character desc;
	
	private SexoEnum(Integer id, Character desc) {
		this.id = id;
		this.desc = desc;
	}

	public Integer getId() {
		return id;
	}

	public Character getDesc() {
		return desc;
	}
	
	public static Sexo generateSexoEntity(SexoEnum sexo){
			return new Sexo(Long.valueOf(sexo.getId()), sexo.getDesc());
	}
			
	public static SexoEnum getByDesc(Character sexo){
		for(SexoEnum s: values()){
			if (s.getDesc().equals(sexo)){
				return s;
			}
		}
		return null;
	}

}
