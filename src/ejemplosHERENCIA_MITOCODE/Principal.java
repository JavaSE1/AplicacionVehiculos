package ejemplosHERENCIA_MITOCODE;

public class Principal {

	public static void main(String[] args) {

//		Perro p = new Perro();
//		p.setNombre("Kaiser");
//		p.setEdad(4);
//		p.setRaza("Pastor Alem�n");
//		p.setTipo_alimentacion("Carn�voro");
//		
//		System.out.println(p.toString());
		

//		//Sin constructores con parametros, esto no funciona 
//		Animal pe = new Perro(); //new Perro("Kaiser",3,"Carn�voro", "Pastor Alem�n");
//		pe.setNombre("Kaiser");
//		pe.setEdad(4);
//		pe.setRaza("Pastor Alem�n"); //Esto no compila
//		pe.setTipo_alimentacion("Carn�voro");
//		System.out.println(pe.toString());
		
		/*****************************************/
		
//		//Para que no se permita hacer esto (no sabemos que tipo de animal es) hay que declarar la clase como ABSTRACTA
//		Animal a = new Animal();
//		a.setNombre("Peludo");
//		a.setEdad(5);
//		a.setTipo_alimentacion("indefinida");
//		System.out.println(a.getNombre() + "-" + a.getEdad() + "-" + a.getTipo_alimentacion());
		
		
		
		
		
		
		/*****************************************/System.out.println();
		
		
		
		Perro per = new Perro("Kaiser",3,"Carn�voro", "Pastor");
//		System.out.println(per.getNombre());
//		System.out.println(per.getEdad());
//		System.out.println(per.getTipo_alimentacion());
//		System.out.println(per.getRaza());
		
		System.out.println(per.toString());
		
		
		
		
		
		
		
		
		
		
		
//		//Ahora esto si compila y funciona bien
//		Animal an = new Perro("Kaiser",3,"Carn�voro", "Pastor");
//		System.out.println(an.toString());
		
	}

}
