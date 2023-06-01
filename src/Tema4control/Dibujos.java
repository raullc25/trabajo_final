package Tema4control;
import java.util.Scanner;
public class Dibujos {
		    public static void main(String[] args) {
		    
		    	Scanner scan=new Scanner(System.in);
		    	System.out.println("Ingrese el valor que quieres en la piramide");
		    	int numero=scan.nextInt();
		        for(int altura = 1; altura<=numero; altura++){
		            //Espacios en blanco
		            for(int blancos = 1; blancos<=numero-altura; blancos++){
		                System.out.print(" ");
		            	}
		 
		            //Asteriscos
		            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
		                System.out.print("*");
		            	}
		            System.out.println();
		        	}
		        
		        		{
		        			System.out.println();
		        		}
		  
		       
		        {
		        	
		        	Scanner scaner=new Scanner(System.in);
			    	System.out.println("Ingrese el valor que quieres en el cuadrado");
			    	int num=scaner.nextInt();
		    		for (int fila = 1; fila <= num; fila++) {
		    			for (int columna = 1; columna <= num; columna++)
		    				System.out.print(" *");
		    			
		    			System.out.println();//Salto de línea para pasar a la siguiente FILA
		        }
		    		scaner.close();
		 
		   
		        
		    }
		       
		        scan.close();
	}
		  

}
