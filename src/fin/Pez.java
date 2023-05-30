package fin;

public class Pez {

	private String nombre;
	private double peso;
	private Pescador pescador;
	
	
	public Pez(String nombre, double peso, Pescador pescador) {
		this.nombre = nombre;
		this.peso = peso;
		this.pescador = pescador;
	}	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre( String nombre) {
		this.nombre=nombre;
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		this.peso=peso;
	}
	
	public Pescador getPescador() {
		return pescador;
	}
	


	
	
}
