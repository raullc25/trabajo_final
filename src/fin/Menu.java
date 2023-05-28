package fin;
import java.util.Scanner;
import java.util.ArrayList;
public class Menu {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Pez> listapeces = new ArrayList<>();
		
		
		int opcion=7;
		
		
		do {
			
			
		System.out.println(" __________________________");
		System.out.println("|           Menu           |");
		System.out.println(" __________________________");
		System.out.println("|   1. Anadir dato         |");
		System.out.println("|   2. Mostrar datos       |");
		System.out.println("|   3. Anadir varios datos |");
		System.out.println("|   4. Borrar datos        |");
		System.out.println("|   0. Salir               |");
		System.out.println("|__________________________|");
		System.out.println("");
		System.out.println("Indique la opcion");
		opcion= sc.nextInt();
			
			
			switch(opcion) {
			case 1:
				
				System.out.println("Dime la especie: ");
				String nombre = sc.next();
				
				System.out.println("Dime el peso: ");
				double peso = sc.nextDouble();
				
				Pez pez1 = new Pez(nombre, peso);
				
				listapeces.add(pez1);
				
				System.out.println("Datos anadidos correctamente");
				
				break;
				
			case 2:
				if(listapeces.isEmpty()) {
					System.out.println("La lista esta vacia");
				}else {
					for(Pez p:listapeces) {
					System.out.println("La especie es "+ p.getNombre() + " y el peso "+ p.getPeso());
					}
				}
				
				
				break;
			
			case 3:
				
				System.out.println("Dime la especie: ");
				String nombre1 = sc.next();
				
				System.out.println("Dime el peso: ");
				double peso1 = sc.nextDouble();
				
				Pez pez2 = new Pez(nombre1, peso1);
				listapeces.add(pez2);
				
				System.out.println("Datos anadidos correctamente");
				System.out.println("Quieres anadir mas datos?");
				String entra=sc.next();
				
				boolean pol=true;
				
				while(pol==true) {
				if(entra.toLowerCase().equals("si")) {
					
					
					System.out.println("Dime la especie: ");
					String nombre2 = sc.next();
					
					System.out.println("Dime el peso: ");
					double peso2 = sc.nextDouble();
					
					Pez pez3 = new Pez(nombre2, peso2);
					listapeces.add(pez3);
					
					System.out.println("Anadir  mas datos?");
					entra=sc.next();
					
							
						}else {
						pol=false;
						}
				}
				break;
			
			case 4:
				
				
				
				if(listapeces.isEmpty()) {
					System.out.println("La lista esta vacia");
				}else {
					
					System.out.println("Que opcion quieres borrar");
					int borrar=sc.nextInt();
					
					if(borrar<0 || borrar>listapeces.size()) {
						System.out.println("El indice es incorrecto");
						System.out.println("Introduce un indice entre 0 y "+listapeces.size());
					}else {
					listapeces.remove(borrar);
				}
				}
				
				
				break;
				
			case 5:
				break;
			
			
			default:
				break;
				
			}
		}while(opcion!=0);
		System.out.println("adios");
		sc.close();
	}

}
