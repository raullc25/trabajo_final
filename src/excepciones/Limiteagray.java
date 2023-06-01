package excepciones;

public class Limiteagray {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		boolean indiceNoValido=true;
		int i; //Entero que tomará nos aleatorios de 0 a 9
		String texto[]={"Uno","Dos","Tres","Cuatro","Cinco"};
		while(indiceNoValido){
		try{
		i=(int)(Math.round(Math.random()*9));
		System.out.println(texto[i]);
		indiceNoValido=false;
		}catch(ArrayIndexOutOfBoundsException exc){
		System.out.println("Fallo en el índice");
		}
		}
	}

}
