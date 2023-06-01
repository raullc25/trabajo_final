package Fichero.Texto;
import java.io.*;
/*tema10  Crear fichero de textos  desde string   
*   tenemos s---> car a car--->(byte) pasar a stream de salida  FileOutputStream
*  * crea archivo de texto "C:\\Ficheros\\prueba.txt" 
*      si existe lo sobreescribe
*  repaso de tratamiento de excepciones:  	try -catch- finally
*  salida:  en C: dentro de carpeta Ficheros------> prueba.txt   
*  */
public class SaltoLinea {
   public static void main(String[] argumentos) {
       
       char c=0;
       //1) declarar fuera de try el stream ----->   ¿pue meterse en try                    para que finally pueda verlo
       FileOutputStream file=null;	//apunta a ningun sitio
       String s="\"En un lugar de la mancha \r\ncuyo nombre \r\nno quiero acordarme";           //Con \r\n podremos saltar de linea.
       System.out.println("Escribimos un verso del quijote con salto de linea en el fichero de texto");
      
       //2) recorre s letra a letra y lo escribe 
       try {
           file = new  FileOutputStream("C:\\Ficheros\\quijotesalto.txt");
              //pasar caracteres del string de 1 en 1 a file 
           
           for (int i=0;i<s.length();i++)
              { //recorre las letras de s y lo escribe letra a letra en dos stream  
              
              	c= s.charAt(i); 			// pasar letra en pos i a c
               file.write( (byte)  c);		//escribir byte equivalente en file
                System.out.print(c); 	   //escribir en consola (hacer eco)
              }
        
       } catch (IOException e)
       	{
           System.out.println("Se produjo la Exception: " + e.getMessage());
           e.printStackTrace();
           }
       
       finally{   // if  (file!=null )  // si no se cerro hacerlo ahora 
       	try{file.close();		//cerrar flujo de salida dentro try-catch
             }
       	catch(IOException e)
       	{ e.printStackTrace();
               }
       }       
   }
} 		
			
			
			/*vemos la salida del texto ahora en  C:\\Ficheros\\Quijote.txt"
   		En un lugar de la mancha de cuyo nombre no quiero acordarme...."
   		*/
           //AMPLIAR: meter varias lineas usando \n