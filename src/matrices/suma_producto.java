package matrices;

public class suma_producto {

	
	 public static void main(String[] args) {
	        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
	        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
	        
	        int filas = matriz1.length;
	        int columnas = matriz1[0].length;
	        
	        int[][] resultado = new int[filas][columnas];
	        
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }
	        
	        // Imprimir la matriz resultado
	        for (int i = 0; i < filas; i++) {
	            for (int j = 0; j < columnas; j++) {
	                System.out.print(resultado[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }

	 
//	 public static void main(String[] args) {
//	        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}};
//	        int[][] matriz2 = {{7, 8}, {9, 10}, {11, 12}};
//	        
//	        int filasMatriz1 = matriz1.length;
//	        int columnasMatriz1 = matriz1[0].length;
//	        int columnasMatriz2 = matriz2[0].length;
//	        
//	        int[][] resultado = new int[filasMatriz1][columnasMatriz2];
//	        
//	        for (int i = 0; i < filasMatriz1; i++) {
//	            for (int j = 0; j < columnasMatriz2; j++) {
//	                for (int k = 0; k < columnasMatriz1; k++) {
//	                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
//	                }
//	            }
//	        }
//	        
//	        // Imprimir la matriz resultado
//	        for (int i = 0; i < filasMatriz1; i++) {
//	            for (int j = 0; j < columnasMatriz2; j++) {
//	                System.out.print(resultado[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//	    }
//
//	 Traspuesta
//
//	 public class TraspuestaMatriz {
//	     public static void main(String[] args) {
//	         int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//	         
//	         int filas = matriz.length;
//	         int columnas = matriz[0].length;
//	         
//	         int[][] traspuesta = new int[columnas][filas];
//	         
//	         for (int i = 0; i < filas; i++) {
//	             for (int j = 0; j < columnas; j++) {
//	                 traspuesta[j][i] = matriz[i][j];
//	             }
//	         }
//	         
//	         // Imprimir la matriz traspuesta
//	         for (int i = 0; i < columnas; i++) {
//	             for (int j = 0; j < filas; j++) {
//	                 System.out.print(traspuesta[i][j] + " ");
//	             }
//	             System.out.println();
//	         }
//	     }

	
	
}
