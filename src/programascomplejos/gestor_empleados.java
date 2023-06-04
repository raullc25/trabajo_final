package programascomplejos;


	import java.util.Scanner;

	class Empleado {
	    private String nombre;
	    private double salario;
	    private String fechaContratacion;

	    public Empleado(String nombre, double salario, String fechaContratacion) {
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
	        Empleado[] empleados = new Empleado[5];

	        // Ingresar los datos de los empleados
	        for (int i = 0; i < empleados.length; i++) {
	            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");
	            System.out.print("Nombre: ");
	            String nombre = scanner.nextLine();
	            System.out.print("Salario: ");
	            double salario = scanner.nextDouble();
	            scanner.nextLine(); // Limpiar el buffer
	            System.out.print("Fecha de contratación: ");
	            String fechaContratacion = scanner.nextLine();

	            empleados[i] = new Empleado(nombre, salario, fechaContratacion);
	        }

	        // Calcular el promedio de salarios
	        double totalSalarios = 0;
	        for (Empleado empleado : empleados) {
	            totalSalarios += empleado.getSalario();
	        }
	        
	        double promedioSalarios = totalSalarios / empleados.length;

	        // Buscar el empleado con el salario más alto
	        Empleado empleadoSalarioMaximo = empleados[0];
	        for (int i = 1; i < empleados.length; i++) {
	            if (empleados[i].getSalario() > empleadoSalarioMaximo.getSalario()) {
	                empleadoSalarioMaximo = empleados[i];
	            }
	        }

	        // Imprimir los resultados
	        System.out.println("Promedio de salarios: " + promedioSalarios);
	        System.out.println("Empleado con el salario más alto: " + empleadoSalarioMaximo.getNombre());

	        scanner.close();
	    }

	
}
