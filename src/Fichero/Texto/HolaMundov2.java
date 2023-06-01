package Fichero.Texto;

import java.io.*;

//BufferReader;
// creamos flujo de entrada flujoInput para capturar string y el de sal flujosalida
/* s-----&gt; flujo de entrada -----&gt; car a car -----&gt;
* array de caracteres -----&gt; flujo de salida----&gt; consola
* va letra a letra recorriendo s y lo guarda en fichero flujoOutput
* usa como separador de letras &quot;-&quot;
*/

public class HolaMundov2 {
	public static void main(String[] args) throws IOException {
		String s = "Hola Mundo";
//crear un array de caracteres arra donde guardar ese texto
		char[] arr = new char[s.length()];
		int car = 0;
// 1)DECLARAMOS AMBOS FLUJOS
		StringReader flujoInput = new StringReader(s); // leer String
		CharArrayWriter flujoOutput = new CharArrayWriter();
								//2) usar los dos flujos
		try { // mientras no llegue el centinela -1 escribir car a car
			while ((car = flujoInput.read()) != -1) {// car=flujoInput.read();//leer ste caracter y guardar en car
				flujoOutput.write(car);
			}
									//pasar a array de caracteres y guardar en arr
			arr = flujoOutput.toCharArray();

									//mostrarlo por consola el grupo de caracteres
			System.out.println(arr);
		} catch (IOException e) // 3 tratamiento de error
		{
			System.out.println("");
			e.printStackTrace();

		} finally {// 4 cerrar ambos flujos
			flujoInput.close();
			flujoOutput.close();
		}
	}
}