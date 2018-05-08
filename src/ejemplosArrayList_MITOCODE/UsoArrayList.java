package ejemplosArrayList_MITOCODE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsoArrayList {

	public static void main(String[] args) {

		List<String> lista = new ArrayList();
		lista.add("Pepe");
		lista.add("Paco");
		
		lista.add(1, "Ana");
		System.out.println(lista);
		System.out.println(lista.get(2));
		
		/*****************************************************/
		
//		System.out.println("Contiene a Pepe? " + lista.contains("Pepe"));
//		System.out.println("Índice de Pepe: " + lista.indexOf("Pepe"));
//		System.out.println("Tamaño: " + lista.size());
//		lista.remove("Pepe");
////		lista.clear();
////		System.out.println("¿Está vacía? " + lista.isEmpty());
//		System.out.println(lista);
		
//		System.out.println(lista.subList(0, 1));
		
//		//A esta lista se le pueden agregar elementos
//		List<String> lis = new ArrayList<>(Arrays.asList("Celedonio", "Indalecio"));
////		System.out.println(lista.addAll(lis));
////		System.out.println(lista);
//		System.out.println(lis.addAll(lista));
//		System.out.println(lis);
		
		
		
		/*************** Convertir de array a List y viceversa *******************/ System.out.println("_______________________________");

//		//A esta lista NO se le pueden agregar elementos
//		String[] s = {"a", "b", "c"};
//		List<String> lista2 = Arrays.asList(s);
////		lista2.add("z"); //Esto da error
////		//En una sola linea:
////		List<String> lista2 = Arrays.asList("a", "b", "c");
//		System.out.println(lista2);
//		
//		
//		//En cambio, definiendola de esta forma si se le pueden agregar elementos
//		List<String> lista3 = new ArrayList<String>(Arrays.asList(s));
//		lista3.add("z");
//		System.out.println(lista3);
//		
//		
//		//De LIST a ARRAY
//		String[] s2 = (String[])lista2.toArray();
//		System.out.println(s2[0]);
//		System.out.println(s2.length);

		
		
		/**************** Ordenar un List *********************/ System.out.println("_______________________________");
		
//		String[] s3 = {"b", "c", "a"};
//		List<String> lista4 = new ArrayList<String>(Arrays.asList(s3));
//		System.out.println("lista4:" + lista4);
//		lista4.sort(null);
//		System.out.println("lista4 ordenada:" + lista4);

		
		
		/*********** Esto no se suele hacer asi *******************/ System.out.println("_______________________________");
		
//		ArrayList lis2 = new ArrayList();
//		lis2.add(1);
//		lis2.add(2);
//		System.out.println(lis2);


	}

}
