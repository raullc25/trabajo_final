package CRUD;
import java.util.Scanner;
import java.io.*;

//Raúl Lucas Castaño 08/04/2023 3º Evaluacion
//Manejaremos datos con arraylist
//CONCURSO DE PESCA, QUE SE AÑADA LOS PARTICIPANTES Y LOS PECES(puntos) POR TECLADO Y TE COLOQUE DE MAYOR A MENOR Y LOS GANADORES
//POR OBJETOS O NO
//ARRAYLLIST PERMITE DUPLICADO O CAMBIAR 
//O HACER UN EQUALS QUE SI EL TECLADO ES IGUAL A ALGUNO QUE YA EXISTA NO DEJE INTRODUCIRLO, EN VEZ DEL NOMBRE QUE LE DNI NO SEA IGUAL

public class PruebaColeccion {

	public static void main(String[] args) {
		
		MiColeccionMenu_fichero coleccion = new MiColeccionMenu_fichero ();
		Scanner sc=new Scanner(System.in);
		int opciones=0;

		
		do { 
			
		//Diseñamos el menu con todas las opciones
			System.out.println("\t");
			System.out.println("****************MENU****************");
			System.out.println("*   1. Anadir dato                 *");
			System.out.println("*   2. Consultar Datos             *");
			System.out.println("*   3. Modificar Datos             *");
			System.out.println("*   4. Borrar un Dato              *");
			System.out.println("*   5. Anadir varios Datos         *");
			System.out.println("*   6. Borrar todo                 *");
			System.out.println("*   7. Guardar datos en el fichero *");
			System.out.println("*   9. Salir                       *");
			System.out.println("************************************");
			System.out.println("\t");
			
		System.out.println("Elige una opcion: ");
		opciones=sc.nextInt();
		

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
				System.out.println("Dime como quieres llamar al archivo");
				String resp=sc.nextLine();
				
				File miFichero = new File("c:\\Ficheros\\byte\\"+resp+".dat");
				try {
					FileOutputStream salida = new FileOutputStream(miFichero);

					System.out.println("Escribiendo datos en disco....");

			
						//salida.write(coleccion);
					
					salida.close();

				} catch (IOException e) {
					System.out.println("Ha habido un problema de entrada y salida" + " producido por la excepción siguiente:");
					e.printStackTrace();
				}
				
				
				
				break;
				
			case 9: 
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
