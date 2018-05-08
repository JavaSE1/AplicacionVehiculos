package ejemplosArrayList_MITOCODE;

import java.util.ArrayList;
import java.util.List;

public class UsoArrayListRendimiento {

	public static void main(String[] args) {

		long inicio = System.nanoTime();
		List<Integer> lista = new ArrayList();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		long fin = System.nanoTime();
		System.out.println(fin-inicio);
		
		
		long inicio2 = System.nanoTime();
		List<Integer> lista2 = new ArrayList(5);
		lista2.add(1);
		lista2.add(2);
		lista2.add(3);
		lista2.add(4);
		lista2.add(5);
		long fin2 = System.nanoTime();
		System.out.println(fin2-inicio2);
		
		/*************************************/
		
//		long inicio = System.currentTimeMillis();
//		List<Integer> lista = new ArrayList();
//		for(int i=0 ; i<100_000 ; i++) {
//			lista.add(i);
//		}
//		long fin = System.currentTimeMillis();
//		System.out.println(fin-inicio);
//		
//		
//		long inicio2 = System.currentTimeMillis();
//		List<Integer> lista2 = new ArrayList(100_000);
//		for(int i=0 ; i<100_000 ; i++) {
//			lista2.add(i);
//		}
//		long fin2 = System.currentTimeMillis();
//		System.out.println(fin2-inicio2);
//		
//		System.exit(0);
		
	}

}
