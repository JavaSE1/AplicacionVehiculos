package FechasMITOCODE;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class UsoFechasGregorianCalendar {

	public static void main(String[] args) {

//		GregorianCalendar gcal = new GregorianCalendar();
		Calendar gcal = new GregorianCalendar(2017, Calendar.NOVEMBER, 25); //2017,10,25
//		Calendar gcal = new GregorianCalendar(1970, Calendar.JANUARY, 01,1,00,00);
		
		System.out.println("Año: " + gcal.get(Calendar.YEAR)); //cal.get(1)
		System.out.println("Mes: " + gcal.get(Calendar.MONTH)); //cal.get(2)
		System.out.println("Día: " + gcal.get(Calendar.DAY_OF_MONTH)); //cal.get(5)
		
		System.out.println("\nFecha: " + gcal.getTime().toLocaleString());
		
		
	}

}
