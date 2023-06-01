package excepciones;
	/****
	 * Division por cero 
	 * metodos para el control de la excepcion 
	 *  * @author Usuario
	 *  @version 3  con mensaje por defecto 
	 */
	public class Division3 {

		public static void main(String... args){
		try{
			int k = 4/0;
			System.err.println("Sigue sin error-----");
		}catch(ArithmeticException e1){
			System.err.println("Division por 0-----");
			System.out.println("Mensaje: "+e1.getMessage());
			//devuelve un mensaje de texto asociado a ese tipo de  excepción
			
			e1.printStackTrace();
			/*envía a la consola el volcado de la pila 	asociado a la excepción. Su uso puede ser tremendamente útil durante la fase
			de desarrollo de la aplicacion, ayudando a detectar errores de programación
			causantes de muchas excepciones*/
			return;
		}finally{
			System.out.println("Finally-----");
		}
			System.out.println("Final del main-----");
		}
	}
	/* salida: 
	 Division por 0-----
	Mensaje: / by zero
	java.lang.ArithmeticException: / by zero
		at Excepciones.Division3.main(Division3.java:12)
	Finally-----
	*/           //finally sera lo ultimo que se ejecute 
