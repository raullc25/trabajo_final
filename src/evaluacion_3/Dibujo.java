package evaluacion_3;
import java.util.Scanner;
public class Dibujo {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int opcion;

	        do {
	            System.out.println("Menú de opciones:");
	            System.out.println("1. Dibujar un cuadrado");
	            System.out.println("2. Dibujar un triángulo");
	            System.out.println("3. Dibujar un rectangulo");
	            System.out.println("4. Salir");
	            System.out.println("");
	            System.out.print("Seleccione una opción: ");
	            opcion = scanner.nextInt();

	            switch (opcion) {
	                case 1:
	                    dibujarCuadrado();
	                    break;
	                case 2:
	                    dibujarTriangulo();
	                    break;
	                case 3:
	                    dibujarRectangulo();
	                    break;
	                case 4:
	                    System.out.println("¡Hasta luego!");
	                    break;
	                default:
	                    System.out.println("Opción no válida.");
	                    break;
	            }
	        } while (opcion != 4);
	        scanner.close();
	    }

	    private static void dibujarCuadrado() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce el tamaño del cuadrado: ");
	        int tamano = scanner.nextInt();

	        for (int i = 0; i < tamano; i++) {
	            for (int j = 0; j < tamano; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }

	   private static void dibujarRectangulo() {
		   Scanner scanner = new Scanner(System.in);
		   System.out.print("Introduce el ancho del rectángulo: ");
	        int ancho = scanner.nextInt();

	        System.out.print("Introduce la altura del rectángulo: ");
	        int altura = scanner.nextInt();

	        for (int i = 0; i < altura; i++) {
	            for (int j = 0; j < ancho; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
		   scanner.close();
	   }
	    
	    
	    private static void dibujarTriangulo() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Introduce la altura del triángulo: ");
	        int altura = scanner.nextInt();

	        for (int i = 0; i < altura; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	        scanner.close();
	    }
	}
