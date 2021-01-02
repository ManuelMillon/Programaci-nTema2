/**
 * 
 */
package ejerciciostema2;
import java.util.Scanner;
/**
 * @author Manuel Millón
 *
 */
public class Ejercicio4Tema2 {

	/**
	 * Realiza un conversor de euros a pesetas. La cantidad en euros que se quiere
	 * convertir deberá estar almacenada en una variable.
	 */
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("¿Cuántos euros quiere convertir a pesetas?");
		double euros = teclado.nextDouble(); 
		
		double pesetas = (int) euros * 166.386; 
		
		System.out.println(euros + "euros son " + pesetas + " pesetas.");


	}

}
