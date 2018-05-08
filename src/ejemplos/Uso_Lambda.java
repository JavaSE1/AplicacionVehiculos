package ejemplos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Uso_Lambda {

	public static void main(String[] args) {

		for (Integer numero : Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)) {
			System.out.print(numero + " ");
		}

		// imprimir una lista utilizando expresiones lambda en Java 8
		System.out.println("\n	");
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(n -> System.out.print(n + " "));

		// otra forma utilizando la forma abreviada de expresiones Lambdas
		System.out.println("\n	");
		Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).forEach(System.out::print);
		
		//numeros mayores a 5 con expresiones Lambda 
		System.out.println("\n	");
		ArrayList<Integer> mayores = (ArrayList<Integer>) Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
				.stream()
				.filter(x -> x > 5)
				.collect(Collectors.toCollection(() -> new ArrayList<Integer>()));

		mayores.forEach(e -> System.out.print(e));
	}

}
