package anotaciones;

import java.lang.annotation.Annotation;

public class Anotaciones {

	public static void main(String[] args) {

		MiClase clase = new MiClase();
		Annotation[] anotaciones = clase.getClass().getAnnotations();
		
		MiAnotacion anotacion = (MiAnotacion) anotaciones[0];
		System.out.println(anotacion.nombreArchivoGenerado());
		
		for(Annotation a : anotaciones){
			System.out.println(a);
		}
	}

}
