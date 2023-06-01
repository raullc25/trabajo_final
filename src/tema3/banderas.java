package tema3;
//pag 37--21/10/22--Jorge Sanchez--Tema 3
public class banderas {

	public static void main(String[] args) {
		// Vamos a probar los booleanos de la pagina 37
	}

	
	{
	boolean mayorDeEdad,menorDeEdad;
	int edad= 21;
	mayorDeEdad= edad>=18; //mayor de edad será true
	menorDeEdad= !mayorDeEdad; //menorDEEdad será false
	}
	
	{
	boolean carnetConducir=true;
	int edad=20;
	boolean puedeConducir= (edad>=18) && carnetConducir;
	//Si la edad es de al menos 18 años y carnetConducir es
	//true, puedeConducir es true
	}

	
	{//Asignaciones Pag.38
		boolean nieva =true, llueve=false, graniza=false;
		boolean llueve1=false;
		boolean malTiempo= nieva ||llueve1|| graniza;
		
	}
	
	
	
	
	}
