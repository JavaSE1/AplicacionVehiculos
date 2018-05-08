package ejemplos_ENUM;

public enum Talla {
	
	MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
	
	private String abreviatura;

	private Talla(String abreviatura) {
		this.abreviatura = abreviatura;
	}

	public String getAbreviatura() {
		return abreviatura;
	}

//	public void setAbreviatura(String abreviatura) {
//		this.abreviatura = abreviatura;
//	}
	
	
}
