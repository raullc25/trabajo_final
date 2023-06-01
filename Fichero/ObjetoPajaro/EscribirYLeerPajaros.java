package ObjetoPajaro;


import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/** * Crea y escribe en un fichero 5 objetos de la clase Persona.
 *  Luego los lee. luego añade otras 5 y los muestra por pantalla.*  */
public class EscribirYLeerPajaros
{
    public static void main(String[] args)
    {
         System.out.println("escribiendo 2 pajaros  en fichero...");
        try
        {	//crear y llenar con 2 paJAROS 
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("c:\\Ficheros\\objetos\\pajaros.obj"));
            Pajaro p1=new Pajaro();	//verde de 0 años
            oos.writeObject(p1);
            Pajaro p2=new Pajaro('a',2);
            oos.writeObject(p2);
            
   //si editamos el fichero aunque sea *txt o *.dat no es legigbe
               
            // ahora cerramos
            oos.close();
        } catch (Exception e)
        	{            e.printStackTrace();       }
    	
    //AÑADIR OTROS 2 PAJAROS  despues  (en otra sesion o dia???)
      System.out.println("añadiendo 2 pajaros  mas en fichero...");
      try
        {
    	  // Se usa un ObjectOutputStream que no escriba una cabecera en el stream.
           
            	      
    MiObjectOutputStream oos = new MiObjectOutputStream(
  	  new FileOutputStream("c:\\Ficheros\\objetos\\pajaros.obj", true));
   /** EL USUAL ESCRIBE CABECERA  Y PROBLEMAS AL AÑADIR MAS OBJETOS     
    ObjectOutputStream oos = new ObjectOutputStream(
    	  new FileOutputStream("c:\\ficheros\\pajaros.obj"));
      ****/      
    	Pajaro p3=new Pajaro('v',3);
    	oos.writeObject(p3);// se debe usar   ......  
    
    	
    	Pajaro p4=new Pajaro('g',4);
    	oos.writeObject(p4);
  
         oos.close();
        } catch (Exception e)
        	{       e.printStackTrace();        	}
    
 
    System.out.println("mostramos los 4 pàjaros del fichero...");
        try
        {
            // Se crea un ObjectInputStream  ois  SE ABRE PARA LEER DE EL 
            ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("c:\\Ficheros\\objetos\\pajaros.obj"));
            
            // Se lee el primer objeto fuera del bucle 
            Object aux = ois.readObject();
            Pajaro paj;
            // Mientras haya objetos leer siguientes hasta null
            while (aux!=null)
            {	//aux es un objeto de tipo pajaro hay que desserializarlo
            	//si mostramos aux sera la direccion del objeto pajaro
   //SIN IF ???????????????????????????????    
             if (aux instanceof Pajaro)
                { paj= (Pajaro) aux;	//pasar aux a tipo Pajaro
                   paj.DatosPajaro()  ;
                }
               aux = ois.readObject();  //leer otro objeto pajaro
            }
            ois.close();
        }
        catch (EOFException e1)
        	{	     System.out.println ("Fin de fichero");
        	}
        catch (Exception e2)
        	{  e2.printStackTrace();     	}
    }
 
    
}