package FilesMITOCODEBasico;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

public class PrincipalFileWriter {

	public static void main(String[] args) throws IOException {

//		//La forma mas basica. No viene en el video
//		//OJO!! Solo con la siguiente linea ya se crea el fichero
//		FileWriter f = new FileWriter("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt", true);
//		
//		f.write("Hola Mundo!!");
//		
//		if( f != null )
//			f.close();
		
		/**********************************************************/

//		//Con BufferedWriter. No viene en este video		
//		FileWriter f = new FileWriter("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt",true);
//		BufferedWriter w = new BufferedWriter(f);
//		w.write("Suscríbanse!!!");
//		//w.newLine();
//		w.close();
		
		/**********************************************************/
		
//		FileWriter f2 = new FileWriter("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt");
//		PrintWriter pr2 = new PrintWriter(f2);
//		
//		pr2.write("Hola Mundo!!\n");
//		pr2.format("Nombre: %s Edad: %d \n", "Pepe", 25);
//		pr2.println("Hasta luego!!");
//		pr2.println("Hasta luego otra vez!!");
//		
//		if( f2 != null )
//			f2.close();
		
	}

}
