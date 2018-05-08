package appreflection;

public class Operacion
{
	public void Saludar()
	{
		System.out.println("Hola desde enlawebdekaaf");
	}
	
	public void Saludar(String nombre)
	{
		System.out.println("Hola "+nombre);
	}
	
	public String MiMetodo()
	{
		return "Texto retornado";
	}
}