package Fichero.Texto;
/*
 * @Raúl Lucas Castaño  20/04/2023
 */

public class Cifrar {

	public static void main(String[] args) {
		

		String s="En un lugar de la mancha cuyo nombre no quiero acordarme ";
		
		 for(int i = 0; i < s.length()-1; i++) { 
	        	char ch = s.charAt(i); 
	        	if(ch == 'a' || ch=='e' || ch == 'i' || ch == 'o' || ch == 'u');
	        	ch=1;
	        	System.out.println(s);
		 }
		 			
		 
	}
}

