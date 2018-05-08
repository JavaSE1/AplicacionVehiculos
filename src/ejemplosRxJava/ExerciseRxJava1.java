package ejemplosRxJava;

import rx.Observable;

public class ExerciseRxJava1 {

	public static void main(String[] args) {

		/*
		 * Utilizando FROM y FILTER, imprimir los numeros mayores que 4
		 */
		Integer[] numbers = {5,8,65,8,2,1,7,9,6,4};
		
		Observable	.from(numbers)
					.filter(number -> number > 4)
					.subscribe(number -> System.out.println("Este es el número mayor que 4: " + number));
		
	}

}
