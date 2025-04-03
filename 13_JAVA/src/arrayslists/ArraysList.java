package arrayslists;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArraysList {    
public static void main(String[] args) {
        List<Persona> lista = new LinkedList<Persona> ();//ArrayList reemplazado por LinkedList
        
        
        //agregar personas al final de la lista
        lista.add(new Persona(1, "Junior", 22));
        lista.add(new Persona(2, "Andrea", 21));
        lista.add(new Persona(3, "Cristan", 23));
        lista.add(new Persona(4, "Roberts", 21));
        //agregar personas al principio de la lista
        lista.add(0,new Persona(5, "Probando", 30));
        
        
        System.out.println("------PRUEBA FOR COMÚN--------");
        //recorido por índice
        for (int i=0; i<lista.size(); i++) {
            System.out.println("Prueba: " + lista.get(i).getNombre());
        }
        System.out.println("------FOREACH-----------------");
        //recorrido foreach
        for (Persona perso:lista){
            System.out.println("Prueba: "+perso.getNombre());
        }
        
        
        
        
        
        
    }   
}