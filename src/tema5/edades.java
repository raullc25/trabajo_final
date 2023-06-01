package tema5;

public class edades {

	public static void main(String[] args) {
		{int edades [] = {18, 25, 34, 4, 52,32};
	   	//recorrido1 completo para visualizar y sumarlos en suma
	   	int suma=0; 
	    System.out.print ("Tenemos las edades= ");
	   	for (int i = 0; i <edades.length; i++) 
	   		{ System.out.print (edades [i]+"-");
	   		suma+=edades[i];	   	}
		 
	  //recorrido2 completo para buscar max y min
	   	int max=0, min=99;
	   	for (int i = 0; i <edades.length; i++) 
	   	   {
	   		if (edades [i]>max)
	  		  	max= edades [i]; //tengo nuevo maximo
	  	  else if (edades [i]<min)
	  		  	min= edades [i]; //sino ver si tengo nuevo minimo
	   	  	}
	    System.out.println ("\n La edad mayor es= "+ max);
	    System.out.println ("La edad menor es= " + min);
	    System.out.println ("La suma de edades es= " + suma);
	   	}   	
	

	}

}
