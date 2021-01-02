/**
 * 
 */
package ejerciciostema2;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Ejercicio6Tema2 {

	/**
	 * Escribe un programa que calcule el total de una factura a partir de la base
	 * imponible (precio sin IVA). La base imponible estará almacenada en una
	 * variable.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		System.out.println("Introduzca el precio bruto del producto: ");
		double baseImponible = keyboard.nextDouble();
		

		System.out.printf("|Base imponible %8.2f€|\n", baseImponible);
		System.out.printf("|IVA %19.2f€|\n", baseImponible * 0.21);
		System.out.printf("|Total %17.2f€|\n", baseImponible * 1.21);
		System.out.printf("|Base imponible %8.2f€| %8.2f€ | %8.2f€ |\n", baseImponible, baseImponible * 0.21, baseImponible * 1.21);
		
	}

}
