package tema3;

public class Variable {

	public static void main(String[] args) {
		// pag 31
		
		int dias=365, año=23, semanas=65; //días es un número entero, sin decimales
		boolean decision; //decisión solo puede ser verdadera o falsa
		int a=13, b=18;
		int c=a+b; //es válido, c vale 31
		System.out.println("La suma de c es "+c);
		System.out.println("los dias son "+dias);
		System.out.println("los años son "+año);
		System.out.println("las semanas son "+semanas);
		
		
		
		int x;
		x=7;
		System.out.println("x="+x); //x=7
		x=x*2;
		System.out.println("x="+x);

	//TIPOS DE DATOS PRIMARIOS
	//añadir los modificadores correspondientes
		
		char letra='C';             //letra es un caracter Unicode---->2bytes
		char letra2=65;             //posicion 67 es la letra A
		short snumero=1;            //entero corto----------->2bytes
		System.out.println("numero short="+snumero);
		int numero=16;             // decimal 18 -----------> 4 bytes
		System.out.println("numero=" +numero);
		long nlong= 12;          // long o entero largo----> 8 bytes
		System.out.println("numero long="+nlong);
		
		// numeros en coma flotante no separar con coma sino . decimal
		double dx=2.75;        //doubles para guardar real---->8bytes
		System.out.println("numero flotante doble ="+dx);
		
		float fx=1.5f;        //float es reales pequeños------>4bytes (f)
		System.out.println("numero flotante float="+fx);
		

		//boleano o variable logica que solo admite dos valores
		boolean b2 =true;   //la bandera b se inicializa a verdadero
		System.out.println("booleano b ="+ b2);    //debe convertirse

		
		
		{	
		/////////////// CONVERSIONES
		//      int x=9.5----------->        error de tippo pagina 33
		//pasar de real a entero--------> quedarse solo con la parte entera
		int x2= (int )9.5;      // hacemos un casting a int  ------> (int)
		System.out.println("ahora x ="+x);   //9  o 9.0		
		}
		

		//pasar de entero a double
		int x1=9;            // x ya existe, poner x1
		double y=x;         //ahora no necesitamos casting
		System.out.println("ahora y ="+y);     //ahora 9.0 ya es real
	
		
		
		//boleanos      en pag 34
		//boolean b1=true;
		//System.out.println("b ="+b);
		//b1=!b;              //negamos el boleano b, usamos !para negar
		                  // el true se convierte en false
		//System.out.println("ahora b ="+b);


	}
}
