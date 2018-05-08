package ejemplos;

public class CondicionalesIf {

	public static void main(String[] args) {

		int temp = 16;
		
		if ( temp > 30 ) System.out.println("Mucho calor");
		if ( temp > 25 && temp <= 30 ) System.out.println("Calor");
		if ( temp > 15 && temp <= 25 ) System.out.println("Templado");
		if ( temp <= 15 ) System.out.println("Frío");
		
		if ( temp > 30 ) {
			System.out.println("Mucho calor");
		} else if ( temp >25 ){
			System.out.println("Calor");
		} else if( temp > 15 ) {
			System.out.println("Templado");
		} else {
			System.out.println("Frío");
		}

		/**************Lo mismo escrito de otra forma****************************/
		
		if ( temp > 30 ) {
			System.out.println("Mucho calor");
		} else  {
			
			if ( temp >25 ){
				System.out.println("Calor");
			} else { 
				
				if( temp > 15 ) {
					System.out.println("Templado");
				} else {
					System.out.println("Frío");
				}
				
			}
			
		}
		
	}

}
