package ArrayObjetos;

public class producto {
    private String nombre;
    private double precio;
    
    public producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
//}

//public class ArrayObjetos {
    public static void main(String[] args) {
        producto[] productos = new producto[4];
        
        productos[0] = new producto("Camisa", 29.99);
        productos[1] = new producto("Pantalón", 49.99);
        productos[2] = new producto("Zapatos", 79.99);
        productos[3] = new producto("Sombrero", 19.99);
        
        for (int i = 0; i < productos.length; i++) {
            System.out.println("Producto: " + productos[i].getNombre());
            System.out.println("Precio: $" + productos[i].getPrecio());
            System.out.println();
        }
    }
    }


