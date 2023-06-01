package colecciones;
import java.util.Scanner;

//Raúl Lucas Castaño 08/04/2023 3º Evaluacion
//Manejaremos datos con arraylist

public class PruebaColeccion {

	public static void main(String[] args) {
		
		MiColeccionMenu coleccion = new MiColeccionMenu ();
		Scanner sc=new Scanner(System.in);
		int opciones=0;

		
		do { 
			
		//Diseñamos el menu con todas las opciones
			System.out.println("\t");
			System.out.println("***********MENU***********");
			System.out.println("* 1. Anadir dato         *");
			System.out.println("* 2. Consultar Datos     *");
			System.out.println("* 3. Modificar Datos     *");
			System.out.println("* 4. Borrar un Dato      *");
			System.out.println("* 5. Anadir varios Datos *");
			System.out.println("* 6. Borrar todo         *");
			System.out.println("* 7. Salir               *");
			System.out.println("**************************");
			System.out.println("\t");
			
		System.out.println("Elige una opcion: ");
		opciones=sc.nextInt();
		sc.nextLine();

		//con el switch crearemos las distintas opciones con las que vamos a manejar los datos del arraylist
		switch (opciones) { 
			case 1:
				coleccion.anadirdatos();
		        break;
			
			case 2:
				coleccion.consultardatos();
				break;
				
			case 3:
				coleccion.modificardatos();
				break;
				
			case 4:
				coleccion.borrardatos();
				break;
				
			case 5:
				coleccion.variosdatos();
				break;
				
				
			case 6:
				coleccion.borrartodo();
				break;
				
			case 7: 
				coleccion.salida();
				break;
				
			default:
				System.out.println("El numero seleccionado no es correcto");
				break;
			}
		} while (opciones!=7); //Mientras que el numero introduccido por teclado no sea 7 seguira repitiendo las instrucciones
	sc.close(); //Cerramos el scanner
	}
}
