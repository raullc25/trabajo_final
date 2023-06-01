package figuras;

public class Triangulo {
    
    private double base;
    private double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;

    }
    
    public double getBase() {
        return base;
    }
    
    public double getAltura() {
        return altura;
    }
    
    public double getArea() {
        return (base * altura) / 2;
    }
    

    
    public void dibujar() {
        int numEspacios = (int) altura - 1;
        int numAsteriscos = 1;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < numEspacios; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numAsteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
            numEspacios--;
            numAsteriscos += 2;
        }
    }
    

}