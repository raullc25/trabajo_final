package programascomplejos;


	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	class Empleado2 {
	    private String nombre;
	    private double salario;
	    private String fechaContratacion;

	    public Empleado2(String nombre, double salario, String fechaContratacion) {
	        this.nombre = nombre;
	        this.salario = salario;
	        this.fechaContratacion = fechaContratacion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public double getSalario() {
	        return salario;
	    }

	    public String getFechaContratacion() {
	        return fechaContratacion;
	    }
//	}
//
//	public class GestorEmpleados {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        List<Empleado2> empleados = new ArrayList<>();

	        boolean continuar = true;
	        while (continuar) {
	            System.out.println("¿Qué operación desea realizar?");
	            System.out.println("1. Agregar empleado");
	            System.out.println("2. Calcular promedio de salarios");
	            System.out.println("3. Buscar empleado con el salario más alto");
	            System.out.println("4. Salir");
	            System.out.print("Ingrese la opción: ");
	            int opcion = scanner.nextInt();
	            scanner.nextLine(); // Limpiar el buffer

	            switch (opcion) {
	                case 1:
	                    System.out.print("Ingrese el nombre del empleado: ");
	                    String nombre = scanner.nextLine();
	                    System.out.print("Ingrese el salario: ");
	                    double salario = scanner.nextDouble();
	                    scanner.nextLine(); // Limpiar el buffer
	                    System.out.print("Ingrese la fecha de contratación: ");
	                    String fechaContratacion = scanner.nextLine();

	                    Empleado2 nuevoEmpleado = new Empleado2(nombre, salario, fechaContratacion);
	                    empleados.add(nuevoEmpleado);
	                    System.out.println("Empleado agregado correctamente.");
	                    break;
	                case 2:
	                    if (empleados.isEmpty()) {
	                        System.out.println("No hay empleados registrados.");
	                    } else {
	                        double totalSalarios = 0;
	                        for (Empleado2 empleado : empleados) {
	                            totalSalarios += empleado.getSalario();
	                        }
	                        double promedioSalarios = totalSalarios / empleados.size();
	                        System.out.println("El promedio de salarios es: " + promedioSalarios);
	                    }
	                    break;
	                case 3:
	                    if (empleados.isEmpty()) {
	                        System.out.println("No hay empleados registrados.");
	                    } else {
	                        Empleado2 empleadoSalarioMaximo = empleados.get(0);
	                        for (int i = 1; i < empleados.size(); i++) {
	                            if (empleados.get(i).getSalario() > empleadoSalarioMaximo.getSalario()) {
	                                empleadoSalarioMaximo = empleados.get(i);
	                            }
	                        }
	                        System.out.println("El empleado con el salario más alto es: " + empleadoSalarioMaximo.getNombre());
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
