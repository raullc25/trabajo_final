package Tema4control;
	import java.util.Scanner;  //Importar la clase para teclado
public class CalificaNota1 {      // clase para calificar las notas usando un if---->CalificaNota1
		public static void main(String[] arg) {
			int notas;
			System.out.println("Introduce tu nota: ");
			Scanner scan=new Scanner(System.in);
			notas=scan.nextInt();
					if(notas>=5)
						System.out.println("APROBADO");
					
				else    System.out.println("SUSPENSO");     //Si no aprueba está suspenso
														    //SI esta entre 0 y 4 inclusive entonces
															//Cerramos el teclado
		scan.close();
	}
	
}
