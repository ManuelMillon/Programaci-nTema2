/**
 * 
 */
package ejerciciostema2;

/**
 * @author Manolo Mill�n
 *
 */
public class Ejercicio1Tema2 {

	/**
	 * Escribe un programa en el que se declaren las variables enteras x e y. As�gnales
	 * los valores 144 y 999 respectivamente. A continuaci�n, muestra por pantalla
	 * el valor de cada variable, la suma, la resta, la divisi�n y la multiplicaci�n.
	 */
	public static void main(String[] args) {
		int x = 144;
		int y = 999;
		int suma = x + y;
		int resta = x - y;
		int mult = x * y;
		double division = (double) x / (double) y;
		
		System.out.println("La suma de x e y es " + suma);
		System.out.println("La resta de x e y es " + resta);
		System.out.println("La mutiplicaci�n de x e y es " + mult);
		System.out.println("La divisi�n de x e y es " + division);
	}

}
