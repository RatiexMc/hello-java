package Logica;
public class Bulbasur extends Pokemon implements IPlanta {
    public Bulbasur() {
    }
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque PLACAJE");
    }
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y este es mi ataque ARAÑAZO");
    }
    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy Bulbasur y este es mi ataque MORDISCO");
    }
    @Override
    public void atacarParalizar() {
          System.out.println("Hola soy Bulbasur y este es mi ataque PARALIZAR");
    }
    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque DRENAJE");
    }
    @Override
    public void atacarHojaAfilada() {
           System.out.println("Hola soy Bulbasur y este es mi ataque HOJA AFILADA");
    }
    @Override
    public void atacarLatigoCepal() {
          System.out.println("Hola soy Bulbasur y este es mi ataque LATIGOCEPAL");
    }
}