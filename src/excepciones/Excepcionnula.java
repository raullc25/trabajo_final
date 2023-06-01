package excepciones;

public class Excepcionnula {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente

		String nombre=null;
		
		System.out.println("Nombre = " + nombre.length());
		try{
			int k = 4/0;
			System.err.println("Nombre nulo-----");
		}catch(ArithmeticException e1) {
			System.err.println("Division por 0-----");
			System.out.println("Mensaje: "+e1.getMessage());			
		}
	}

}
