package ejemplosRxJava;

import java.util.concurrent.TimeUnit;

import rx.Observable;
import rx.functions.Func1;

public class ExerciseRxJava2 {

	public static void main(String[] args) {

		/*
		 * Utilizando FROM y MAP, convertir los numeros en strings con el formato [i]
		 * Resulatado esperado: [5][8][65]...[4]
		 */
		Integer[] numbers = {5,8,65,8,2,1,7,9,6,4};
		
		Observable.from(numbers)
				.map(number -> "[" + number + "]")
				.subscribe(System.out::print);
		
		/***********************************************/

//		//Obtener solo los pares (forma mas reducida)
//		Observable.from(numbers)
//				.filter(number -> number%2==0)
////				.take(2)
////				.distinct()
////				.isEmpty()
//				.map(number -> "[" + number + "]")
//				.subscribe(System.out::print);
		
		/***********************************************/
		
//		//Obtener solo los pares (forma mas extensa)		
//		Observable	.from(numbers)
//					.filter(number -> {
//						if(number%2==0) 
//							return true;
//						else
//							return false;
//					 })
//					.map(number -> "[" + number + "]")
//					.subscribe(System.out::print);
		
		/***********************************************/
		
//		//Obtener solo los pares (forma reducida)		
//		Observable	.from(numbers)
//					.filter(number -> {return number%2==0;})
//					.map(number -> "[" + number + "]")
//					.subscribe(System.out::print);
		
	}

}
