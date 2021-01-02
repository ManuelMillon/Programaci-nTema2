/**
 * 
 */
package ejerciciostema2;
import java.util.Scanner;
/**
 * @author Usuario
 *
 */
public class Ejercicio5Tema2 {

	/**
	 * Realiza un conversor de pesetas a euros. La cantidad en pesetas que se quiere
	 * convertir deberá estar almacenada en una variable.
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("¿Cuántas pesetas quiere convertir a euros?");
		double pesetas = keyboard.nextDouble(); 
		
		double euros = pesetas / 166.386; 
		
		System.out.printf("%.2f %n", euros);

	}

}
