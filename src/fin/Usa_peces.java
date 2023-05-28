package fin;

import java.util.Scanner;
import java.util.ArrayList;

public class Usa_peces {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Pez> listapeces = new ArrayList<>();
		
		System.out.println("Dime la especie: ");
		String nombre = sc.nextLine();
		
		System.out.println("Dime el peso: ");
		double peso = sc.nextDouble();
		
		Pez pez1 = new Pez(nombre, peso);
		
		listapeces.add(pez1);
		
		System.out.println("Datos anadidos correctamente");
		
		
		
		for(Pez p:listapeces) {
			System.out.println("La especie es "+ p.getNombre() + " y el peso "+ p.getPeso());
		}
		
		sc.close();
	}

}
