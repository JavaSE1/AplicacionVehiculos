package ejemplosMITOCODE;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class UsoTreeMap {

	public static void main(String[] args) {

//		Map<String,String> diccionario = new TreeMap<>();
//		
//		diccionario.put("c", null);
//		diccionario.put("a", "aaa");
//		diccionario.put("b", "bbb");
//		diccionario.put("b", "bbb2"); //Si hay duplicados, se queda con el ultimo
////		diccionario.put(null, "ddd"); //No admite elementos con key = null
//		
//		
//		//Para buscar un valor:
//		System.out.println( diccionario.get("a").toString() + "\n");
//		
////		//Para ver todo el mapa:
////		System.out.println( diccionario + "\n");
//		
//		//Ver todo el mapa con un FOREACH (y ENTRY_SET)
//		for(Entry<String, String> ent: diccionario.entrySet() ) {
//			System.out.println("Clave: "+ ent.getKey() + " -> Valor: "+ent.getValue());
//		}
		
		/***********************************/ System.out.println();
		
		
		Map<Casa,String> casaTreeMap = new TreeMap<>();
		
		casaTreeMap.put(new Casa("white", 1), "bbb");
		casaTreeMap.put(new Casa("roja", 2), "aaa");
		casaTreeMap.put(new Casa("azul", 2), "ccc");
		casaTreeMap.put(new Casa("verde", 2), "bbb");
		casaTreeMap.put(new Casa("azul", 2), "eee");
		casaTreeMap.put(new Casa("azul", 1), "ggg");
		casaTreeMap.put(new Casa("amarilla", 3), "ddd");
//		casaTreeMap.put(null, null);
		
		//Ver todo el mapa con un FOREACH (y ENTRY_SET)
		for(Entry<Casa, String> ent: casaTreeMap.entrySet() ) {
			System.out.println("Clave: "
					+ ((Casa)ent.getKey()).getNombre() 
					+","+ ((Casa)ent.getKey()).getPisos() 
					+ " -> Valor: " + ent.getValue() );
		}		
	}

}
