package DibujarFiguras;

public class PruebaCuadrado {
	public static void main(String[] args) {
       
		Cuadrado cuadrado = new Cuadrado(5);
		
        
        System.out.println("Esta figura se trata de un cuadrado con las siguientes medidas: ");
        System.out.println("Lado: " + cuadrado.getLado());
        System.out.println("Área: " + cuadrado.getArea());
        System.out.println("Perímetro: " + cuadrado.getPerimetro());
    }
}