package tema7;

public class coche {

	public class Vehiculo {
		protected int velocidad;
		protected int ruedas;
		protected void parar() {
		velocidad = 0;
		}
		public void acelerar(int kmh) {
		velocidad += kmh;
		}
		
		}
		public class Coche extends Vehiculo {
		protected int ruedas=4;
		protected int gasolina;
		protected void repostar(int litros) {
		gasolina+=litros;
		}
		
		}
		public class PruebaCoche {
		public static void main(String[] args) {
		coche coche1=new coche();
		coche1.acelerar(80);//Método heredado
		coche1.repostar(12);//Método nuevo, no heredado
		}
		}
		public void acelerar(int i) {
			// TODO Esbozo de método generado automáticamente
			
		}
		public void repostar(int i) {
			// TODO Esbozo de método generado automáticamente
			
		}
}
