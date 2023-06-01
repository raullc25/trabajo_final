package Tema4control;
	import java.util.Scanner; 

//Ejercicio pag 16 tema 4 Jorge Sanchez
public class For100 {

	public static void main(String[] args) {
		//Lo hacemos primero con bucle for
		
		for(int i=1;i<=100;i+=10)
		System.out.println(i);
		
		
		
		{
			//Ahora lo vamos a hacer con while
			int i=1;                     //inicializamos la i con valor 1
			while(i<=1000) {            //Cuando sea <1000 seguira incrementando
				System.out.println(i); 
				i+=50;  //El incremento sera de 50 en 50
			}
		}
			
		{	
			for(int i=1;i<=300;i++){
				System.out.println(i);
				//if(i==300)break;
			}
		}
			
		
		
		{
			int numero;       //Inicializamos la variable numero
			System.out.println("Dime un numero y te dire las decenas hasta llegar a el");   //Pedimos el numero hasta el que va a llegar
			Scanner entrada=new Scanner(System.in);     //Introducimos el scanner
			numero=entrada.nextInt();
			for(int i=0;i<=numero;i+=100) {     //Metemos el bucle
				System.out.println(i);      //La salida
				
			}
			entrada.close();
		}
		
	}

}