
package poojava7jse;

import java.util.HashMap;
import java.util.Map;

public class POOJava7JSE {

    public static void main(String[] args) {
      
      Map<Integer, String> mapaEmpleados = new HashMap<>();  
      mapaEmpleados.put(1523, "Junior Osvaldo");
      mapaEmpleados.put(1524, "Andrea Celeste");
      mapaEmpleados.put(1525, "Cristian Gonzalo");
      mapaEmpleados.put(1526, "Roberts Amarilla");
      mapaEmpleados.put(1527, "Marcos Escobar");
      mapaEmpleados.put(1528, "Anto Caballero");
      mapaEmpleados.put(1529, "Anabella Caballero");
      mapaEmpleados.put(1530, "Kevin Tobias");
      mapaEmpleados.put(1531, "Eduardo Emanuel");
      
      boolean EstaoNo = mapaEmpleados.containsValue("Gabriel Gomez");
      if (EstaoNo == true){
          System.out.println("El valor buscado está: ");
      }
      else{
          System.out.println("El valor buscado no está");
      }
      EstaoNo = mapaEmpleados.containsKey(1523);
      if (EstaoNo == true){
          System.out.println("El valor buscado está ");
      }
      else{
          System.out.println("El valor buscado no está");
      }
      System.out.println(mapaEmpleados.values());
      System.out.println(mapaEmpleados.keySet());
      
      String nombre = mapaEmpleados.get(1525);
      System.out.println("El empleado buscado es: "+nombre);
      nombre = mapaEmpleados.get(3675);
      System.out.println("El empleado buscado es: "+nombre);
      
      mapaEmpleados.remove(1527);
      
      
      
      
      
        
    }
    
}
