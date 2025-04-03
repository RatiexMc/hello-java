
package filas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
         Stack<Integer> pila = new Stack<Integer>();
         System.out.println("Pila Vacía: "+pila);
         System.out.println("Está vacía?"+pila.isEmpty());
    //Agregar
    pila.push(1);
    pila.push(2);
    pila.push(3);
    pila.push(4);
    pila.push(5);
    //Recorrido
    for(Integer pilita : pila){
        System.out.println(pilita);
    }
    //Mostrar
    System.out.println("Pila: "+pila);
    System.out.println("Pila Vacía: "+pila.isEmpty());
    pila.pop(); //Eliminar el último registro que entró
    System.out.println("Está el 3? "+pila.search(3));//Buscar elemento particular(INT), String no funciona
    System.out.println("Último  agregado: "+pila.peek());//Ver el último elemento agregado
        
        
    }
    
}
