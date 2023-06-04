package ArrayObjetos;

public class Persona {
    private String nombre;
    private int edad;
    
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
//}


//public class ArrayObjetos {
    public static void main(String[] args) {
        Persona[] personas = new Persona[3];
        
        personas[0] = new Persona("Juan", 25);
        personas[1] = new Persona("María", 30);
        personas[2] = new Persona("Pedro", 35);
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Edad: " + personas[i].getEdad());
            System.out.println();
        }
    }
}
