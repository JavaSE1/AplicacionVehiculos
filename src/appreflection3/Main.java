package appreflection3;

import java.lang.reflect.Method;
import java.sql.Date;
import java.util.Calendar;

public class Main {
	public static void main(String[] args)
	{
		try
		{			
			EntityPersona ep=new EntityPersona();
			ep.setNombre("Kevin Arnold");
			ep.setCantidadHijos(7);
			ep.setSexo(true);
			ep.setFechaNacimiento(new Date(Calendar.getInstance().getTime().getTime()));
			
			DtoPersona dto=new DtoPersona();
			
//			dto.setNombre(ep.getNombre());
//			dto.setCantidadHijos(ep.getCantidadHijos());
//			dto.setSexo(ep.getSexo());
//			dto.setFechaNacimiento(ep.getFechaNacimiento());
			
			Method[] arrayMethodEp=ep.getClass().getMethods();
			Method[] arrayMethodDto=dto.getClass().getMethods();
			
			for(Method item : arrayMethodEp)
			{
				for(Method value : arrayMethodDto)
				{
					String nombreMEP=item.getName();
					String nombreMDP=value.getName();
					
					if(nombreMEP.indexOf("get")==0 && (nombreMDP.indexOf("set")==0 && nombreMDP.substring(3, value.getName().length()).equals(nombreMEP.substring(3, nombreMEP.length()))))
					{
//						System.out.println(item.invoke(ep).getClass());
//						System.out.println(item.invoke(ep));
//						dto.getClass().getMethod(value.getName(), item.invoke(ep).getClass()).invoke(dto, item.invoke(ep));
						System.out.println(item.getName() + "---" + value.getName());
					}
				}
			}
			
			System.out.println();
			System.out.println(dto.getNombre());
			System.out.println(dto.getCantidadHijos());
			System.out.println(dto.getSexo());
			System.out.println(dto.getFechaNacimiento());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}