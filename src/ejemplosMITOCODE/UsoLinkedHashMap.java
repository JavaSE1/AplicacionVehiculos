package ejemplosMITOCODE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UsoLinkedHashMap {

	public static void main(String[] args) {

//		Map<String,String> diccionario = new LinkedHashMap<>();
//		diccionario.put("a", "aaa");
//		diccionario.put("c", null);
//		diccionario.put("b", "bbb");
//		diccionario.put("b", "bbb2"); //Si hay duplicados, se queda con el ultimo
//		diccionario.put(null, "ddd"); //Si que admite elementos con key = null
//		
//		//Para buscar un valor:
//		System.out.println( diccionario.get("a").toString() + "\n");
//		
//		//Para ver todo el mapa:
//		System.out.println( diccionario + "\n");
		
		/************************************************/
		
		Map<Casa,String> casas = new LinkedHashMap<>();
		casas.put(new Casa("Azul", 4), "ddd");
		casas.put(new Casa("Roja", 3), "ccc");
		casas.put(new Casa("Amarilla", 4), "bbb");
		casas.put(new Casa("Azul", 4), "aaa");
		
		
		
//		//Ver todo el mapa con ITERATOR
//		Iterator it = casas.keySet().iterator();
//		while (it.hasNext()) {
//			Casa key = (Casa)it.next();
//			System.out.println("Clave: "+ key 
//					+ " -> Valor: " + casas.get(key) );
//		}	
		
		System.out.println();
		
//		//Ver todo el mapa con un FOREACH (y ENTRY_SET)
//		for(Entry<Casa, String> ent: casas.entrySet() ) {
//			System.out.println("Clave: "+ ent.getKey().getNombre() + " -> Valor: " + ent.getValue() );
//		}
		
		/****************************************/
		
		//Forma indirecta de ordenar una LINKED LIST
		System.out.println("\nCasas ordenadas por nombre y pisos:");
	    Map<Casa,String> sortedCasas = new TreeMap<Casa,String>(casas);
	    
		//Ver todo el mapa con un FOREACH (y ENTRY_SET)
		for(Entry<Casa, String> ent: sortedCasas.entrySet() ) {
			System.out.println("Clave: "+ ent.getKey().getNombre() + " -> Valor: " + ent.getValue() );
		}

	    
	    
//	    List sortedList = new ArrayList( diccionario );
//	    Collections.sort(sortedList);
		
	}

}
