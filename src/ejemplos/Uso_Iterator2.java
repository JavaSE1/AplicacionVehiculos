package ejemplos;

import java.util.ArrayList;
import java.util.Iterator;

public class Uso_Iterator2 {

	public static void main(String[] args) {

        ArrayList<String> listaDeNombres = new ArrayList<String>();
        listaDeNombres.add("Juan");
        listaDeNombres.add("Jos�");
        
        String cadenaBuscar = "Juan";
        System.out.println ("La cadena que buscamos es " + cadenaBuscar);
        System.out.println("listaDeNombres:" + listaDeNombres);        
 
        Iterator<String> it = listaDeNombres.iterator();
        System.out.println("it:" + it);
        String tmpAnalizando;
        
        while ( it.hasNext() ) {           
            tmpAnalizando = it.next();                
            System.out.println ("Analizando elemento... " + tmpAnalizando);
            
            if (tmpAnalizando.contains(cadenaBuscar) ) {
                it.remove();
 
            } else { }    
        } 
        System.out.println("listaDeNombres al final:" + listaDeNombres);     
	}

}
