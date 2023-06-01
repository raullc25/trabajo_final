package colecciones;
//Tema 9 -- Otras colecciones
import java.util.*;
public class DiccionarioSinonimos {

	public static void main(String[] args) {
	
		
// 1 añado datos (PAREJAS)CLAVE   ELEMENTO son posicionales
		Hashtable dic  = new Hashtable();
		dic.put("batalla", "guerra");
		dic.put("bonito", "hermoso");
		dic.put("billete", "boleto");
		dic.put("facil", "sencillo");
		dic.put("flaco", "delgado");


		
		System.out.println("");
		
//2  recuperar datos del diccionario      dic.get(buscado=>devuleve col2 (inglés)
		String saludo = (String) dic.get("Hola") ;
		String objeto = (String) dic.get("Coche");
		String casa = (String) dic.get("Mesa");
		
		System.out.println("");
	
		System.out.println("Un saludo es "+ saludo);
		System.out.println("Un objeto es un "+ objeto);
		System.out.println("Un objeto de casa es una "+ casa);
		
		System.out.println("");
		
//3 tamaño variable-mostrar 		
		System.out.println("El tamaño del diccionario es "+ dic.size() + " pares");
		
		System.out.println("");
		
//4 comprobar si contiene una clave en la columna1 (en español		)
		
				if( dic.containsKey("Hola") ){
					System.out.println("dic contiene HOLA como clave");
				}else{
					System.out.println("dic NO contiene HOLA como clave");
				}
				
				if( dic.contains("Hello") ){
					System.out.println("dic contiene HELLO como valor");
				}else{
					System.out.println("dic NO contiene HELLO como valor");
				}
				
//5.1 mostrar columna de claves o en español usando enumeracion	
				
				System.out.println("Mostrando CLAVES (KEYS) de la tabla hash...");
				Enumeration k = dic.keys();
				while( k.hasMoreElements() )
					System.out.println( k.nextElement() );

				System.out.println("Mostrando ELEMENTOS  de la tabla hash...");
				Enumeration e = dic.elements();
				while( e.hasMoreElements() ) System.out.println( e.nextElement() );
				
//6 eliminar un dato con remove (diciendo su clave) y comprobar
				System.out.println( "Eliminando el dato " + dic.remove("HOLA"));
				System.out.println("Mostrando todos los datos DESPUES...");
				k = dic.keys();
				while( k.hasMoreElements() ) System.out.println( k.nextElement() );

//7 editar
				dic.replace("Hola", "folio");
				System.out.println(dic);
				
				
				
				
				
		System.out.println(dic.get("Mesa"));
		
		System.out.println(dic.clone());
		System.out.println(dic.toString());
		System.out.println("¿Esta vacio? " + dic.isEmpty());
		
	}

}
