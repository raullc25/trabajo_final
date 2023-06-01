package prueba;

import java.util.ArrayList;
import java.util.Iterator;

public class Pescador {

	    private String nombre;

	    public Pescador(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getNombre() {
	        return nombre;
	    }
	
	    
	    ArrayList<Pez> listapeces = new ArrayList<>();
		
		
		public void anadirpez(String nompez, double peso) {
			Pez pez = new Pez (nompez, peso);
			listapeces.add(pez);
			System.out.println("Se agrego el/la "+ nompez + " al pescador " + nombre);
			
		}
		
		
		public void eliminarpez(String nompez) {
			Iterator<Pez> iterator = listapeces.iterator();
	        while (iterator.hasNext()) {
	            Pez pez = iterator.next();
	            if (pez.getNombre().equals(nompez)) {
	                iterator.remove();
	                System.out.println("Se eliminó el/la " + nompez + " del pescador " + nombre);
	                return;
	            }
	        }
	        System.out.println("No se encontró el/la " + nompez + " en la lista del pescador " + nombre);
	    }
		
	    
		public void mostrarpeces() {
			if(listapeces.isEmpty()) {
				System.out.println("El pescador " + nombre + " no tiene peces en su lista.");
			}else {
				System.out.println("Lista de peces del pescador " + nombre + ":");
	            for (Pez pez : listapeces) {
	                System.out.println("Nombre: " + pez.getNombre() + ", Peso: " + pez.getPeso());
			}
		}
		}
	    
}
