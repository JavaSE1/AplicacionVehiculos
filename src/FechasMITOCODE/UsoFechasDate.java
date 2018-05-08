package FechasMITOCODE;

import java.util.Date;
import java.util.Locale;

public class UsoFechasDate {

	public static void main(String[] args) {

		//Desde la primera version de JAVA
		Date fecha = new Date(); //Esto solo ya devuelve la fecha y hora actuales	
		
		
//		//FORMA 1 (mejor)		
//		fecha = new Date("2017/11/26");	//Este dia cae en Domingo
//		System.out.println("fecha.getYear(): " + (fecha.getYear() + 1900));
//		System.out.println("fecha.getMonth(): " + (fecha.getMonth()+1) );
//		System.out.println("fecha.getDay(): " + fecha.getDay()); //Dia de la semana: Domingo=0
//		System.out.println("fecha.getDate(): " + fecha.getDate());
//		System.out.println("fecha.toGMTString(): " + fecha.toGMTString()); //Lo nuestro es GMT+1
//		System.out.println("fecha.toLocaleString(): " + fecha.toLocaleString());		
		
		/*********************************/System.out.println();

////		//FORMA 2 (no es la mejor forma: unos metodos no concuerdan con los otros)
//		fecha = new Date(2017-1900 , 11-1 , 26);	//26 de Nov de 2017
//		//Con esta forma, para ver resultados correctos, primero hay que restarle 1900
//		//y luego sumárselos para ver bien el anyo (pq los 2 ultimos metodos necesitan que
//		//se reste, mientras que los primeros 4 metodos no lo necesitan)
//		System.out.println("fecha.getYear(): " + (fecha.getYear()+1900) );
//		System.out.println("fecha.getMonth(): " + (fecha.getMonth()+1) );
//		System.out.println("fecha.getDay(): " + fecha.getDay()); //Dia de la semana: Domingo=0
//		System.out.println("fecha.getDate(): " + fecha.getDate());
//		System.out.println("fecha.toGMTString(): " + fecha.toGMTString()); //Lo nuestro es GMT+1 (en invierno)
//		System.out.println("fecha.toLocaleString(): " + fecha.toLocaleString());
		
		
	}

}
