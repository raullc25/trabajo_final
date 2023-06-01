package Tema4control;

public class arbol {


		private static void piramide() {
			for(int altura = 1; altura<=4; altura++){
		            //Espacios en blanco
		            for(int blancos = 1; blancos<=4-altura; blancos++){
		                System.out.print(" ");
		            	}
		 
		            //Asteriscos
		            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
		                System.out.print("*");
		            	}
		            System.out.println();
		        
	  
	}

}
}
