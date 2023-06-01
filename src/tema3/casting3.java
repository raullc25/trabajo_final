package tema3; 
	//pag 35--20/10/22--Jorge Sanchez--Tema 3
	//convierte un tipo de dato y comprueba el ambiente
public class casting3 {

	public static void main(String[] args) {
		// Convirtiendo los tipos de datos
		{
		int a=127;
		byte b;
		b= (byte) a; //correcto si hay un valor entre 1 y 127
		
		System.out.println("Este es el valos de b=" +b);
		}
			{
			byte b=10;
			//b= a;  //Este da error porque no hay cast, no está el (byte)
			System.out.println(b);
			}
			
			//No se puede poner porque a y b no son visibles
			
			{
			int a=1;
			byte b;
			b= (byte) a; //correcto
			System.out.println(b);
			}
			
			{
			byte n2=100,n3;
			//n3=n1*n2/100;
			//System.out.println(n3); // da error ya que 100*100 da 10000 y es mayor que un byte
			}
			
			{
			byte n1=100,n2=100,n3;
			n3 =(byte) (n1*n2/100);
			System.out.println(n3);
			}
			
			{
			
			}
			
		}

}
