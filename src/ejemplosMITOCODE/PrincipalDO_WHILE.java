package ejemplosMITOCODE;

import java.util.Scanner;

public class PrincipalDO_WHILE {

	public static void main(String[] args) {

		int i=1;
		
		do {
			System.out.println(i);
			i++;
		}while( i<5 );
//		}while( i<0 ); 
		
		/********************/
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		do {
			System.out.println("Di una cadena:");
			cadena = sc.next();
		}while( !cadena.equals("salir") );
		
		System.out.println("FIN");
	}

}
