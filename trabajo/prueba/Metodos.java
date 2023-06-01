package prueba;

import java.util.Scanner;


public class Metodos {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int opcion=7;
		
		Main pez = new Main();
		
		
		do {
			
			
			System.out.println(" ____________________________________");
			System.out.println("|                                    |");
			System.out.println("|          GESTION DE PECES          |");
			System.out.println("|____________________________________|");
			System.out.println("|                                    |");
			System.out.println("|   1. Agregar un pescador           |");
			System.out.println("|   2. Mostrar pescadores            |");
			System.out.println("|   3. Eliminar un pescador          |");
			System.out.println("|   4. Anadir pez a un pescador      |");
			System.out.println("|   5. Mostrar peces de un pescador  |");
			System.out.println("|   6. Eliminar pez a un pescador    |");
			System.out.println("|   7. Borrar lista                  |");
			System.out.println("|   8. Guardar en un fichero         |");
			System.out.println("|   9. Leer el fichero               |");
			
			
			//System.out.println("|   . Modificar pez            |");
			
			System.out.println("|   0. Salir                         |");
			System.out.println("|____________________________________|");
			System.out.println("");
			System.out.print("\n Indique la opcion: ");
			opcion= sc.nextInt();
			System.out.println("");
				
				
				switch(opcion) {
				case 1:
					
					Main.agregarPescador();
					
					break;
					
				case 2:
					
					Main.mostrarPescadores();
					
					break;
					
				case 3:
					
					Main.eliminarpezpesc();
					
					break;
					
				
				case 4:
					
					Main.agregarpez();
					
					break;
				
				case 5:
					
					Main.mostrarPecesDePescador();
			
					break;
					
				case 6:
					
					Main.eliminarpezpesc();
			
					break;
					
				case 7:
					Main.eliminarlist();
					
					
					break;
					
				case 8:
					
					pez.guardarfic();
					
					break;
					
				case 9:
					
					pez.leerfich();
			
					break;
					
					
					
				case 0:
					
					System.out.println("ADIOS");
				
					break;
			
					
				
			default:
				System.out.println("Indice incorrecto");
				break;

				

				
			}
		}while(opcion!=0);

		sc.close();
	}

}
