package Tema4control;
///Jorge Sanchez pag 12 Tema 4
public class Decenas_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("\n");
		System.out.println("Numeros del 1 al 10"); 
		System.out.printf("\n");
		int i=10; ///Valor inicial del contador, empieza valiendo 10 (por supuesto i deberia estar declarada como entera, int)
		while(i<=200) ///condicion del bucle,mientras i sea menor de 200, el bucle se repetirá, cuando i rebase este valor, el bucle termina
		{
			System.out.printf("%d\n",i); /// escribe con formatos printf
			///acciones que ocurren en cada vuelta del bucle en este caso simplemente escribe el valor del contador
			
			i+=10; ///variación del contador, en este caso cuenta de 10 en 10
		}
	}

}
