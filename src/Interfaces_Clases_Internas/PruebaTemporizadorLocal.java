package Interfaces_Clases_Internas;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class PruebaTemporizadorLocal {

	public static void main(String[] args) {
		
		class Listener3 implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola " + Math.random());
			}
		}

		ActionListener listener3 = new Listener3();
		Timer miTemporizador = new Timer(1000, listener3); 
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "Parar?");
		System.exit(0);
	}
	

}

