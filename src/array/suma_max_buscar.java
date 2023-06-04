package array;

public class suma_max_buscar {

	
	  public static void main(String[] args) {
	        int[] array = {2, 4, 6, 8, 10};
	        int suma = 0;
	        
	        for (int i = 0; i < array.length; i++) {
	            suma += array[i];
	        }
	        
	        System.out.println("La suma de los elementos del array es: " + suma);
	    }
	}



//	max y min
//
//	public class MaxMinArray {
//	    public static void main(String[] args) {
//	        int[] array = {5, 2, 9, 1, 7};
//	        
//	        int max = array[0];
//	        int min = array[0];
//	        
//	        for (int i = 1; i < array.length; i++) {
//	            if (array[i] > max) {
//	                max = array[i];
//	            }
//	            
//	            if (array[i] < min) {
//	                min = array[i];
//	            }
//	        }
//	        
//	        System.out.println("El máximo valor del array es: " + max);
//	        System.out.println("El mínimo valor del array es: " + min);
//	    }
//	}
//
//
//
//	buscar un elemento en un array
//
//	public class BuscarElementoArray {
//	    public static void main(String[] args) {
//	        int[] array = {3, 6, 9, 12, 15};
//	        int elementoBuscado = 9;
//	        boolean encontrado = false;
//	        
//	        for (int i = 0; i < array.length; i++) {
//	            if (array[i] == elementoBuscado) {
//	                encontrado = true;
//	                break;
//	            }
//	        }
//	        
//	        if (encontrado) {
//	            System.out.println("El elemento " + elementoBuscado + " se encuentra en el array.");
//	        } else {
//	            System.out.println("El elemento " + elementoBuscado + " no se encuentra en el array.");
//	        }
//	    }

	

