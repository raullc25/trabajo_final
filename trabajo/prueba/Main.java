package prueba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class Main {

	private static Scanner sc = new Scanner(System.in);
	private static ArrayList<Pescador> pescadores = new ArrayList<>();
	private static ArrayList<Pez> listapeces = new ArrayList<>();
	
	
	
	 public static void agregarPescador() {
	        System.out.print("Ingrese el nombre del pescador: ");
	        String nombrePescador = sc.next();
	        Pescador pescador = new Pescador(nombrePescador);
	        pescadores.add(pescador);
	        System.out.println("Se agregó el pescador " + nombrePescador + " correctamente.");
	    }
	 
	 public static void eliminarpesc() {
		 if(pescadores.isEmpty()) {
			 System.out.println("La lista de pescadores se encuentra vacia, ingrese algun pescador primero");
		 }else {
		 System.out.println("Dime el pescador que quieres eliminar");
		 String nompes=sc.next();
		 
		 Iterator<Pescador> iterator = pescadores.iterator();
	        while (iterator.hasNext()) {
	            Pescador pescador = iterator.next();
	            if (pescador.getNombre().equals(nompes)) {
	                iterator.remove();
	                System.out.println("Se eliminó el pescador " );
	                return;
	            }
	        }
	        System.out.println("No se encontró el pescador " );
	    }
 }

	
	 public static void mostrarPescadores() {
	        if (pescadores.isEmpty()) {
	            System.out.println("No hay pescadores en la lista.");
	        } else {
	            System.out.println("Lista de pescadores:");
	            for (Pescador pescador : pescadores) {
	                System.out.println("- " + pescador.getNombre());
	                
	            }
	        }
	    }
	 
	 
	 public static void agregarpez() {
		 
		 if(pescadores.isEmpty()) {
			 System.out.println("No hay pescadores en la lista. Por favor, agregue un pescador primero.");
			 return;
		 }
		 
		 System.out.println("Ingrese el nombre del pescador: ");
		 String nompesca = sc.next();
		 
		 Pescador pescadorselec = null;
		 for(Pescador pescador : pescadores) {
			 if(pescador.getNombre().equals(nompesca)) {
				 pescadorselec = pescador;
				 break;
			 }
		 }
		 
		 if(pescadorselec==null) {
			 System.out.println("No se encontró el pescador " + nompesca + " en la lista.");
	            return;
		 }
		 
		 	System.out.print("Ingrese el nombre del pez: ");
	        String nombrePez = sc.next();
	        System.out.print("Ingrese el peso del pez: ");
	        double pesoPez = sc.nextDouble();
	        
	        pescadorselec.anadirpez(nombrePez, pesoPez); 
	 }
	 
	 
	 public static void eliminarpezpesc() {
	        if (pescadores.isEmpty()) {
	            System.out.println("No hay pescadores en la lista. Por favor, agregue un pescador primero.");
	            return;
	        }
	        
	        System.out.print("Ingrese el nombre del pescador: ");
	        String nombrePescador = sc.next();

	        Pescador pescadorSeleccionado = null;
	        for (Pescador pescador : pescadores) {
	            if (pescador.getNombre().equals(nombrePescador)) {
	                pescadorSeleccionado = pescador;
	                break;
	            }
	        }

	        if (pescadorSeleccionado == null) {
	            System.out.println("No se encontró el pescador " + nombrePescador + " en la lista.");
	            return;
	        }

	        System.out.print("Ingrese el nombre del pez a eliminar: ");
	        String nombrePez = sc.next();

	        pescadorSeleccionado.eliminarpez(nombrePez);
	        
	    }
	 
	 public static void mostrarPecesDePescador() {
	        if (pescadores.isEmpty()) {
	            System.out.println("No hay pescadores en la lista. Por favor, agregue un pescador primero.");
	            return;
	        }
	 
	        System.out.print("Ingrese el nombre del pescador: ");
	        String nombrePescador = sc.next();

	        Pescador pescadorSeleccionado = null;
	        for (Pescador pescador : pescadores) {
	            if (pescador.getNombre().equals(nombrePescador)) {
	                pescadorSeleccionado = pescador;
	                break;
	            }
	        }

	        if (pescadorSeleccionado == null) {
	            System.out.println("No se encontró el pescador " + nombrePescador + " en la lista.");
	            return;
	        }

	        pescadorSeleccionado.mostrarpeces();
	    }
	 
	 
	 public static void eliminarlist() {
			if(pescadores.isEmpty()) {
				System.out.println("La lista ya se encuentra vacia");
			}else {
				System.out.println("Borrar todos los datos? (si, no)");
				String confirm=sc.next();
				if(confirm.toLowerCase().equals("si")){
					pescadores.clear();
					System.out.println("Lista borrada");
				}else {
					System.out.println("Proceso cancelado");
				}
				
			}
		}
	 
	 
	 public void guardarfic() {
			System.out.println("Dime el nombre del archivo");
			String arch=sc.next();
			System.out.print("La ruta donde se ha guardado el archivo es en: ");
			System.out.println("C:\\Ficheros\\" + arch+".txt");
			
			try (FileWriter archivo = new FileWriter("C:\\Ficheros\\trabajo_final\\" + arch +".txt")){

				for(Pescador pescador : pescadores) {
					archivo.write("El pescador es "+ pescador.getNombre());
					
					for(Pez pez :listapeces) {
						archivo.write("La especie es "+ pez.getNombre() +" con un peso de "+pez.getPeso()+"KG");
					}

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
	 
	 

