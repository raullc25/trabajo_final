package fin;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int opcion=7;
		
		Usa_peces pez = new Usa_peces();
		
		
		do {
			
			
		System.out.println(" ____________________________");
		System.out.println("|                            |");
		System.out.println("|      GESTION DE PECES      |");
		System.out.println("|____________________________|");
		System.out.println("|                            |");
		System.out.println("|   1. Anadir pez            |");
		System.out.println("|   2. Mostrar peces         |");
		System.out.println("|   3. Anadir varios peces   |");
		System.out.println("|   4. Borrar pez            |");
		System.out.println("|   5. Borrar lista          |");
		System.out.println("|   6. Modificar pez         |");
		System.out.println("|   7. Guardar en un fichero |");
		System.out.println("|   8. Leer el fichero       |");
		System.out.println("|   0. Salir                 |");
		System.out.println("|____________________________|");
		System.out.println("");
		System.out.print("\n Indique la opcion: ");
		opcion= sc.nextInt();
		System.out.println("");
			
			
			switch(opcion) {
			case 1:
				
				pez.anadirdatos();
				
				break;
				
			case 2:
				
				pez.mostrar();
				
				break;
			
			case 3:
				
				pez.variosdatos();
				
				break;
			
			case 4:
				
				pez.borrardato();
		
				break;
				
			case 5:
				
				pez.borrarlista();
				
				break;
			
			case 6:
				
				pez.modificar();
				
				break;
				
				
			case 7:
					
				pez.guardarfic();
				
				break;
				
				
			case 8:
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



