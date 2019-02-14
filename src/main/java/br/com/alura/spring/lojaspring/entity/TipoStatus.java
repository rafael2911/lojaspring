package br.com.alura.spring.lojaspring.entity;

public enum TipoStatus {
	ATIVO("ATIVO"), INATIVO("INATIVO");
	
	private String desc;
	
	private TipoStatus(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
