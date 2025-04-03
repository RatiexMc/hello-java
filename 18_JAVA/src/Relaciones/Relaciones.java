package Relaciones;

import java.util.ArrayList;
import java.util.List;

public class Relaciones {

    public static void main(String[] args) {
        Auto aut = new Auto();
        aut.setId(1L);
        aut.setMarca("BMW");
        aut.setModelo("M4");
        List<Propietario> listaPropietarios = new ArrayList<Propietario>();
        Propietario prop1 = new Propietario();
        Propietario prop2 = new Propietario();
        Propietario prop3 = new Propietario();

        prop1.setId(35L);
        prop1.setNombre("Junior");
        prop1.setApellido("Velaustegui");

        prop2.setId(20L);
        prop2.setNombre("Marcos");
        prop2.setApellido("Escobar");
        
        prop3.setId(10L);
        prop3.setNombre("Jose");
        prop3.setApellido("Espinoza");

        listaPropietarios.add(prop1);
        listaPropietarios.add(prop2);
        listaPropietarios.add(prop3);

        aut.setListaPropietarios(listaPropietarios);

        System.out.println("El auto " + aut.getMarca() + " " + aut.getModelo()
        + " tiene como propietario a: " + aut.getListaPropietarios().toString());

    }

}
