package ejemplosCOLECCIONES_MITOCODE;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrincipalListIterator {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();
//		List lista = new ArrayList();
		lista.add("MitoCode");
		lista.add("Suscríbete");
		lista.add("Apende fácil");
		
		/*****************************/
		
////		System.out.println(lista);
//		
////		for(Object s:lista) {
//		for(String s:lista) {
//			System.out.println(s);
//		}
		
		/******************************/
		
//		Iterator<String> it = lista.iterator();
////		System.out.println(it);
////		System.out.println(it.getClass().getName());
//		while (it.hasNext()) {
//			System.out.println("Analizando elemento... " + it.next());
//		}
        
        /******************************/
        
//		Persona a1 = new Persona();
//		a1.setId(1);
//		a1.setNombre("Pepe");
//		
//		Persona a2 = new Persona();
//		a2.setId(2);
//		a2.setNombre("Paco");
//		
//		Persona a3 = new Persona();
//		a3.setId(3);
//		a3.setNombre("Mito");
//		   
//		List<Persona> lista2 = new ArrayList<>();
//		lista2.add(a1);
//		lista2.add(a2);
//		lista2.add(a3);
		
		/**********/
//
//      //Recorremos la lista de 3 formas distintas:
//      //Forma 1
//		System.out.println(lista2);
//      
//		//Forma 2
//		for(Persona p:lista2) {
//			System.out.println(p.getNombre());
//		}
//      
//        //Forma 3
//		Iterator<Persona> it2 = lista2.iterator();
////		Iterator it2 = lista2.iterator();
////		System.out.println(it2.getClass().getName());
//        while ( it2.hasNext() ) {           
////            System.out.println ("Analizando objeto... " + ((Persona)it2.next()).getNombre());
////            System.out.println ("Analizando objeto... " + it2.next().getNombre());
//        	System.out.println ("Analizando objeto... " + it2.next());
//        }
        
        
        /*************************************/
        
//      //Intentamos eliminar elemento "Pepe" con FOREACH
//		for(Persona p:lista2) {
//			if(p.getNombre().equals("Pepe")) { //Si eliminamos a "Paco", no da error
//				lista2.remove(p);
//			}
//		}
//
//		for (Persona p : lista2) {
//			System.out.println(p.getNombre());
//		}
		
		
		/*************************************/
        
//        //Eliminamos elemento "Pepe" con ITERATOR
//        //Antes de eliminar elemento "Pepe"
//		for(Persona p:lista2) {
//			System.out.println(p.getNombre());
//		}
//        
//		Iterator<Persona> it3 = lista2.iterator();
//        while ( it3.hasNext() ) {           
//        	
//        	Persona p = it3.next();
//        	
//            if( p.getNombre().equals("Pepe") ) {
//            	it3.remove();
//                System.out.println ("Borrado objeto Pepe ");
//            }else {
//                System.out.println ("Analizando objeto... " + p.getNombre());
//            }
//        }
//        
//        //Despues de eliminar elemento "Pepe"
//		for (Persona p : lista2) {
//			System.out.println(p.getNombre());
//		}  
		
	}

}
