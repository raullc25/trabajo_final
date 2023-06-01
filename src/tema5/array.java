package tema5;

public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1-ARRAY DE NOTAS RELLENADO DE UNO EN UNO
				System.out.println("*PRIMER ARRAY: ");
				int notas[] = new int[4];
				notas[0]=5;
				notas[1]=7;
				notas[2]=2;
				notas[3]=6;
				for(int i=0;i<=3;i++) {
					System.out.println("La nota que esta en la posicion " +i+ " es: "+notas[i]);
				}
				System.out.println("\n\n");//SALTAMOS DOS LINEAS 
				
				
				//2-ARRAY DE NOTAS RELLENADO ENTERO DE UNA VEZ
				System.out.println("*SEGUNDO ARRAY: ");		
				int notas2[] = {9,5,5,3};
					for(int i=0;i<=3;i++) {
						System.out.println("La nota que esta en la posicion "+i+ " es: "+notas2[i]);
					}
	}

}
