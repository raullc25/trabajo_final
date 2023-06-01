package vehiculos;

public class UsarVehiculos {

	public static void main(String[] args) {
		vehiculo v2=new vehiculo(72,10);
		coche v1=new coche(12,12,2);
		
		System.out.println(v1.toString());
		v1.gasto();
		System.out.println(v1.toString());
	
		System.out.println(v2.toString());
	
		
	}

}
