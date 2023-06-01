package ObjetoPajaro;
import java.io.Serializable;
						
public class Pajaro 	implements Serializable {	
		private char color; //propiedad o atributo color
		private int edad; //propiedad o atributo edad
		private int numpajaro;  //++++ numero de pajaro consecutivo
		private static int contpajaros=1;  //añadido numero de pajaro a cada pajaro
	
		//*** métodos de la clase  constructores Pajaro7 ****
		Pajaro()				//por defecto verde con 0 años
			{color = 'v'; edad = 0; numpajaro= contpajaros;
			contpajaros++;}
	
		Pajaro(char c, int e)	//parametrizado
			{color = c; edad = e; numpajaro= contpajaros;
			contpajaros++;}
		//**************************************añadidos para informar
		
		
		public int getnumero()		//**********************devolver nº pajaro
			{ return numpajaro;	}
		
		
		public void DatosPajaro()		//la letra del color
			{ System.out.printf("Pajaro nº= %d , con %d años,",this.getnumero(),
					this.getedad()   );
			System.out.print("color =>");		printcolor();
				}
		
		//*** métodos de la clase  Pajaro del tema2****
		public void setedad(int e)
			{edad = e;}
		
		public int getedad()
			{return edad;}
		
		public void setcolor(char c)
			{color=c;}
		
		public char getcolor()
		{ return color;}
		
		public void printcolor(){//convierte char en color y lo visualiza
			switch(color){
			//Los pájaros son verdes, amarillos, grises, negros o blancos
			//No existen pájaros de otros colores
				case 'v': System.out.println("verde");break;
				case 'a': System.out.println("amarillo");break;
				case 'g': System.out.println("gris");break;
				case 'n': System.out.println("negro");break;
				default: System.out.println("color no establecido");
			}
		}//printcolor
	
	//  **/    main inicial para probar solo la clases **********************	
public static void main(String[] args) {
	//se crean ahora 3 pajaros se llenan con datos usando constructores
	//se muestran sus datos iniciales con el contador de pajaro		
		
	Pajaro p1=new Pajaro();	//verde de 0 años
	System.out.printf("Empezamos con pajaro nº=  %d ",p1.getnumero() );
		p1.DatosPajaro();
			
	Pajaro p2=new Pajaro('a',3);//vamos con pajaro2	amarillo y de 3 años
		System.out.printf("seguimos con pajaro nº=  %d ",p2.getnumero() );
			p2.DatosPajaro();
			
			//pajaro3   vamos con MiLoro verde y de 2 años
	Pajaro MiLoro=new Pajaro('v',2);
	System.out.printf("seguimos con pajaro nº=  %d ",MiLoro.getnumero() );
				MiLoro.DatosPajaro();	
				
	Pajaro Canario=new Pajaro('n',5);
		System.out.printf("terminamos con pajaro nº=  %d ",Canario.getnumero() );
			Canario.DatosPajaro();
	}
}