package figuras;

public class TrianguloRectangulo {
    
    private double base;
    private double altura;
    private double hipotenusa;
    
    public TrianguloRectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    public double getArea() {
        return (base * altura) / 2;
    }
    
    public double getPerimetro() {
        return base + altura + hipotenusa;
    }
    
    public void dibujar() {
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}