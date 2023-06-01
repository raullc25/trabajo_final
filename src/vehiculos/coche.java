package vehiculos;

public class coche {

protected double gasolina;
	

	public coche(double v, double k, double gasolina) {
	//	super(v, k); ///llamamos al constructor del padre
		this.gasolina = gasolina;
	}


	public double getGasolina() {
		return gasolina;
	}


	public void setGasolina(double gasolina) {
		this.gasolina = gasolina;
	}

	public void acelerar(double k) {
	//	super.acelerar ();
		gasolina*=0.9;
	}
	public void gasto() {
		double cont,rest;
		//rest= km*0.06;
	//	gasolina=gasolina-rest;
		
		
	}

	//public String toString() {
	//	return "coche [gasolina=" + gasolina + ", velocidad=" + velocidad + ", km=" + km + "]";
	}


	
	
