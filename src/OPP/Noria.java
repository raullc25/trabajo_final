package OPP;

/**  u.t7 sobre Jorge Sanchez: creacion de la clase ampliada Noria sobre Pag 43
 * @author Isabel Cortes     
 * atributos: radio real
 * 			+ velocidad 	
 * metodos: parar() 	la pone a velocidad cero
 * 			girar(int)  incrementa el giro en el parametro pasado ( sube velocidad de giro)
 * 			+ EstadoNoria  muestra sus 2 atributos
 * 			+ VelNoria 	  devuelve la velocidad
 *          +Noria      constructor que la inicializa a 0 
 * 	Notacion ahora: los atributos o propiedades de clase se muestran en cursiva y azul		
 */
public class Noria
 { // Se define la clase Noria sus atributos y sus métodos
     static double radio;
     private static int  velocidad;			//static para poder ser usado en metodos
    void Noria ()
    	{     velocidad=0;		//CONSTRUCTOR se inicializa la velocidad de la Noria a 0
    		  radio=0;			//se inicializa el radio a 0
    	    }
    static void girar (int incremento)
    	{ //instrucciones del metodo girar
    	velocidad=velocidad+incremento;
    	}
	static void parar ()
	{  velocidad=0;
		//instrucciones del metodo parar
	}
	static int VelNoria ()
	{ return velocidad;
	}
	static void EstadoNoria()
	{ System.out.printf("\n La noria tiene velocidad=%2d",velocidad);
	 System.out.printf("\n La noria tiene radio = %2.2f", radio);
	}
	public static void main(String[] args) 
      {// desde aqui podemos usar la clase contador, crear uno y operar con él.
		Noria MiNoria = new Noria();
		 System.out.println("Mi Noria.....");
		EstadoNoria();
	   MiNoria.radio= 10;				// Mejor seria CambioRadio(10)  se CAMBIA  el atributo radio a 10
	   MiNoria.girar(5);				//Mejor seria 
	   EstadoNoria();
	   //consultar y mostrar la velocidad
	   System.out.printf("\n la velocidad ES PUES %d ", VelNoria());
	   //incrementar vel en 10 y mostrar de nuevo
	   MiNoria.girar(10);	
	   EstadoNoria();
	   
      }
	
 }//clase  Noria
	 