/**
 * 
 */
package ejerciciostema2;

/**
 * @author Usuario
 *
 */
public class ExperimentosTema2 {

	/**
	 * Experimentos
	 */
	public static void main(String[] args) {
		int x;
		double y;
		
		
		x= 7;
		y= 25.01;
		
		
		System.out.println("El valor de x es " + x);
		
		System.out.println("Y ahora el valor de y es " + y);
		
		x= 30;
		
		System.out.println("Y ahora el valor de x es " + x);
		
		String miPalabra = "cerveza";
		String miFrase ="¿Dónde está mi cerveza?";
		
		System.out.println("Una palabra que uso con frecuencia: " + miPalabra); 
		
		System.out.println("Una palabra que uso a veces: " + miFrase); 
		
		char letra1 = 'a';
		char letra2 = 'b';
		
		System.out.println(letra1);
		System.out.println(letra2);
		System.out.println(letra1 + letra2);
		System.out.println(letra1+ "" + letra2);
		
		int m = 2;
		int n = 9;
		
		double division;
		division = (double) n / (double) m;
		
		System.out.println("El resultado de la división es " + division);
		
		
		int p = 2;
		int q = 7;
		int dividido;
		dividido = q / p;  
		System.out.println("El resultado de la última división es " + dividido);
		
		System.out.println("El resto de la última división es " + 11%4);
	}

}
