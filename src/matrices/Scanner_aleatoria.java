package matrices;
import java.util.Scanner;
import java.util.Random;
public class Scanner_aleatoria {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Ingrese el número de filas: ");
	        int filas = scanner.nextInt();
	        
	        System.out.print("Ingrese el número de columnas: ");
	        int columnas = scanner.nextInt();
	        
	        int[][] matriz = new int[filas][columnas];
	        
	        System.out.println("Ingrese los elementos de la matriz:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                matriz[i][j] = scanner.nextInt();
	            }
	        }
	        
	        // Imprimir la matriz
	        System.out.println("Matriz ingresada:");
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(matriz[i][j] + " ");
	            }
	            System.out.println();
	        }
	        
	        scanner.close();
	    }

	 
	 


//	         Scanner scanner = new Scanner(System.in);
//	         Random random = new Random();
//	         
//	         System.out.print("Ingrese el número de filas: ");
//	         int filas = scanner.nextInt();
//	         
//	         System.out.print("Ingrese el número de columnas: ");
//	         int columnas = scanner.nextInt();
//	         
//	         int[][] matriz = new int[filas][columnas];
//	         
//	         // Generar elementos aleatorios para la matriz
//	         for (int i = 0; i < filas; i++) {
//	             for (int j = 0; j < columnas; j++) {
//	                 matriz[i][j] = random.nextInt(100); // Genera números aleatorios entre 0 y 99
//	 // tambien asi matriz[x][y] = (int) (Math.random()*9+1);
//
//	             }
//	         }
//	         
//	         // Imprimir la matriz generada
//	         System.out.println("Matriz generada:");
//	         for (int i = 0; i < filas; i++) {
//	             for (int j = 0; j < columnas; j++) {
//	                 System.out.print(matriz[i][j] + " ");
//	             }
//	             System.out.println();
//	         }
//	         
//	         scanner.close();
//	     }
//	 }

	 
	
}
