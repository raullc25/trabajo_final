package Tema4control;
 ///Ejercicio pag 14 tema 4
public class bucle_centinela_contador {

	public static void main(String[] args) {
		//

		boolean salir = false; //esta es la centinela
		int n;
		int i=1; //Este es el contador
		while (salir==false&&i<=5) {
			n= (int)Math.floor(Math.random()*500+1);
			System.out.println(n);
			i++;
			salir=(i%7==0);
		}
	}

}
