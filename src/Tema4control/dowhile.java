package Tema4control;
///Ejercicio pag14 tema 4
public class dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Estos son los multiplos de 50 hasta llegar al numero 1000");
		int i=1000;  //Inicializamos i a 0
		do {
			i+= 50; //Incrementamos de 50 en 50
			System.out.println(i);
		}
		while(i<1000);
	}

}
