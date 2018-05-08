package Interfaces_Clases_Internas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizador {

	public static void main(String[] args) {

		ActionListener listener2 = new Listener2();
		ActionListener listener3 = new PruebaTemporizador().new Listener3();
		ActionListener listener = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				System.out.println("Hola " + Math.random());
			}
		};
//		Timer miTemporizador = new Timer(1000, listener); //Es lo mismo si usamos "listener", "listener2" o "listener3"
//		Timer miTemporizador = new Timer(1000, listener2); //Es lo mismo si usamos "listener", "listener2" o "listener3"
		Timer miTemporizador = new Timer(1000, listener3); //Es lo mismo si usamos "listener", "listener2" o "listener3"
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Parar?");
		System.exit(0);
	}
	
	private class Listener3 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

			System.out.println("Hola " + Math.random());
			
		}
		
	}
}

class Listener2 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		
//		class Borrame{  //Si ponemos aqui esta clase, será una "clase interna local". El resto del codigo no cambia.
//			public void saluda() {
//				System.out.println("Qué tal?");
//				Toolkit.getDefaultToolkit().beep(); 
//			}
//		}

		System.out.println("Hola " + Math.random());
		Borrame bo = new Borrame();
		bo.saluda();
		
	}
	
	private class Borrame{
		
		public void saluda() {
			System.out.println("Qué tal?");
			Toolkit.getDefaultToolkit().beep(); 
		}
	}
}
