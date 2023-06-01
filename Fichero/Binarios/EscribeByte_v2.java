package Binarios;
import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Raul Lucas Castaño
 * @version Version 1
 * @date 02/05/2023
 * Escribe los numeros en el fichero, creandolo con el nombre que tu le pases
 *
 */


public class EscribeByte_v2 {                                								
	// byte en lugar de int
	// puede ser array de pares, impares, primos,...
            
	private static int[] numeros = { 12, 14, 16, 18, 10 };

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);		

		System.out.println("Dime como quieres llamar al archivo");
		String resp=sc.nextLine();
		
		File miFichero = new File("c:\\Ficheros\\byte\\"+resp+".dat");
		try {
			FileOutputStream salida = new FileOutputStream(miFichero);

			System.out.println("Escribiendo datos en disco....");

			for (int i = 0; i < numeros.length; i++) { // de 1 en 1 coge el dato entero y lo escribe con write
														// salida.write( (byte) lista[i])-se hace el casting
														// automaticamente
				salida.write(numeros[i]);
			}
			salida.close();

		} catch (IOException e) {
			System.out.println("Ha habido un problema de entrada y salida" + " producido por la excepción siguiente:");
			e.printStackTrace();
		}
		// parte II al contrario ver LeerBytes
		sc.close();

	}// main

}