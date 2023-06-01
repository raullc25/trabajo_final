package excepciones;
/* ejemplo2  . Guardar en paquete Excepciones
 * version2  Division por cero con control de excepciones 
 * Aunque haya varios tipos posibles de catch que puedan capturar una
excepción, solo uno de ellos será ejecutado cuando esta se produzca. La
búsqueda de los bloques catch se realiza de forma secuencial, de modo que el
primer catch coincidente será el que se ejecutara. 
*/
public class Division2 {
	public static void main(String... args){
		try{
			int k = 4/1;
		    System.out.println("Sigue sin error-----");
		}catch(ArithmeticException e1){
		System.out.println("ArithmeticException-----");// entrara y... luego
		}catch (Exception e2){
		System.out.println("Exception-----");
		}
		finally {System.out.println("Finally----");
		}
			
		// no ejecutar la primera vez
		 System.out.println("Final del main-----");
		}
	}
	/*
	 * entrara y Del punto anterior deducimos otra cosa: tras la ejecución de un bloque catch,
	el control del programa nunca se devuelve al lugar donde se ha producido la
	excepción.
	ORDEN: los catch más específicos deben estar situados por delante de los
	más genéricos  de no ser así SE PRODUCIRA ERROR DE COMPILACION
	CUANTOS: Los bloques catch son opcionales
	Uso finally solo si al menos hay un bloque catch
	}
	/* salida1 : 
	 * ArithmeticException-----
		Finally-----
		
		salida2:  quitamos comentario lineas finales 24-25
		ArithmeticException-----
	Finally----
	Final del main-----

	 */

