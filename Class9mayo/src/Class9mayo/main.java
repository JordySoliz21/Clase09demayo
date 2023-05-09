package Class9mayo;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class main {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		propiedades po = new propiedades(0, 0);
		int x, y;
		po.saludo();
		x = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el primer num:"));
		y = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el segundo num:"));
		
		JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: "+po.Mult(x, y));
		po.adios();
		tc.close();
	}

}
