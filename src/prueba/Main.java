package prueba;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

class Pez {
    private String nombre;
    private double peso;

    public Pez(String nombre, double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPeso() {
        return peso;
    }
}

class Pescador {
    private String nombre;
    private List<Pez> listaPeces;

    public Pescador(String nombre) {
        this.nombre = nombre;
        this.listaPeces = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarPez(String nombrePez, double peso) {
        Pez pez = new Pez(nombrePez, peso);
        listaPeces.add(pez);
        System.out.println("Se agregó el pez " + nombrePez + " al pescador " + nombre);
    }

    public void eliminarPez(String nombrePez) {
        Iterator<Pez> iterator = listaPeces.iterator();
        while (iterator.hasNext()) {
            Pez pez = iterator.next();
            if (pez.getNombre().equals(nombrePez)) {
                iterator.remove();
                System.out.println("Se eliminó el pez " + nombrePez + " del pescador " + nombre);
                return;
            }
        }
        System.out.println("No se encontró el pez " + nombrePez + " en la lista del pescador " + nombre);
    }

    public void mostrarPeces() {
        if (listaPeces.isEmpty()) {
            System.out.println("El pescador " + nombre + " no tiene peces en su lista.");
        } else {
            System.out.println("Lista de peces del pescador " + nombre + ":");
            for (Pez pez : listaPeces) {
                System.out.println("Nombre: " + pez.getNombre() + ", Peso: " + pez.getPeso());
            }
        }
    }
}

public class Main {
    private static List<Pescador> listaPescadores = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        mostrarMenu();
    }

    private static void mostrarMenu() {
        int opcion;
        do {
            System.out.println("----- CRUD de Pescadores y Peces -----");
            System.out.println("1. Agregar pescador");
            System.out.println("2. Mostrar pescadores");
            System.out.println("3. Agregar pez a pescador");
            System.out.println("4. Eliminar pez de pescador");
            System.out.println("5. Mostrar peces de pescador");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    agregarPescador();
                    break;
                case 2:
                    mostrarPescadores();
                    break;
                case 3:
                    agregarPezAPescador();
                    break;
                case 4:
                    eliminarPezDePescador();
                    break;
                case 5:
                    mostrarPecesDePescador();
                    break;
                case 6:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;
            }
            System.out.println();
        } while (opcion != 6);
    }

    private static void agregarPescador() {
        System.out.print("Ingrese el nombre del pescador: ");
        String nombrePescador = scanner.nextLine();
        Pescador pescador = new Pescador(nombrePescador);
        listaPescadores.add(pescador);
        System.out.println("Se agregó el pescador " + nombrePescador + " correctamente.");
    }

    private static void mostrarPescadores() {
        if (listaPescadores.isEmpty()) {
            System.out.println("No hay pescadores en la lista.");
        } else {
            System.out.println("Lista de pescadores:");
            for (Pescador pescador : listaPescadores) {
                System.out.println("- " + pescador.getNombre());
            }
        }
    }

    private static void agregarPezAPescador() {
        if (listaPescadores.isEmpty()) {
            System.out.println("No hay pescadores en la lista. Por favor, agregue un pescador primero.");
            return;
        }

        System.out.print("Ingrese el nombre del pescador: ");
        String nombrePescador = scanner.nextLine();

        Pescador pescadorSeleccionado = null;
        for (Pescador pescador : listaPescadores) {
            if (pescador.getNombre().equals(nombrePescador)) {
                pescadorSeleccionado = pescador;
                break;
            }
        }

        if (pescadorSeleccionado == null) {
            System.out.println("No se encontró el pescador " + nombrePescador + " en la lista.");
            return;
        }

        System.out.print("Ingrese el nombre del pez: ");
        String nombrePez = scanner.nextLine();
        System.out.print("Ingrese el peso del pez: ");
        double pesoPez = scanner.nextDouble();
        scanner.nextLine(); // Consumir el salto de línea

        pescadorSeleccionado.agregarPez(nombrePez, pesoPez);
    }

    private static void eliminarPezDePescador() {
        if (listaPescadores.isEmpty()) {
            System.out.println("No hay pescadores en la lista. Por favor, agregue un pescador primero.");
            return;
        }

        System.out.print("Ingrese el nombre del pescador: ");
        String nombrePescador = scanner.nextLine();

        Pescador pescadorSeleccionado = null;
        for (Pescador pescador : listaPescadores) {
            if (pescador.getNombre().equals(nombrePescador)) {
                pescadorSeleccionado = pescador;
                break;
            }
        }

        if (pescadorSeleccionado == null) {
            System.out.println("No se encontró el pescador " + nombrePescador + " en la lista.");
            return;
        }

        System.out.print("Ingrese el nombre del pez a eliminar: ");
        String nombrePez = scanner.nextLine();

        pescadorSeleccionado.eliminarPez(nombrePez);
    }

    private static void mostrarPecesDePescador() {
        if (listaPescadores.isEmpty()) {
            System.out.println("No hay pescadores en la lista. Por favor, agregue un pescador primero.");
            return;
        }

        System.out.print("Ingrese el nombre del pescador: ");
        String nombrePescador = scanner.nextLine();

        Pescador pescadorSeleccionado = null;
        for (Pescador pescador : listaPescadores) {
            if (pescador.getNombre().equals(nombrePescador)) {
                pescadorSeleccionado = pescador;
                break;
            }
        }

        if (pescadorSeleccionado == null) {
            System.out.println("No se encontró el pescador " + nombrePescador + " en la lista.");
            return;
        }

        pescadorSeleccionado.mostrarPeces();
    }
}