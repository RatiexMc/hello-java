
package poojava14jse;
import poojava14jse.Caja;
public class POOJava14JSE {

   
    public static void main(String[] args) {
        Caja<String> cajaString = new Caja<>();
        cajaString.ponerAlgo("Hola!");
        String contenido = cajaString.obtenerAlgo();
        System.out.println("El contenido es: "+contenido);
        Caja<Integer> cajaEnteros = new Caja<>();
        cajaEnteros.ponerAlgo(22);
        Integer numero = cajaEnteros.obtenerAlgo();
        System.out.println("El contenido es: "+numero);
                
        
    }
    
}
