package Logica;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
    }

    
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque PLACAJE");
        
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque ARAÑAZO");

    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Pikachu y este es mi ataque MORDISCO");

    }

    @Override
    public void atacarImpacTrueno() {
       System.out.println("Hola soy Pikachu y este es mi ataque IMPACTO TRUENO");
    }

    @Override
    public void atacarPunioTrueno() {
      System.out.println("Hola soy Pikachu y este es mi ataque PUÑO DE TRUENO");
    }

    @Override
    public void atacarRayos() {
      System.out.println("Hola soy Pikachu y este es mi ataque ATACAR RAYOS");
    }

    @Override
    public void atacarRayosCargas() {
      System.out.println("Hola soy Pikachu y este es mi ataque CARGAS DE RAYOS");
    }

}
