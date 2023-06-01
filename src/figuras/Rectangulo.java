package figuras;

public class Rectangulo {

    private double lado;
    private double lado1;

    public Rectangulo( double lado1 , double lado) {
        this.lado = lado;
        this.lado1 = lado1;
    }

    public double getlado() {
        return lado;
    }
    
    public double getLado1() {
        return lado1;
    }

    public double getArea() {
        return lado * lado1;
    }

    public double getPerimetro() {
        return (2 * lado)+(2 * lado1);
    }
    
    public void dibujar() {
            for (int i = 0; i < lado; i++) {
                for (int j = 0; j < lado1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
    }
}