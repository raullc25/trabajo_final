package herencia;

abstract class Empleado {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public abstract double calcularSalario();

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }
}

class Gerente extends Empleado {
    private double bono;

    public Gerente(String nombre, double salario, double bono) {
        super(nombre, salario);
        this.bono = bono;
    }

    public double calcularSalario() {
        return salario + bono;
    }
}

class Desarrollador extends Empleado {
    private int horasExtra;

    public Desarrollador(String nombre, double salario, int horasExtra) {
        super(nombre, salario);
        this.horasExtra = horasExtra;
    }

    public double calcularSalario() {
        return salario + (horasExtra * 20);
    }
}

class Vendedor extends Empleado {
    private double comision;

    public Vendedor(String nombre, double salario, double comision) {
        super(nombre, salario);
        this.comision = comision;
    }

    public double calcularSalario() {
        return salario + comision;
    }
//}

//public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", 5000, 1000);
        Desarrollador desarrollador = new Desarrollador("Ana", 3000, 5);
        Vendedor vendedor = new Vendedor("Pedro", 2000, 500);

        System.out.println("Salario del gerente: " + gerente.calcularSalario());
        System.out.println("Salario del desarrollador: " + desarrollador.calcularSalario());
        System.out.println("Salario del vendedor: " + vendedor.calcularSalario());
    }
}

