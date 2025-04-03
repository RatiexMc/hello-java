package Logica;
public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque PLACAJE");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Charmander y este es mi ataque ARAÑAZO");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Charmander y este es mi ataque MORDISCO");
    }
    @Override
    public void atacarPunioFuego() {
         System.out.println("Hola soy Charmander y este es mi ataque PUÑO DE  FUEGO");
    }
    @Override
    public void atacarAscuas() {
         System.out.println("Hola soy Charmander y este es mi ataque ASCUAS");
    }
    @Override
    public void atacarLanzallamas() {
         System.out.println("Hola soy Charmander y este es mi ataque LANZALLAMAS");
    }
}