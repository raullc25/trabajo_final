package figuras;

public class PruebaFigura {

    public static void main(String[] args) {
       
    	System.out.println("     ****** CRUADRADO ******");
    	System.out.println(" ");
    	
    	Cuadrado cuadrado = new Cuadrado(5);
        cuadrado.dibujar();
        System.out.println("     Lado: " + cuadrado.getLado());
        System.out.println("     Área: " + cuadrado.getArea());
        System.out.println("     Perímetro: " + cuadrado.getPerimetro());
        System.out.println(" ");
        System.out.println(" ");
        
        
        
        System.out.println("     ****** RECTANGULO ******");
        System.out.println(" ");
        
        Rectangulo rectangulo = new Rectangulo(8 , 4);
        rectangulo.dibujar();
        System.out.println("     Ancho: " + rectangulo.getlado());
        System.out.println("     Largo: " + rectangulo.getLado1());
        System.out.println("     Área: " + rectangulo.getArea());
        System.out.println("     Perímetro: " + rectangulo.getPerimetro());
        System.out.println(" ");
        System.out.println(" ");
        
        
        
        System.out.println("     ****** TRIANGULO ******");
        System.out.println(" ");
        
        Triangulo triangulo = new Triangulo(7 , 4 );
        triangulo.dibujar();
        System.out.println("     Base: " + triangulo.getBase());
        System.out.println("     Altura: " + triangulo.getAltura());
        System.out.println("     Área: " + triangulo.getArea());
        System.out.println(" ");
        System.out.println(" ");
        
        
        
        System.out.println("     ****** TRIANGULO RECTANGULO ******");
        System.out.println(" ");
        
        Triangulo triangulorec = new Triangulo(6 , 3 );
        triangulorec.dibujar();
        System.out.println("     Base: " + triangulorec.getBase());
        System.out.println("     Altura: " + triangulorec.getAltura());
        System.out.println("     Área: " + triangulorec.getArea());
        System.out.println(" ");
        System.out.println(" ");
        
    
    }
}