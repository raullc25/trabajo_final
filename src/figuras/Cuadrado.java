package figuras;

public class Cuadrado {

    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return lado * lado;
    }

    public double getPerimetro() {
        return 4 * lado;
    }

    public void dibujar() {
        for (int i = 0; i < lado; i++) {
            for (int j = 0; j < lado; j++) {

                    System.out.print("* ");               
            }
            System.out.println();
        }
    }
}