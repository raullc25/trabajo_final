package Fichero;
import java.io.*;

/**
 * Decodifica el archivo previamente codificado y lo muestra por consola.
 * @author Raúl Lucas Castaño
 * 25-04-2023
 *
 */

public class Decodificar {
	
	public static void main(String[] argumentos) {
        String s="";
        char letra;			
       
        FileInputStream file=null;	//apunta a ningun sitio
        System.out.println("Mostramos el contenido del fichero decodificado  \n");
        try {
        							
        	file = new  FileInputStream("C:\\Ficheros\\quijotecodificado3.txt");
               
            int size=file.available();
            
            System.err.println("Decodificado");
            for (int i=0;i<size;i++){    
                letra= (char) file.read(); 		
                    
                if(letra=='1') {
                	s=s+"a";
                	
                }else if(letra=='2'){
                	s=s+"e";
                
                }else if(letra=='3'){
                	s=s+"i";
                	
                }else if(letra=='4'){
                	s=s+"o";
                	
                }else if(letra=='5'){
                	s=s+"u";
                	
                }else if(letra=='♦'){
                	s=s+"n";
                	
                }else{
                	s=s+letra;
                	
                }
             }

      
         
        } catch (IOException e){   	  e.printStackTrace();
            
    } finally{
        	System.out.println(s);  //mostrar String despues de leido
        	try{file.close();		
              }
        	catch(IOException e)
        	{ e.printStackTrace();
                }
        }         
    }
}