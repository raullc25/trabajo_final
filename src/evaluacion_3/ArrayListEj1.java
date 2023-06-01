package evaluacion_3;
//ejemplo1 de arraylista  de palabras  llamada lista 

/**Métodos de ArrayList 



• int size() -- El tamaño actual (puede ser 0) 
• void add(obj) -- Añade un objeto al final del ArrayList, incrementando su tamaño de 

1. obj es un objeto. 


• Object get(N) -- Devuelve el elemento almacenado a la posición N en el ArrayList. 

N tiene que ser un entero entre 0 y size()-1. 



* **/

/**Los ArrayList son una especie de array dinámico o lista. Esto hace que no le

*  demos una cantidad de elementos que tiene que contener sino que va a crecer

*   o decrecer según tengamos ganas. Dentro del ArrayList pondremos objetos.

* **/





import java.util.*; 

	public class ArrayListEj1{ 

	public static void main(String[ ] args) { 

	ArrayList<String> lista = new ArrayList<String>( ) ; 

	//añadirle elementos con .add siempre al final
	//set cambia mientras que add añade
		
	lista.add("hola ") ; 

	lista.add("me "); 

	lista.add("llamo ") ; 

	lista.add("Raul, " ); 
	
	lista.add("y ");
	
	lista.add("este ");
	
	lista.add("es ");
	
	lista.add("mi ");
	
	lista.add("primer ");
	

	System.out.println("Lo recorremos con un bucle for de forma ascendente: ");
	//recorrer usando un bucle y 

		//conocer tamaño con .size() como Array

		//capturar ste elemento de lista usando .get

	for (int i=0;i<lista.size( )  ;i++) 

		System.out.print(lista.get(i) + " " ) ; 

		System.out.println("\n"); 

	/** /ahora al reves	//Lo recorremos con un for
	 * Por que es una lista ordenada, lo uso moviendo el indice al reves
	 */
	
	System.out.println("Lo recorremos con un bucle for de forma descendente: ");


	int tam=lista.size( )-1;

	for (int i=tam; i>=0  ;i--) 

		System.out.print(lista.get(i) + " " ) ; 
	
	
	/////////Dia 30/03/2023   pag10, tema9 Jorge Sanchez

	System.out.println("\n");
	System.out.println("**********************************************");
	System.out.println("");
	
	//Lo recorremos con un iterador
	System.out.println("Lo recorremos con un interator de forma ascendente: ");

	Iterator<String> it = lista.iterator();
		while (it.hasNext()) {
			String s=(String)it.next(); //next devuelve objeto
			System.out.print(s+" ");
		}
		
		
		System.out.println("\n");
	
		
	System.out.println("Lo recorremos con un interator de forma descendente: ");

		
	ListIterator<String> i1 = lista.listIterator(lista.size()); //Con listiterator podemos añadir previous.(Para recorrerlo al reves)
		while (i1.hasPrevious()) {
			String s2=(String)i1.previous();
			System.out.print(s2 +" ");}
			
		
		System.out.println("\n");
		System.out.println("Lo recorremos con un interator de forma ascendente cambiando el primer valor y el ultimo: ");

		//Vamos a cambiar el primer valor y el ultimo del arraylist
		ListIterator<String> it3 = lista.listIterator(lista.size());
				while (it3.hasNext()) {
				lista.set(9, "first");
				String s3=(String)it3.next(); 
				System.out.print(s3+" ");
			}
			
			
			System.out.println("\n");
			lista.clear();
			System.out.println("Mostramos el array despues de borrar");
			System.out.println(lista);
			
//			System.out.println("\n");
//			lista.add(1, "holaa");
//			System.out.println("Mostramos el array despues de añadir");
//			System.out.println(lista);
			
			System.out.println("\n");
			lista.set(0, "Alfonso");
			System.out.println("Mostramos el array despues de modificar");
			System.out.println(lista);
		} 

	} 

