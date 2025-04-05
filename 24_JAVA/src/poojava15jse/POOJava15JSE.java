
package poojava15jse;

import poojava15jse.logica.Hilo;
import poojava15jse.logica.HiloRunnable;


public class POOJava15JSE {

    
    public static void main(String[] args) {
      
       Hilo proceso = new Hilo();
       Thread proceso2 = new Thread(new HiloRunnable());
       proceso.start(); 
       proceso2.start();
        
    }
    
}
