package ejemplosMITOCODE;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UsoHashMap {

	public static void main(String[] args) {

//		Se puede hacer de varias formas:
//		Map diccionario = new HashMap<>();
//		HashMap diccionario = new HashMap<>();
//		HashMap<String,String> diccionario = new HashMap<>();
		
//		Pero lo normal es hacerlo asi
		Map<String,String> diccionario = new HashMap<>();
		diccionario.put("c", null);
		diccionario.put("a", "aaa");
		diccionario.put("b", "bbb");
		diccionario.put("b", "bbb2"); //Si hay duplicados, se queda con el ultimo
		diccionario.put(null, "ddd");
//		diccionario.put(null, null); //Esto es un duplicado de la linea anterior
		
////		//Para buscar un valor:
//		String contenido = diccionario.get("a").toString();
//		String contenido2 = String.valueOf(diccionario.get("a"));
//		String contenido3 = (String)diccionario.get("a");
//		
//		System.out.println( diccionario.get("a")); //Si se imprime, no hace falta convertirlo a STRING
//		System.out.println(diccionario);
		
		
		/***************** CONTAINS **************************/System.out.println("______________________________");
		
//		boolean existe = diccionario.containsKey("b");
//		System.out.println("existe clave 'b' :" + existe);
//		existe = diccionario.containsValue("bbb2");  //Si ponemos bbb, dice que no existe
//		System.out.println("existe valor 'bbb2' :" + existe);
		
		
//		/*****************************************************/System.out.println("______________________________");
//		
//		diccionario.clear();
//		System.out.println("isEmpty? " + diccionario.isEmpty());
//		System.out.println("size: " + diccionario.size());
//		System.out.println(diccionario);
		
		
		/*****************************************************/System.out.println("______________________________");
		diccionario.remove("b");
//		
////		//Forma 1: Ver todo el mapa		
//		System.out.println(diccionario + "\n");
//		
//		
		//Forma 2: Ver todo el mapa con lambda
//		diccionario.forEach( (x,y) -> System.out.println("Elemento: " + x+ "-" +y) 		);
//		
//		
		/*Forma 3: Ver todo el mapa con un FOREACH (y KEYSET) */System.out.println();
//		for(String ent: diccionario.keySet() ) {
//			System.out.println("Clave: "+ ent + " -> Valor: " + diccionario.get(ent) );
//		}
		
		
		/*Forma 4: Ver todo el mapa con un FOREACH (y ENTRYSET)*/  System.out.println(); 
//		for(Entry<String, String> ent: diccionario.entrySet() ) {
//			System.out.println("Clave: "+ ent.getKey() + " -> Valor: " + ent.getValue() );
//		}		
		
		
		/*Forma 5: Ver todo el mapa con ITERATOR (y KEYSET) */System.out.println();
//		Iterator it = diccionario.keySet().iterator();
////		System.out.println(it.getClass().getName());
//		while (it.hasNext()) {
//			String key = (String) it.next();
//			System.out.println("Clave: "+ key + " -> Valor: " + diccionario.get(key) );
//		}
		
		
		/*Forma 6: Ver todo el mapa con un ITERATOR (y ENTRYSET) */ System.out.println();
		Iterator<Entry<String,String>> it2 = diccionario.entrySet().iterator();
//		System.out.println(it.getClass().getName());
		while (it2.hasNext()) {
			Entry<String, String> ent = (Entry<String, String>) it2.next();
			System.out.println("Clave: "+ ent.getKey() + " -> Valor: " + ent.getValue() );
		}
		
		
		/***********************************/
		
//		//Del video 16 (java avanzado)
//		Map<Casa,String> casaMap = new HashMap<>();
//		
//		casaMap.put(new Casa("white", 1), "bbb");
//		casaMap.put(new Casa("roja", 2), "aaa");
//		casaMap.put(new Casa("azul", 2), "ccc");
//		casaMap.put(new Casa("verde", 2), "bbb");
//		casaMap.put(new Casa("azul", 2), "ccc");
//		casaMap.put(new Casa("amarilla", 3), "ddd");
////		casaMap.put(null, null);
//		
//		//Ver todo el mapa con un FOREACH (y ENTRY_SET)
//		for(Entry<Casa, String> ent: casaMap.entrySet() ) {
//			System.out.println("Clave: "+ ((Casa)ent.getKey()).getNombre() +","+ ((Casa)ent.getKey()).getPisos() + " -> Valor: " + ent.getValue() );
//		}
		
		
	}
}
