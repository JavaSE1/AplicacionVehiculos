package ejemplosMITOCODE;

import java.util.HashSet;
import java.util.Set;

public class UsoHashSet {

	public static void main(String[] args) {

		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("c");
		conjunto.add("z");
		conjunto.add("x");
		conjunto.add("a");
		conjunto.add("b");
		conjunto.add("d");
		conjunto.add("d");
		
		System.out.println(conjunto);
		
		System.out.println("size:" + conjunto.size());
		
		for(String x:conjunto) {
			System.out.println(x);
		}
		
	}

}
