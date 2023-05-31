package fin;
import java.util.Scanner;
import java.util.ArrayList;
public class Pescador {
	
	ArrayList<Pescador> listapescadores = new ArrayList<>();
	
	
	private String nombre;
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Pescador(String nombre) {
		this.nombre=nombre;
	}
	
Scanner sc = new Scanner(System.in);

public void agregarpescador() {
	System.out.println("Ingrese el nombre del pescador: ");
	String nompesc = sc.nextLine();
	Pescador pescador = new Pescador(nompesc);
	listapescadores.add(pescador);
		
}


public void mostrarpesc() {
	if(listapescadores.isEmpty()) {
		System.out.println("La lista esta vacia");
	}else {
		for(Pescador pescador: listapescadores) {
			System.out.println("- "+pescador.getNombre());
		}
	}
}




}




