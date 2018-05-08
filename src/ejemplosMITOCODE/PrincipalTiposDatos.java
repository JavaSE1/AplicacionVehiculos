package ejemplosMITOCODE;

public class PrincipalTiposDatos {

	public static void main(String[] args) {

		
		
		byte variableByte; //= 300;
		short variableShort; //= 55000;
		
		
//		int variableInt = null;
		
		
		Integer variableInteger = null;  
		Integer variableInteger2 = new Integer(1999999999); 
		
		
		
		
		//sino se pone la "l" lo considera como int
		long variableLong; //= 9999999999999999999l;

		//si no se pone la "f", lo considera double
		float variableFloat = 3.5f;  //3.5F //999999999999999999999999999999999999999.999f;
		//si no se pone la "d" (y no tiene decimales) lo considera "int"
		double variableDouble = 3.5;  //3.5d;  //3.5D; //999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999d;
	
		char variableChar = 'a';
		boolean variableBoolean = true;
	}
}
