package programascomplejos;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

class Empleado implements Serializable {
   private String nombre;
   private int edad;

   public Empleado(String nombre, int edad) {
       this.nombre = nombre;
       this.edad = edad;
   }

   public String getNombre() {
       return nombre;
   }

   public int getEdad() {
       return edad;
   }

   public void mostrarInformacion() {
       System.out.println("Nombre: " + nombre);
       System.out.println("Edad: " + edad);
   }
}

public class Empleado_gerente {
   private static final String ARCHIVO_EMPLEADOS = "empleados.dat";

   public static void main(String[] args) {
       
    ArrayList<Empleado> empleados = cargarEmpleados();

       Scanner scanner = new Scanner(System.in);

       boolean salir = false;
       while (!salir) {
           System.out.println("\n--- Menú ---");
           System.out.println("1. Mostrar empleados");
           System.out.println("2. Agregar empleado");
           System.out.println("3. Actualizar empleado");
           System.out.println("4. Eliminar empleado");
           System.out.println("5. Salir");
           System.out.print("Ingrese una opción: ");
           int opcion = scanner.nextInt();

           switch (opcion) {
               case 1:
                   mostrarEmpleados(empleados);
                   break;
               case 2:
                   agregarEmpleado(empleados, scanner);
                   break;
               case 3:
                   actualizarEmpleado(empleados, scanner);
                   break;
               case 4:
                   eliminarEmpleado(empleados, scanner);
                   break;
               case 5:
                   guardarEmpleados(empleados);
                   salir = true;
                   break;
               default:
                   System.out.println("Opción inválida.");
                   break;
           }
       }

       scanner.close();
   }

   private static ArrayList<Empleado> cargarEmpleados() {
       ArrayList<Empleado> empleados = new ArrayList<>();

       try {
           FileInputStream archivoEntrada = new FileInputStream(ARCHIVO_EMPLEADOS);
           ObjectInputStream objetoEntrada = new ObjectInputStream(archivoEntrada);
           empleados = (ArrayList<Empleado>) objetoEntrada.readObject();
           objetoEntrada.close();
           archivoEntrada.close();
       } catch (IOException e) {
           System.out.println("No se pudo cargar el archivo de empleados. Se creará uno nuevo.");
       } catch (ClassNotFoundException e) {
           System.out.println("Error al leer los empleados desde el archivo.");
           e.printStackTrace();
       }

       return empleados;
   }

   private static void guardarEmpleados(ArrayList<Empleado> empleados) {
       try {
           FileOutputStream archivoSalida = new FileOutputStream(ARCHIVO_EMPLEADOS);
           ObjectOutputStream objetoSalida = new ObjectOutputStream(archivoSalida);
           objetoSalida.writeObject(empleados);
           objetoSalida.close();
           archivoSalida.close();
           System.out.println("Empleados guardados en el archivo " + ARCHIVO_EMPLEADOS);
       } catch (IOException e) {
           System.out.println("Error al guardar los empleados en el archivo.");
           e.printStackTrace();
       }
   }

   private static void mostrarEmpleados(ArrayList<Empleado> empleados) {
       System.out.println("\n--- Empleados ---");
       if (empleados.isEmpty()) {
           System.out.println("No hay empleados registrados.");
       } else {
           for (Empleado empleado : empleados) {
               empleado.mostrarInformacion();
               System.out.println("--------------------");
           }
       }
   }

   private static void agregarEmpleado(ArrayList<Empleado> empleados, Scanner scanner) {
       System.out.print("Ingrese el nombre del empleado: ");
       String nombre = scanner.next();
       System.out.print("Ingrese la edad del empleado: ");
       int edad = scanner.nextInt();

       Empleado empleado = new Empleado(nombre, edad);
       empleados.add(empleado);
       System.out.println("Empleado agregado correctamente.");
   }

   private static void actualizarEmpleado(ArrayList<Empleado> empleados, Scanner scanner) {
       System.out.print("Ingrese el nombre del empleado a actualizar: ");
       String nombre = scanner.next();

       boolean encontrado = false;
       for (Empleado empleado : empleados) {
           if (empleado.getNombre().equalsIgnoreCase(nombre)) {
               System.out.print("Ingrese la nueva edad del empleado: ");
               int nuevaEdad = scanner.nextInt();
               empleado = new Empleado(nombre, nuevaEdad);
               System.out.println("Empleado actualizado correctamente.");
               encontrado = true;
               break;
           }
       }

       if (!encontrado) {
           System.out.println("Empleado no encontrado.");
       }
   }

   private static void eliminarEmpleado(ArrayList<Empleado> empleados, Scanner scanner) {
       System.out.print("Ingrese el nombre del empleado a eliminar: ");
       String nombre = scanner.next();

       boolean encontrado = false;
       for (Empleado empleado : empleados) {
           if (empleado.getNombre().equalsIgnoreCase(nombre)) {
               empleados.remove(empleado);
               System.out.println("Empleado eliminado correctamente.");
               encontrado = true;
               break;
           }
       }

       if (!encontrado) {
           System.out.println("Empleado no encontrado.");
       }
   }
}
