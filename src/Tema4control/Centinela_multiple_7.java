package Tema4control;

public class Centinela_multiple_7 {

	public static void main(String[] args) {
		//Bucle con centinela que sale cuando llega a un multiplo de 7

		boolean salir=false; ///En este caso el centinela es una variable booleana que inicialmente vale falso
		int n=0;
			System.out.println("Numeros aleatorios hasta el 500");
		while(salir==false)  //Condición de repeticion: que salir siga siendo falso.Ese es el centinela. Tambien se podia haber escrito simplemente: while(!salir)
		{
			n=(int)Math.floor(Math.random()*500+1); ///Lo que se repite en el 
			System.out.println(n); //El centinela vale verdadero si el numero es multiplo de 7
			salir=(n%7==0);
		}
			System.out.println("Este numero= "+n+" es multiplo de 7");
		
		
		
	}
}
