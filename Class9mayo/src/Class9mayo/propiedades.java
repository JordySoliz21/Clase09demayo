package Class9mayo;

import javax.swing.JOptionPane;

public class propiedades {

	int a, b;	//atributos

	//constructor
	public propiedades(int a, int b) {
		this.a = a;
		this.b = b;
	}
	//metodo get y set
	public int getA() {   //obtenemos
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	//metodo una funcion para multiplicar
	public static int Mult(int a, int b) {
		int mul;
		mul=a*b;
		return mul;
	}
	public void saludo() {
		JOptionPane.showMessageDialog(null, "Saludos!");
	}
	public void adios() {
		JOptionPane.showMessageDialog(null, "Adiós rey");
	}
}
