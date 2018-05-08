package ejemplos_SWING;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MiVentana {

	public static void main(String[] args) {

		JFrame ventana = new JFrame("Mi primera ventana swing - MitoCode");
		ventana.setSize(300, 200);
		
//		JButton boton = new JButton("Saludar");
//		boton.setBounds(50, 50, 100, 50);
//		ventana.add(boton);
		
		JPanel panel = new JPanel();
		JButton boton = new JButton("Saludar");
		panel.add(boton);

		ventana.add(panel);
		
		JButton botonSalir = new JButton("Salir");
		panel.add(botonSalir);
		
		ventana.setVisible(true);
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		botonSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ventana.dispatchEvent(new WindowEvent(ventana, WindowEvent.WINDOW_CLOSING));
//				ventana.dispose();
			}
		});
		
	}

}
