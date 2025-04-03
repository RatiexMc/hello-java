package poojava5jse;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
public class POOJava5JSE {
    public static void main(String[] args) {
        List<Persona> listaArray = new ArrayList<Persona>();
        listaArray.add(new Persona(1, "Junior", 22));
        listaArray.add(new Persona(2, "Andrea", 21));
        listaArray.add(new Persona(3, "Cristan", 23));
        listaArray.add(new Persona(4, "Roberts", 21));
        LinkedList<Persona> listaLinked = new LinkedList<Persona>();
        listaLinked.add(new Persona(1, "Junior", 22));
        listaLinked.add(new Persona(2, "Andrea", 21));
        listaLinked.add(new Persona(3, "Cristan", 23));
        listaLinked.add(new Persona(4, "Roberts", 21));
        //Remove en ArrayList
        listaArray.remove(1);
        //Remove en LinkedList
        String nombreBorrar = "Andrea";
        for (Persona persona2 : listaLinked) {
            if (persona2.getNombre().equals(nombreBorrar)) {
                listaLinked.remove(persona2);
                break; //Corto que deje de recorrer
            }
        }
        System.out.println("----Luego de eliminar----");
        //recorrido foreach
        System.out.println("------ARRAYLIST--------");
        for (Persona persona : listaArray) {
            System.out.println("Prueba: " + persona.getNombre());
        }
        System.out.println("-------LINKEDLIST--------");
        for (Persona persona : listaLinked) {
            System.out.println("Prueba" + persona.getNombre());
        }
        //Tamaño Lista
        System.out.println("-------Que tamaño tienen las listas?-----------");
        System.out.println("ArrayList: " + listaArray.size());
        System.out.println("LinkedList: " + listaLinked.size());

        //Obtener el primer objeto
        System.out.println("----PRIMER y úLTIMO OBJETO ( Solo para LINKED LIST------");
        // PARA QUE TE ACEPTE EL GETFIRST Y GETLAST DEBERIAS USAR LINKEDLIST EN VEZ DE LIST
        System.out.println("Primero de LinkedList: " + listaLinked.getFirst().toString());
        System.out.println("Ultimo de LinkedList:" + listaLinked.getLast().toString());
        //Borrar toda la lista
        System.out.println("---BORRANDO LISTAS..-----");
        listaArray.clear();
        listaLinked.clear();
        //Comprobar si está vacía
        System.out.println("---------------Está vacía alguna lista?---------");
        System.out.println("ArrayList: " + listaArray.isEmpty());
        System.out.println("LinkedList: " + listaLinked.isEmpty());
    }
}
