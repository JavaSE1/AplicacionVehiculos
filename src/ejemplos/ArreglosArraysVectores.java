package ejemplos;

public class ArreglosArraysVectores {

	public static void main(String[] args) {

		int[] n = {1,3,5};
		
		for( int i = 0 ; i < n.length ; i++) {
			System.out.println(n[i]);
		}
		
		/****************/
		
		//Lo mismo con FOREACH
		for(int x : n) {
			System.out.println(x);
		}
	}

}
