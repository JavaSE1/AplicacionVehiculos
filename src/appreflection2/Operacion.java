package appreflection2;

public class Operacion
{
	public static void meSta() {
		System.out.println("Hola método estático");
	}
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
	
	public int Sumar(int x, int y)
	{
		return x+y;
	}
	
	@SuppressWarnings("unused")
	private String MetodoPrivadio()
	{
		return "Método privado";
	}
}