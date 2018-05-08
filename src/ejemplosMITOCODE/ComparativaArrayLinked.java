package ejemplosMITOCODE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComparativaArrayLinked {

	public static void main(String[] args) {

		//De cq de las 3 formas vale, aunque la mejor es la 2. (La primera permite elementos de varios tipos)
//		List lis2 = new LinkedList<>();
		List<Integer> lis2 = new LinkedList<>();
//		LinkedList lis2 = new LinkedList<>();
		
		
		
		lis2.add(1);
		lis2.add(2);
		System.out.println("Tamaño: " + lis2.size());
		System.out.println(lis2);
		System.out.println("Último elemento: " + lis2.get(lis2.size()-1));
		
		
		/*****************************************************/
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		
		/****************  ADD  **************************/ System.out.println("_______________________________");
		
		
//		//Siempre insertamos en la posicion 50
//		long inicio = System.currentTimeMillis();
//		for( int i = 0 ; i < 100_000 ; i++ ) {
//			if(i>=50)
//				al.add(50,i);
//			else
//				al.add(i);
//		}
//		long fin = System.currentTimeMillis();
//		System.out.println("ArrayList add: \t\t" + (fin - inicio) );
//
//
//		//Siempre insertamos en la posicion 50
//		long inicio2 = System.currentTimeMillis();
//		for( int i = 0 ; i < 100_000 ; i++ ){
//			if(i>=50)
//				ll.add(50,i);
//			else
//				ll.add(i);
//		}
//		long fin2 = System.currentTimeMillis();
//		System.out.println("LinkedList add: \t" + (fin2 - inicio2) );
		
		
		
		
		/****************  GET  ****************************/System.out.println("_______________________________");

//		long inicio3 = System.currentTimeMillis();
//		for( int i = 0 ; i < 100_000 ; i++ )
//			al.get(i);
//		long fin3 = System.currentTimeMillis();
//		System.out.println("ArrayList get: \t\t" + (fin3 - inicio3) );
//
//		
//		long inicio4 = System.currentTimeMillis();
//		for( int i = 0 ; i < 100_000 ; i++ )
//			ll.get(i);
//		long fin4 = System.currentTimeMillis();
//		System.out.println("LinkedList get: \t" + (fin4 - inicio4) );

		
		
		
		/*****************  REMOVE  **************************/System.out.println("_______________________________");
		
		
//		//Siempre borramos en la posicion 50
//		long inicio5 = System.currentTimeMillis();
//		for( int i = 100_000-1 ; i >= 0  ; i-- ){
//			if(i>=50)
//				al.remove(50);
//			else
//				al.remove(i);
//		}
//		long fin5 = System.currentTimeMillis();
////		System.out.println(al);
//		System.out.println("ArrayList remove: \t" + (fin5 - inicio5) );
//
//		
//
//		//Siempre borramos en la posicion 50		
//		long inicio6 = System.currentTimeMillis();
//		for( int i = 100_000-1 ; i >= 0  ; i-- ){
//			if(i>=50)
//				ll.remove(50);
//			else
//				ll.remove(i);
//		}
//		long fin6 = System.currentTimeMillis();
////		System.out.println(ll);
//		System.out.println("LinkedList remove: \t" + (fin6 - inicio6) );		
		
		
		
		
		System.exit(0);
	}

}
