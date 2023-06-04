package herencia;

abstract class Animal {
    public abstract void emitirSonido();
    public abstract void comer();
}

class Perro extends Animal {
    public void emitirSonido() {
        System.out.println("Guau guau");
    }

    public void comer() {
        System.out.println("El perro come croquetas");
    }
}

class Gato extends Animal {
    public void emitirSonido() {
        System.out.println("Miau miau");
    }

    public void comer() {
        System.out.println("El gato come pescado");
    }
}

class Vaca extends Animal {
    public void emitirSonido() {
        System.out.println("Muu muu");
    }

    public void comer() {
        System.out.println("La vaca come pasto");
    }
//}
//
//public class Main {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        Vaca vaca = new Vaca();

        perro.emitirSonido();
        perro.comer();

        gato.emitirSonido();
        gato.comer();

        vaca.emitirSonido();
        vaca.comer();
    }
}


