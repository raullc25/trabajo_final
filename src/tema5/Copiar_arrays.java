package tema5;
//Tema 5 Jorge Sanchez, pagina 10.
public class Copiar_arrays {

	public static void main(String[] args) {
		{
		int a[];
		int b[]=new int[]{3,4,5,6,7,8};
		a=b;
		System.out.println(a);
		}
		
		
		{
		int a[];
		int b[]=new int[]{3,4,5,6,7,8};
		a=b;
		for(int i=0;i<6;i++) 
		System.out.println("El valor en la posición "+i+" es = "+a[i]);
		}
		/////////////////////////////////////
		{
			int a[]={3,3,3};
			int b[];
			b= a;
			b[0]=8;
			System.out.println(a[0]);//Escribirá el número 8
			System.out.println(b[0]);
		}
		////////////////////////////////////
		{
			int a[]={3,3,3};
			int b[]={3,3,3};
			System.out.println(a==b); //escribe false, aunque ambos arrays
		    //tienen el mismo contenido
			int c[]=b;
			System.out.println(b==c); //escribe true
		}
		
		{
			
		}
		
	}

}
