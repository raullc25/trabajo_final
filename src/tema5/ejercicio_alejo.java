package tema5;
import java.util.Scanner;
public class ejercicio_alejo {

		//Utilizamos caracteres de escape como \n (espacio) o \t (tabulación)
		
		public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			System.out.print("Dime de que tamaño quieres el arrays: ");
			int tam = entrada.nextInt();
			int[] prueba = new int[tam];
			for (int i = 0; i < tam; i++) {
				// creamos el arrays pidiendolo al usuario

				System.out.print("Dime la nota " + i + ": ");
				int nota = entrada.nextInt();
				prueba[i] = nota;

				
			}
			System.out.println("\n Ahora te muestro el resultado \n");
			// Mostramos el arrays
			for (int i = 0; i < tam; i++) {
				System.out.println("\t Nota [" + i + "]: " + prueba[i]);

			}

		}
			//Salida 
		
		//Dime de que tamaño quieres el arrays: 3
		//Dime la nota 0: 2
		//Dime la nota 1: 3
		//Dime la nota 2: 5

		 //Ahora te muestro el resultado 

			 //Nota [0]: 2
			 //Nota [1]: 3
			 //Nota [2]: 5

		}