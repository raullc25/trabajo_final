package pedido_cliente;

import java.util.Scanner;

public class PedidosCliente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de pedidos: ");
        int cantidadPedidos = scanner.nextInt();
        
        String[] pedidos = new String[cantidadPedidos];
        
        scanner.nextLine(); // Limpiar el buffer
        
        // Solicitar los pedidos al cliente
        for (int i = 0; i < cantidadPedidos; i++) {
            System.out.print("Ingrese el pedido " + (i+1) + ": ");
            String pedido = scanner.nextLine();
            pedidos[i] = pedido;
        }
        
        // Imprimir los pedidos almacenados
        System.out.println("Pedidos almacenados:");
        for (int i = 0; i < cantidadPedidos; i++) {
            System.out.println("- " + pedidos[i]);
        }
        
        scanner.close();
    }
}

