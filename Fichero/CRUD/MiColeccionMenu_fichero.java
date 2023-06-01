package CRUD;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

//Raúl Lucas Castaño 08/04/2023 3º Evaluacion
//Manejaremos datos con arraylist
//todo, cambiar el si/no y agregar comentarios

public class MiColeccionMenu_fichero {
	Scanner sc=new Scanner(System.in);
	ArrayList<String> lista = new ArrayList<String>();
	int opciones=0;

	
	public void anadirdatos() {
			System.out.println("");
			System.out.print("Ingrese un dato: ");
            String datos = sc.nextLine();
            lista.add(datos);   //con la opcion .add podremos añadir los datos al arraylist
            System.out.println("Dato agregado correctamente");	
            System.out.println("\t");
	}
		
	public void consultardatos() {
				 if (lista.isEmpty()) {  //Lo primero que haremos, es comprobar si la lista esta vacia, si es así nos mostrara el siguiente mensaje.
                     System.out.println("No se puede consultar la lista, ya que esta vacia (Ingrese datos, opcion 1)");
                 } else {
                	 //Si la lista no esta vacia procede a mostrar todos los datos
                     System.out.println("Los datos existente en la lista son: " + lista);
                 }
				 System.out.println("\t");
	}

	public void modificardatos() {
				if (lista.isEmpty()){ //Lo primero que haremos, es comprobar si la lista esta vacia, si es así nos mostrara el siguiente mensaje.
    				System.out.println("No se puede modificar la lista, ya que esta vacia (Ingrese datos, opcion 1)");
    			}else {
    				boolean valor = false;
    				int indice=0;
    				
    				while(!valor) {
    			
    				System.out.println("Que opcion quieres modificar: "); //Pedimos que el usuario nos diga que dato quiere modificar
					indice=sc.nextInt();
					sc.nextLine();
    				if (indice>=0 && indice < lista.size()) { //Comprobaremos que el dato que nos ha introducido es correcto y esta dentro de los valores
    					valor=true;
    				} else { //Si el valor es incorrecto, lo mostrara por pantalla e indicara entre que rango tiene que elegir
    					System.out.println("");
    					System.err.println("\n Valor invalido");
    					System.out.println("\n Introduce un valor entre 0 y "+(lista.size()-1));
    					System.out.println("");
    				}
    			}
				System.out.println("Ingrese los nuevos datos: "); //Una vez que tenemos un valor correcto, pedimos la informacion que quiere cambiar
				String datos=sc.nextLine();
				lista.set(indice, datos); //Con la instruccion .set procedemos a cambiar los datos con la nueva informacion que nos ha introducio por teclado
				System.out.println("Dato modificado");
    			}
				System.out.println("\t");
	}
    			

	public void borrardatos() {
				if (lista.isEmpty()){
    				System.out.println("No se puede borrar ningun dato de la lista, ya que esta vacia (Ingrese datos, opcion 1)");
    			}else {

    				int indice=0;
    				
    				while(true) {
    				//Pedimos el valor que quiere eliminar
    				System.out.println("Que opcion quieres eliminar: ");
					indice=sc.nextInt();
					sc.nextLine();
					//Volvemos a comprobar que el indice es correcto, si no lo es se informa y se repite para que introduzca uno correcto
    				if (indice>=0 && indice < lista.size()) {
    					break;
    				}else {
    					System.out.println("");
    					System.err.println("\n Valor invalido");
    					System.out.println("\n Introduce un valor entre 0 y "+(lista.size()-1));
    					System.out.println("");
    				}
    				}
    			
    				
    				System.out.println("");
    				//Antes de borrar pedimos una confirmacion que se solventara con un si o no
    				System.out.println("Quieres borrar la siguiente informacion (si, no): "+lista.get(indice));
    				String confir=sc.nextLine();
    				//Pasamos la informacion que nos ha metido por teclado a minuscula y si es "si" borramos 
    				if (confir.toLowerCase().equals("si")) {
    					lista.remove(indice);  //Con la orden .remove borramos el valor que ha introduccido por teclado
    					System.out.println("Valor borrado");
    				}else {
    					System.out.println("Proceso cancelado");
    				}
    
    			}
				System.out.println("\t");
	}
		
	
	public void variosdatos() {
				System.out.println("");
				System.out.print("Ingrese un dato: ");
	            String datos2 = sc.nextLine();
	            lista.add(datos2); //Añadimos le primer valor
	           
	            System.out.println("Dato agregado correctamente");
	            System.out.println("");
	            System.out.println("Quieres anadir mas datos? (s/n) "); //Preguntamos si quiere añadir mas datos y segun la respuesta hace una cosa u otra
	            
	            String confirm2=sc.nextLine();
				if (confirm2.toLowerCase().equals("si")) {
					while (true) {
						System.out.println("");
						System.out.print("Ingrese otro dato (fin para terminar): ");						
						String datos4 = sc.nextLine();
						
						if (datos4.isEmpty()) { //Si ha introduccido un campo vacio este no se añadira
							System.err.println("Este campo no puede estar vacio");
							System.out.println("");
						}else {
						
			            lista.add(datos4);
						if (datos4.toLowerCase().equals("fin")) {	
							lista.remove(lista.size()-1); //Eliminamos el ultimo dato, asi no aparece el fin para finalizar la orden
							break;
						}	
						}
					}
				}else {
					System.out.println("Se han agregado todos los datos");
				}
			
				System.out.println("\t");
	}
	
	
	public void borrartodo() {
				if (lista.isEmpty()) {
					System.out.println("La lista ya esta vacia");
				}else {
					System.out.println("");
					System.out.println("Quieres borrar toda la lista? (s/n)");
					String confir=sc.nextLine();
					if(confir.toLowerCase().equals("si")) {
					lista.clear();
					System.out.println("\n Se ha borrado todos los datos");
					}else {
						System.err.println("Proceso cancelado");
					}
				}
				
				System.out.println("\t");
	}
	public void salida() {
				System.out.println("");
				System.out.println("Hasta Luego!");

	}
	
	public void guardar() {
		
	
	}
}
		
