package ejemplos;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Uso_ArrayList_forEach {

	public static void main(String[] args) {

		ArrayList<String> milista = new ArrayList<String>();
		milista.add(new String("Miguel"));
		milista.add(new String("Alicia"));

		milista.forEach(new Consumer<String>() {

			@Override
			public void accept(final String persona) {
				System.out.println(persona);
			}

		});
		
		/**************************************************/
		/*
		 * Con expresiones LAMBDA
		 */
		milista.forEach( (final String persona) -> System.out.println(persona));
		//O tambien:
		milista.forEach( (persona) -> System.out.println(persona));

	}

}
