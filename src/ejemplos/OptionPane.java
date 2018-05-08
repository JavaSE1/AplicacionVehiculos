package ejemplos;

import javax.swing.JOptionPane;

public class OptionPane {

	public static void main(String[] args) {

		String cadena;
		int entero;
		char caracter;
		double decimal;
		
		cadena = JOptionPane.showInputDialog("Digite una cadena");
		entero  = Integer.parseInt(JOptionPane.showInputDialog("Digite un entero"));
		caracter = JOptionPane.showInputDialog("Digite una carácter").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un double"));
		
		JOptionPane.showMessageDialog(null, cadena);
		JOptionPane.showMessageDialog(null, entero);
		JOptionPane.showMessageDialog(null, caracter);
		JOptionPane.showMessageDialog(null, decimal);
	}

}
