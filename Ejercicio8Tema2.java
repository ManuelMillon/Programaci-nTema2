/**
 * 
 */
package ejerciciostema2;

/**
 * @author Manuel Mill�n
 *
 */
public class Ejercicio8Tema2 {

	/**
	 * Escribe un programa que declare 5 variables de tipo char. A continuaci�n, crea
	 * otra variable como cadena de caracteres y as�gnale como valor la concatenaci�n 
	 * de las anteriores 5 variables. Por �ltimo, muestra la cadena de caracteres
	 * por pantalla �Qu� problemas te encuentras? �c�mo lo has solucionado?
	 */
	public static void main(String[] args) {

		char letra1 = 'm'; 
		char letra2 = 'u'; 
		char letra3 = 'n'; 
		char letra4 = 'd'; 
		char letra5 = 'o';
		
		String palabra = "" + letra1 + letra2 + letra3 + letra4 + letra5;
		
		System.out.println(palabra);
		

	}

}
