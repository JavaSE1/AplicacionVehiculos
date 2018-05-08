package FechasMITOCODE;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class UsoFechasCalendar {

	public static void main(String[] args) {

//		Locale.setDefault(new Locale("ES"));
//		Locale.setDefault(Locale.GERMANY); //Esto solo varia el formato en que se presenta la fecha, no la zona horaria.
		
		Calendar cal = Calendar.getInstance(); //Esto solo ya devuelve la fecha y hora actuales
//		System.out.println(cal.getClass().getName());
		
		//De otra forma: para darle una fecha concreta
//		cal.setTime(new Date());
		cal.setTime(new Date("2017/11/26"));
		
		System.out.println("Año: " + cal.get(Calendar.YEAR)); //cal.get(1)
		System.out.println("Mes: " + cal.get(Calendar.MONTH)); //cal.get(2)
		System.out.println("Dia: " + cal.get(Calendar.DAY_OF_MONTH)); //cal.get(5)
		System.out.println("Milisegundos: " + cal.get(Calendar.MILLISECOND)); //cal.get(5)
//		
		System.out.println("\nFecha: \t\t" + cal.getTime());
		System.out.println("Fecha Locale: \t" + cal.getTime().toLocaleString()); 
		System.out.println("Fecha GMT: \t" + cal.getTime().toGMTString());
		

		
		/**********************************/System.out.println();
		
		System.out.println(Locale.getDefault());
//		System.out.println(Locale.getDefault().getCountry());
//		System.out.println(Locale.getDefault().getLanguage());
	}

}
