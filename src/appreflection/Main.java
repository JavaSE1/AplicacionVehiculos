package appreflection;

import java.lang.reflect.Method;

public class Main {
	public static void main(String[] args)
	{
		try
		{
			Operacion o = new Operacion();
			Method method = o.getClass().getMethod("Saludar");
			method.invoke(o);
			
			Method methodParameter = o.getClass().getMethod("Saludar", String.class);
			methodParameter.invoke(o, "Kevin Arnold");
			
			Method methodRetorno = o.getClass().getMethod("MiMetodo");
			String variable = methodRetorno.invoke(o).toString();
			System.out.println(variable);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}