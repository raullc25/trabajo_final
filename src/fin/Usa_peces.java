package fin;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Usa_peces {

	Scanner sc = new Scanner(System.in);
	ArrayList<Pez> listapeces = new ArrayList<>();

	
	
	public void anadirdatos() {
		
		
		System.out.println("Dime la especie: ");
		String nombre = sc.next();
		
		System.out.println("Dime el peso: ");
		Double peso = sc.nextDouble();
		
		
		Pez pez1 = new Pez(nombre, peso, pescador);
		
		listapeces.add(pez1);
		
		
		
		System.out.println("Datos anadidos correctamente");
	}
	
	public void mostrar() {
		if(listapeces.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			for(Pez p:listapeces) {
			System.out.println("El pescador "+ p.getPescador().getNombre() +" la especie es "+ p.getNombre() + " y el peso "+ p.getPeso() );
			}
		}
	}
	
	
	public void variosdatos() {
		
		System.out.println("Dime el pescador: ");
		String nompesca=sc.next();
		
		System.out.println("Dime la especie: ");
		String nombre = sc.next();
		
		System.out.println("Dime el peso: ");
		Double peso = sc.nextDouble();
		
		Pescador pescador = new Pescador(nompesca);
		Pez pez2 = new Pez(nombre, peso, pescador);
		
		listapeces.add(pez2);
		
		System.out.println("Datos anadidos correctamente");
		System.out.println("Quieres anadir mas datos?");
		String entra=sc.next();
		
		boolean pol=true;
		
		while(pol==true) {
		if(entra.toLowerCase().equals("si")) {
			
			System.out.println("Dime el pescador: ");
			String nompesca2=sc.next();
			
			System.out.println("Dime la especie: ");
			String nombre2 = sc.next();
			
			System.out.println("Dime el peso: ");
			double peso2 = sc.nextDouble();
			
			Pescador pescador2 = new Pescador(nompesca2);
			Pez pez3=new Pez(nombre2, peso2, pescador2);
			listapeces.add(pez3);
			
			System.out.println("Anadir  mas datos?");
			entra=sc.next();
			
					
				}else {
				pol=false;
				}
		}
	}
	
	public void borrardato() {

		if(listapeces.isEmpty()) {
			System.out.println("La lista esta vacia");
		}else {
			for(Pez p:listapeces) {
				System.out.println("El pescador "+ p.getPescador().getNombre() +" la especie es "+ p.getNombre() + " y el peso "+ p.getPeso() );
				}
			System.out.println("Que opcion quieres borrar (0-"+(listapeces.size()-1)+")");
			int borrar=sc.nextInt();
			
			if(borrar<0 || borrar>listapeces.size()) {
				System.out.println("El indice es incorrecto");
				System.out.println("Introduce un indice entre 0 y "+listapeces.size());
			}else {
			listapeces.remove(borrar);
		}
		}
	}
	
	public void borrarlista() {
		if(listapeces.isEmpty()) {
			System.out.println("La lista ya se encuentra vacia");
		}else {
			System.out.println("Borrar todos los datos? (si, no)");
			String confirm=sc.next();
			if(confirm.toLowerCase().equals("si")){
				listapeces.clear();
				System.out.println("Lista borrada");
			}else {
				System.out.println("Proceso cancelado");
			}
			
		}
	}
	
	public void modificar() {
		System.out.println("introduzca un valor entre 0 y "+ (listapeces.size()-1));
		System.out.println("Que valor quieres modificar");
		int valor=sc.nextInt();
		
			System.out.println("Dime el pescador: ");
			String nompesca=sc.next();
			
			System.out.println("Dime la especie: ");
			String nombre = sc.next();
			
			System.out.println("Dime el peso: ");
			double peso = sc.nextDouble();
			
			Pescador pescador = new Pescador(nompesca);
			Pez pez = new Pez(nombre, peso, pescador);
		
		listapeces.set(valor, pez);
	}
	
	public void guardarfic() {
		System.out.println("Dime el nombre del archivo");
		String arch=sc.next();
		System.out.print("La ruta donde se ha guardado el archivo es en: ");
		System.out.println("C:\\Ficheros\\" + arch+".txt");
		
		try (FileWriter archivo = new FileWriter("C:\\Ficheros\\trabajo_final\\" + arch +".txt")){

			for(Pez p:listapeces) {
				archivo.write("La especie es "+ p.getNombre() + " y el peso "+ p.getPeso()+"\r\n");

			}
				
		}catch (IOException e) {
			System.out.println("Se produjo la Exception: " + e.getMessage());
			e.printStackTrace();
		}
	}
	
	
	public void leerfich() {
		
		
		
		System.out.println("Dime el nombre del archivo");
		String arch=sc.next();
		System.out.print("Vamos a leer el contenido de: ");
		System.out.println("C:\\Ficheros\\" + arch+".txt");
		
	
		
		try (FileReader archivo2=new FileReader("C:\\Ficheros\\trabajo_final\\" + arch +".txt")){

			int valor=archivo2.read();
            while(valor!=-1){
                System.out.print((char)valor);
                valor=archivo2.read();
            }
            
            
			}catch (IOException e) {
				System.out.println("Se produjo la Exception: " + e.getMessage());
				e.printStackTrace();
			}
		
		
		
	}
}

