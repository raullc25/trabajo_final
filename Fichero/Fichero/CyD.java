package Fichero;

public class CyD {

	
	public static void main(String[] args) {
		String s="En un lugar de la mancha";
		
		
		String frasecodificada = codificar(s);
		System.out.println("La frase codificada es: "+ frasecodificada);
		
		String frasedecodi = decodificar(s);
		System.out.println("La frase decodificada es: "+ frasedecodi);
		
	}
	
	
	
	
	public static String codificar (String s) {
		
		
		String resultado="";
		for (int i=0; i<s.length(); i++ ) {
			char caracter =s.charAt(i);

		if (caracter=='a'||caracter=='A') {
			resultado+=1;
		}else if (caracter=='e'||caracter=='E') {
			resultado+=2;
		}else if (caracter=='i') {
			resultado+=3;
		}else if (caracter=='o') {
			resultado+=4;
		}else if (caracter=='u') {
			resultado+=5;
		}else {
			resultado+=caracter;
		}
					
	  }
		return resultado;	
	}

	
	
	public static String decodificar (String s) {
		String resultado="";
		 for (int i=0; i<s.length();i++) {
			 char caracter=s.charAt(i);
			 
			 if(caracter==1) {
				 resultado+="a";
			 }else if(caracter==2){
				 resultado+="e";
			 }else if(caracter==3){
				 resultado+="i";
			 }else if(caracter==4) {
				 resultado+="o";
			 }else if(caracter==5) {
				 resultado+="u";
			 }else {
				 resultado+=caracter;
			 }
		 }
	
		return resultado;
	}


	
	




}
