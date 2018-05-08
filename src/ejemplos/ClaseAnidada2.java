package ejemplos;

import ejemplos.ClaseAnidada1.ClaseInterna;

public class ClaseAnidada2 {

	public static void main(String[] args) {

		ClaseInterna ci = new ClaseAnidada1().new ClaseInterna();
		ci.saludar();
	}

}
