package ejemplosHERENCIA_MITOCODE;

public class Principal {

	public static void main(String[] args) {

//		Perro p = new Perro();
//		p.setNombre("Kaiser");
//		p.setEdad(4);
//		p.setRaza("Pastor Alemán");
//		p.setTipo_alimentacion("Carnívoro");
//		
//		System.out.println(p.toString());
		

//		//Sin constructores con parametros, esto no funciona 
//		Animal pe = new Perro(); //new Perro("Kaiser",3,"Carnívoro", "Pastor Alemán");
//		pe.setNombre("Kaiser");
//		pe.setEdad(4);
//		pe.setRaza("Pastor Alemán"); //Esto no compila
//		pe.setTipo_alimentacion("Carnívoro");
//		System.out.println(pe.toString());
		
		/*****************************************/
		
//		//Para que no se permita hacer esto (no sabemos que tipo de animal es) hay que declarar la clase como ABSTRACTA
//		Animal a = new Animal();
//		a.setNombre("Peludo");
//		a.setEdad(5);
//		a.setTipo_alimentacion("indefinida");
//		System.out.println(a.getNombre() + "-" + a.getEdad() + "-" + a.getTipo_alimentacion());
		
		
		
		
		
		
		/*****************************************/System.out.println();
		
		
		
		Perro per = new Perro("Kaiser",3,"Carnívoro", "Pastor");
//		System.out.println(per.getNombre());
//		System.out.println(per.getEdad());
//		System.out.println(per.getTipo_alimentacion());
//		System.out.println(per.getRaza());
		
		System.out.println(per.toString());
		
		
		
		
		
		
		
		
		
		
		
//		//Ahora esto si compila y funciona bien
//		Animal an = new Perro("Kaiser",3,"Carnívoro", "Pastor");
//		System.out.println(an.toString());
		
	}

}
