package programascomplejos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Producto {
    private String nombre;
    private int cantidad;

    public Producto(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
//}
//
//public class GestionInventario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Producto> inventario = new ArrayList<>();

        boolean continuar = true;
        while (continuar) {
            System.out.println("¿Qué operación desea realizar?");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Actualizar cantidad de producto");
            System.out.println("4. Salir");
            System.out.print("Ingrese la opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el nombre del producto: ");
                    String nombreProducto = scanner.nextLine();
                    System.out.print("Ingrese la cantidad: ");
                    int cantidadProducto = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer

                    Producto nuevoProducto = new Producto(nombreProducto, cantidadProducto);
                    inventario.add(nuevoProducto);
                    System.out.println("Producto agregado al inventario.");
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del producto a buscar: ");
                    String nombreBusqueda = scanner.nextLine();

                    boolean encontrado = false;
                    for (Producto producto : inventario) {
                        if (producto.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println("Producto encontrado:");
                            System.out.println("Nombre: " + producto.getNombre());
                            System.out.println("Cantidad: " + producto.getCantidad());
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Producto no encontrado en el inventario.");
                    }
                    break;
                case 3:
                    System.out.print("Ingrese el nombre del producto a actualizar: ");
                    String nombreActualizacion = scanner.nextLine();

                    boolean actualizado = false;
                    for (Producto producto : inventario) {
                        if (producto.getNombre().equalsIgnoreCase(nombreActualizacion)) {
                            System.out.print("Ingrese la nueva cantidad: ");
                            int nuevaCantidad = scanner.nextInt();
                            scanner.nextLine(); // Limpiar el buffer

                            producto.setCantidad(nuevaCantidad);
                            System.out.println("Cantidad actualizada.");
                            actualizado = true;
                            break;
                        }
                    }

                    if (!actualizado) {
                        System.out.println("Producto no encontrado en el inventario.");
                    }
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }


}
