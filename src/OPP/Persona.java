package OPP;

public class Persona {
	// Persona tienen nombre y edad 
	//@see http://www.desarrollaraplicaciones.com/2012/12/crear-array-de-objetos-en-java.html
	
	private String nombre;
	private int edad;
	//constructor parametrizado 
	public Persona(String nombre, int edad){
		this.nombre=nombre;
		this.edad=edad;
	}
	//getter's y setter's para los atributos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	//sobrecargamos toString muestra atributos con metodos getter's
	public String toString(){
		String cad="Nombre: "+getNombre()+" con "+getEdad()+" años";
		return cad;
	}
	}
