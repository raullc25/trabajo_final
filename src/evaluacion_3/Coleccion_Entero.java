package evaluacion_3;
//Raúl Lucas Castaño      28/03/2023
import java.util.Scanner;
import java.util.*;
public class Coleccion_Entero {

	 /*
     * Implementar una aplicación que pida por consola números hasta que se
     * introduzca el -1 en java. Los números se guardan en un Arraylist y se pueden
     * repetir. Al terminar mostrar la colección. Mostrar los valores pares y
     * eliminar los múltiplos de tres.
     */

	
	public static void main(String[] args){

		int num = 0;
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> numeros = new ArrayList<Integer>();

		while (num != -1) {
			System.out.println("Ingrese un numero, si quieres finalizar ingrese el -1: ");
			num = sc.nextInt();
			if (num != -1) {
				numeros.add(num);
			}
		}

		System.out.println("\t La coleccion es:" + numeros);
		System.out.println("");
		System.out.println("\tValores Pares");
		
		for (int i=0;i<numeros.size();i++) {
			
		}
		sc.close();
	}
}

