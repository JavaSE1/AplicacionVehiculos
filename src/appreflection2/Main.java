package appreflection2;

import java.lang.reflect.Method;

import appreflection2.Operacion;

public class Main {
	public static void main(String[] args)
	{
		try
		{			
			Class<?> miClase=Class.forName("appreflection2.Operacion");
			
			miClase.newInstance();
			
//			//Forma 1 para llamar a un metodo de la clase Operacion
//			Operacion o = (Operacion)miClase.newInstance();
//			o.Saludar();
//			System.out.println(o.Sumar(2, 3));
			
//			//Forma 2 para llamar a un metodo de la clase Operacion
//			miClase.newInstance().getClass().getMethod("Saludar").invoke(miClase.newInstance());
			
			//Forma 3 para llamar a un metodo ESTATICO de la clase Operacion
//			miClase.newInstance().getClass().getMethod("meSta").invoke(miClase);
			
			System.out.println("******************");
			Method[] arrayMethod=miClase.getMethods();
			
			for(Method item : arrayMethod)
			{
				System.out.println("Nombre: "+item.getName());
				System.out.println("Tipo de retorno: "+item.getReturnType());
				System.out.println("Número de parmámetros: "+item.getParameterCount());
				System.out.println("-----------------------------------------------------------------");
			}

		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}