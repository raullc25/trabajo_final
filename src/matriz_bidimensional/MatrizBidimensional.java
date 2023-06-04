package matriz_bidimensional;

public class MatrizBidimensional {
    public static void main(String[] args) {
        int filas = 3;
        int columnas = 4;
        
        int[][] matriz = new int[filas][columnas];
        
        // Rellenar la matriz con valores
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = i + j;
            }
        }
        
        // Imprimir la matriz
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

