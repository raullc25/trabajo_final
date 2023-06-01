package tema3;
	//pag 35--20/10/22--Jorge Sanchez--Tema 3
public class Operadores {

	public static void main(String[] args) {
		//Practicamos con diferentes operadores de java		

	{
	double resultado1, d1=14, d2=5;
	int resultado2, i1=14, i2=5;
	resultado1=d1/d2;
	resultado2=i1/i2;
	System.out.println("El primer resultado es " + resultado1);  //El resultado es 2.8
	System.out.println("El primer resultado es " + resultado2);  //El resultado es 2, ya que pierde los decimales
	}
	
	{
	double resultado3, resultado4;
	int i1=7, i2=2;
	resultado3= i1/i2;          
	resultado4=(double)i1/i2;
	System.out.println("El primer resultado es " + resultado3);  //resultado valdra 3
	System.out.println("El primer resultado es " + resultado4);	//resultado valdrá 3.5
	}
	
	{
	int resultado5, i1=14, i2=5;
	resultado5= i1%i2; 
	System.out.println("El primer resultado es " + resultado5);
	}
	
	
	for (int i = 1; i <= 2; i++) {
        for (int j = 1; j <= 4; j++) {
            if (i == 1 || i == 2 || j == 1 || j == 4) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
}
	
	}
}//main
