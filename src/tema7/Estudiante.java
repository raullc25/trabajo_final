package tema7;

	class Estudiante {
		int a;        //   DINÁMICO se inicializa en cero por cada objeto creado
		static int b; // ESTÁTICO  se inicializa en cero cuando la clase es cargada
	                              // NO se cambia en  cada objeto creado- ATRIBUTO DE CLASE b

		Estudiante() {
			// Constructor que incremente en 1 la variable static b
			b++;
		}
	            // mostramos los dos atributos de Estudiante , de los dos tipos 
		public void mostrarInfo() {
			System.out.println("Valor de a = " + a);
			System.out.println("Valor de b = " + b);
		}
		// en un método static sólo puede declarar o llamar variables static
		// se puede descomentar para ver el error
		/* public static void incrementar(){
		            a++;*/ //No se puede ya que es estatico y no se puede incrementar
          }
	

