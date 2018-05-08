package FilesMITOCODEBasico;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PrincipalFileReader {

	public static void main(String[] args) throws IOException {
		
//		//El mas basico. No viene en el video
//		FileReader f = new FileReader("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt");
//		
//		int caracterAscii = f.read();
//		while ( caracterAscii != -1) {
////			System.out.println(caracterAscii +"-"+ (char)caracterAscii);
////			System.out.println(caracterAscii);
////			System.out.println((char)caracterAscii);
//			System.out.print((char)caracterAscii);
//			caracterAscii = f.read();
//		}
//		f.close();
		
		/*********************************************/

		FileReader f = new FileReader("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt");
		BufferedReader buffer = new BufferedReader(f);
		
//		//Forma 2: Caracter a caracter	
//		int caracterAscii;
//		while ( ( caracterAscii = buffer.read()) != -1) {
//			System.out.println(caracterAscii +"-"+ (char)caracterAscii);
////			System.out.println((char)caracterAscii);
////			System.out.print((char)caracterAscii);
//		}		
		
		//Forma 1: Linea a linea	
		String texto;
		while ( ( texto = buffer.readLine()) != null) {
			System.out.println(texto);
		}
		
		buffer.close();
		
		/****************************************/
		
//		FileInputStream in = new FileInputStream("C:\\Workspace\\WorkspaceJavaSE\\fichero.txt");
//		//FileInputStream in = new FileInputStream("C:/Workspace/WorkspaceJavaSE/fichero.txt");
//
////		//Forma 1: Caracter a caracter
////		int caracterAscii;
////		while ( ( caracterAscii = in.read()) != -1) {
//////			System.out.println(caracterAscii +"-"+ (char)caracterAscii);
////			System.out.print((char)caracterAscii);
////		}
//
//		
////		//Forma 2: Palabra a palabra		
////		Scanner esc = new Scanner(in, "ISO-8859-1"); //"UTF-8"
////		while ( esc.hasNext() ) {
////			System.out.println(esc.next());
////		}	
//		
////		//Forma 3: Linea a linea		
////		Scanner esc = new Scanner(in, "ISO-8859-1"); //"UTF-8"
////		while ( esc.hasNextLine() ) {
////			System.out.println( esc.nextLine() );
////		}		

		
	}

}
