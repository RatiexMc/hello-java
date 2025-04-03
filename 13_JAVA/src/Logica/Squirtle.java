package Logica;
public class Squirtle extends Pokemon implements IAgua {
    public Squirtle() {
    } 
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirle y este es mi ataque PLACAJE");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirle y este es mi ataque ARAÑAZO");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Squirle y este es mi ataque MORDISCO");
    }
    @Override
    public void atacarHidroBomba() {
        System.out.println("Hola soy Squirle y este es mi ataque HIDROBOMBA");
    }
    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirle y este es mi ataque BURBUJA");
    }
    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirle y este es mi ataque PISTOLA DE AGUA");
    }
    @Override
    public void atacarHidroPulso() {
       System.out.println("Hola soy Squirle y este es mi ataque HIDROPULSO");
    }
}