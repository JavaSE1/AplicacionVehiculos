 package ejemplosMITOCODE;

public class PrincipalIF {

	public static void main(String[] args) {

//		int x = 11;

//		if (x == 10 == true) {
//			System.out.println("x es 10 ");
//		}	
		
//		if( x != 10 ) {
//			System.out.println("x distinto de 10");
//		}
		
//		if( !(x==10) )
//			System.out.println("Distinto de 10");
		
		
//		if( x > 10 ) {
//			System.out.println("Mayor que 10");
//		}else {
//			System.out.println("Menor o igual que 10");
//		}
		
		
//		//Con esto, evalua cada uno de los IF
//		x=10;
//		if( x==10 ) {
//			System.out.println("Igual a 10");
//		}
//		if( x==15 ) {
//			System.out.println("Igual a 15");
//		}		


//		//En cambio, con esto, cuando entra en uno, ya no evalua los demás
//		if( x==10 ) {
//			System.out.println("Igual a 10");
//		}else if( x==15 ) {
//			System.out.println("Igual a 15");
//		}else if( x==20 ) {
//			System.out.println("Igual a 20");
//		}else{
//			System.out.println("Ninguno de los anteriores");
//		}
		
		
//		//Lo anterior es lo mismo que esto, pero escrito de otra forma (con llaves en los ELSE)
//		if(x == 10) {
//			System.out.println("Igual a 10");
//		} else {
//			if(x == 15) {
//				System.out.println("Igual a 15");
//			} else {
//				if(x == 20) {
//					System.out.println("Igual a 20");
//				}
//			}
//		}
		
		/***********************************/
		
//		int a=10,b=20,mayor;
//		mayor = a > b ? a : b;
//		System.out.println("mayor: " + mayor);
		
		int a=10,b=20;
		String iguales;
		iguales = (a == b) ? "iguales sí" : "iguales no";
		System.out.println("iguales: " + iguales);
		
//		if( a == b)
//			iguales = "iguales sí";
//		else
//			iguales = "iguales no";
//		System.out.println(iguales);
			
		
		
		/***********************************/
		
//		//Operadores
//		System.out.println( 7 / 2 );
//		System.out.println( 7.0 / 2.0 );
//		System.out.println( 7.0 % 2.0 );
		
//		int x = 4;
//		x++; 
//		++x;
//		x = x + 1;
//		x += 1;
//		System.out.println(++x);
//		System.out.println(++x);
		
//		System.out.println( ! false);
//		
//		int x=1;
//		System.out.println(true & false);
//		System.out.println(x==2 && x==1);
//		
//		System.out.println(1 | 2);
		System.out.println(1 & 2);
//		System.out.println(1 ^ 2);
//		
//		System.out.println("Desplazamiento hacia la izquierda: " + (1 << 1));
//		System.out.println("Desplazamiento hacia la derecha: " + (2 >> 1));
		
		
	}

}
