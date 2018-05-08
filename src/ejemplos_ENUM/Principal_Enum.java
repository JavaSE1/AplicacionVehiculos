package ejemplos_ENUM;

public class Principal_Enum {

	public static void main(String[] args) {

		Talla s = Talla.MINI;
		
		Talla la_talla = Enum.valueOf(Talla.class, "MINI");
		
		System.out.println("la_talla: " + la_talla);
		System.out.println("la_talla.getAbreviatura(): " + la_talla.getAbreviatura());
	}

}
