package animales;

public class perro {
		  // Atributos
		  private String nombre;
		  private int edad;

		  // Constructor con argumentos
		  public perro(String nombre, int edad) {
		    this.nombre = nombre;
		    this.edad = edad;
		  }

		  // Constructor vacío
		  public perro(){};

		  public String toString() {
		    return ("Nombre: " + getNombre() + " Edad: " + getEdad() + "años");
		  }

		  public String getNombre() {
		    return (this.nombre);
		  }

		  public void setNombre(String nombre) {
		    this.nombre = nombre;
		  }

		  public int getEdad() {
		    return (this.edad);
		  }

		  public void setEdad(int edad) {
		    this.edad = edad;
	  }

}

