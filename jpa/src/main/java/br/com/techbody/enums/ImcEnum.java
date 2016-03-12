package br.com.techbody.enums;

public enum ImcEnum {
	
	MUITO_ABAIXO(1), 
	ABAIXO(2), 
	NORMAL(3),
	ACIMA(4),
	OBESIDADE_I(5),
	OBESIDADE_II(6),
	OBESIDADE_III(7);
	
	private Integer id;
	
	

	private ImcEnum(Integer id) {
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public static ImcEnum getById(Integer id){
		for(ImcEnum e: values()){
			if(e.getId() == id){
				return e;
			}
		}
		return null;
	}

	
	
}
