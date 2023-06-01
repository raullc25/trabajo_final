package OPP.Abstracta;

	public class coche {
		protected double velocidad;
		protected double km;
		public coche(double v, double k){
		velocidad=v;
		km=k;
		}
		public double getVelocidad() {
			return velocidad;
		}
		public void setVelocidad(double velocidad) {
			this.velocidad = velocidad;
		}
		public double getKm() {
			return km;
		}
		public void setKm(double km) {
			this.km = km;
		}
		
		public void acelerar() {
			
			}
		public String toString() {
			return "vehiculo [velocidad=" + velocidad + ", km=" + km + "]";
		}
		
	}

