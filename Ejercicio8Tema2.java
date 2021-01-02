/**
 * 
 */
package ejerciciostema2;

/**
 * @author Manuel Millón
 *
 */
public class Ejercicio8Tema2 {

	/**
	 * Escribe un programa que declare 5 variables de tipo char. A continuación, crea
	 * otra variable como cadena de caracteres y asígnale como valor la concatenación 
	 * de las anteriores 5 variables. Por último, muestra la cadena de caracteres
	 * por pantalla ¿Qué problemas te encuentras? ¿cómo lo has solucionado?
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
