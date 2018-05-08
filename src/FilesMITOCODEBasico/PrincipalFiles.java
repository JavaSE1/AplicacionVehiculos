package FilesMITOCODEBasico;

import java.io.File;
import java.io.IOException;

public class PrincipalFiles {

	public static void main(String[] args) throws IOException {

////		//Forma 1
//		File f = new File("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt");
//		
////		//Forma 2
////		File f = new File("C:/Workspace/WorkspaceJavaSE/fichero.txt");
//		System.out.println("Existe fichero? " + f.exists());
		
		/**********************************/
		
//		File f4 = new File("C:/Workspace/WorkspaceJavaSE/fichero.txt");
//		System.out.println("Creado fichero? " + f4.createNewFile());		
		
		/**********************************/
		
//		File f2 = new File("C:\\Workspace\\WorkspaceJavaSE\\borrame_ya");
//		System.out.println(f2.mkdir()); 

		/**********************************/
		
//		File f2 = new File("C:\\Workspace\\WorkspaceJavaSE\\borrame_ya\\pero_ya");
//		System.out.println(f2.mkdirs()); 
		
		/**********************************/

//		File f3 = new File("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt");
//		System.out.println(f3.renameTo(new File("C:\\Workspace\\WorkspaceJavaSE\\fichero_renombrado.txt")));

		/**********************************/
		
		File f3 = new File("C:\\Workspace\\WorkspaceJavaSE\\fichero_renombrado.txt");
		System.out.println(f3.delete());
		

		
	}

}
