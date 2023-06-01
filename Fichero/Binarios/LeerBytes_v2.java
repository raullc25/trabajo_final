package Binarios;

import java.io.*;
import java.util.Scanner;

/**
 * 
 * @author Raul Lucas Castaño
 * @version Version 1
 * @date 02/05/2023
 *
 */

public class LeerBytes_v2 {

public static void main (String[] args) throws IOException{
 /**
	  if(args.length != 1){
    System.out.println("Debe especificar un nombre de fichero");
    System.exit(-1);
    }

  FileInputStream entrada = new FileInputStream(args[0]);
  **/
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Dime el archivo que quieres leer");
	String archivo=sc.nextLine();
  File mifich = new File("c:\\ficheros\\byte\\"+archivo+".dat");
  FileInputStream entrada = new FileInputStream(mifich);
  
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