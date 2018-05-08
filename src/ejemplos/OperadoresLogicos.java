package ejemplos;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		int a = 4;
		int b = 7;
		System.out.println(a & b); // imprime 4
		System.out.println(a | b); // imprime 7
		System.out.println(a ^ b); // imprime 3
		// 00000100
		// 00000111
		// ========
		// 00000100

		/**************************************************/
		
		boolean aa, bb;
		int divisor = 0;
		aa = true;

		System.out.println("\nResultado:" + (aa || 1/divisor == 1));
//		System.out.println("Resultado:" + (aa | 1/divisor == 1)); 
		
		/**************************************************/
		
		boolean a2, b2;
		a2 = true;
		b2 = false;
		
		System.out.println(a2 != b2);
//		System.out.println(a2 ^ b2);
		
	}

}
