package Binarios;

import java.io.*;

/**
 * 
 * @author Raul Lucas Castaño
 * @version Version 1
 * @date 02/05/2023
 *
 */

public class LeerBytes {

public static void main (String[] args) throws IOException{

	  if(args.length != 1){
    System.out.println("Debe especificar un nombre de fichero");
    System.exit(-1);
    }

  FileInputStream entrada = new FileInputStream(args[0]);
  String mifich="";
//  File mifich = new File("c:\\ficheros\\byte\\numeritos.txt");
   entrada = new FileInputStream(mifich);
  
  System.out.println("Leyendo datos del disco");  // Lee enteros 
  int miByte;
  //leer el primero fuera del bucle para preguntar por el 
  miByte = entrada.read();			//entrada devuelve int
 int cont=1;								// while (entrada.available()>0)

 while( miByte != -1){
    System.out.println("el numero "+cont +"º es=" + (byte)miByte);
    cont++;
    //leer los siguientes dentro dle bucle 
    miByte = entrada.read();
    }
  }
}
//amplia: que escriba 20 pares, 30 primos,....