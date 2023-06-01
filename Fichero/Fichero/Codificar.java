package Fichero;
import java.io.*;
/**
 * 
 * Codifica el String en este caso El Quijote, según el patrón. Crea al archivo,
 * en la carpeta fichero.
 * 
 * @author Raúl Lucas Castaño
 * @version <b><h2>version2</h2></b> 25/04/2023
 *
 *
 */
public class Codificar {
	
	public static void main(String[] args) {
	
		FileOutputStream file2 = null;
		String s = "En un lugar de La Mancha, de cuyo nombre no quiero acordarme, no hace mucho tiempo que vivía un hidalgo de los de lanza y astillero, adarga antigua, rocín flaco y galgo corredor. ";

		System.out.println("Escribimos un verso del Quijote en el fichero de texto");
		System.out.println("");
		System.err.println("Sin Codificar:");
		System.out.print(s.toLowerCase());
		System.out.println("");
		System.out.println("");
		System.err.println("Codificado:");

		try {

			file2 = new FileOutputStream("C:\\Ficheros\\quijotecodificado4.txt");

				for (int i = 0; i < s.length(); i++) {
					char caracter = s.toLowerCase().charAt(i);
					if (caracter == 'a' || caracter == 'á') {
						file2.write('1');
						System.out.print("1");
					} else if (caracter == 'e' || caracter == 'é') {
						file2.write('2');
						System.out.print("2");
					} else if (caracter == 'i' || caracter == 'í') {
						file2.write('3');
						System.out.print("3");
					} else if (caracter == 'o' || caracter == 'ó') {
						file2.write('4');
						System.out.print("4");
					} else if (caracter == 'u' || caracter == 'ú') {
						file2.write('5');
						System.out.print("5");
					} else if (caracter == 'n') {
						file2.write('§');
						System.out.print('♦');
					} else {
						file2.write(caracter);
						System.out.print(caracter);
					}
				}

				} catch (IOException e) {
					System.out.println("Se produjo la Exception: " + e.getMessage());
					e.printStackTrace();
				}

				finally {
					try {
						file2.close(); // cerrar flujo de salida dentro try-catch
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}	