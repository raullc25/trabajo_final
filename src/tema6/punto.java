package tema6;

public class punto {

	int posX;
	int posY;
	
	public punto(int posX, int posY) {  //constructor parametrizado con dos parámetros
		super();
		this.posX = posX;
		this.posY = posY;
	}
	
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	void modificarCoords(int posX, int posY) {   //parametros en gris
		/*Hay ambigüedad ya que posX es el nombre de uno de 
		 * los parametros, y además el nombre de una de las 
		 * propiedades de la clase Punto
		 */
		this.posX=posX; //this permite evitar la ambigüedad
		this.posY=posY;
	}
	@Override
	public String toString() {
		return "punto [getPosX()=" + getPosX() + ", getPosY()=" + getPosY() + "]";
	}
	
	
}
