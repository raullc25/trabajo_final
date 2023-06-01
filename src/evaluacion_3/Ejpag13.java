package evaluacion_3;
import java.util.*; 
//import java.util.Iterator;


public class Ejpag13 
{      public static void main(String[] args) { 
	ArrayList <String>  lista =new ArrayList<String>() ; //crea arrayList vacio
	String  s1="Hola";
	lista.add(s1);
	lista .add("y");
	lista.add("Adiós");

//recorrer la lista de Objetos con for-each de Object 
	for(Object o:lista)
		{ System.out.println(o); } 
	
	ArrayList <String>  lista2 =new ArrayList<String>(3) ; //crea arrayList vacio
	
	lista2.add("Hola");
	lista2 .add("y");
	lista2.add("Adiós");	
	lista2.add("me despido ");
	lista2.add("probando el tamaño maximo ");
	for(Object o:lista2)
			{ System.out.println(o); } 
}
}