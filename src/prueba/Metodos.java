package prueba;

import java.util.Scanner;

import fin.Usa_peces;

public class Metodos {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int opcion=7;
		
		Main pez = new Main();
		
		
		do {
			
			
			System.out.println(" ____________________________");
			System.out.println("|                            |");
			System.out.println("|      GESTION DE PECES      |");
			System.out.println("|____________________________|");
			System.out.println("|                               |");
			System.out.println("|   1. Agregar pescador          |");
			System.out.println("|   2. Mostrar pescador         |");
			System.out.println("|   3. Anadir pez a un pescador |");
			System.out.println("|   4. Eliminar pez a un pescador |");
			System.out.println("|   5. Borrar lista             |");
			System.out.println("|   6. Guardar en un fichero    |");
			System.out.println("|   7. Leer el fichero       |");
			
			
			System.out.println("|   . Modificar pez            |");
			
			System.out.println("|   0. Salir                 |");
			System.out.println("|____________________________|");
			System.out.println("");
			System.out.print("\n Indique la opcion: ");
			opcion= sc.nextInt();
			System.out.println("");
				
				
				switch(opcion) {
				case 1:
					
					pez.agregarPescador();
					
					break;
					
				case 2:
					
					pez.mostrarPescadores();
					
					break;
				
				case 3:
					
					pez.agregarpez();
					
					break;
				
				case 4:
					
					pez.eliminarpezpesc();
			
					break;
					
				case 5:
					
					pez.eliminarlist();
			
					break;
					
				case 6:
					
					pez.guardarfic();
					
					break;
					
				case 7:
					
					pez.leerfich();
					
					break;
				
			
				
			default:
				System.out.println("Indice incorrecto");
				break;

				

				
			}
		}while(opcion!=0);
		System.out.println("ADIOS");
		sc.close();
	}

}
