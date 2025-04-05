package poojava13jse;
import poojava13jse.enums.Color;
public class POOJava13JSE {
   
    public static void main(String[] args) {
        
        for(Color color : Color.values()){
           System.out.println("Color: "+color);
        }
        Color col = Color.AZUL;
        System.out.println(col.name());
        System.out.println(col.ordinal());
    
        col = Color.valueOf("VERDE");
        System.out.println("Encontré el color: "+col);
        /*
        EXCEPCIÓN
        col = Color.valueOf("BERDE");
        System.out.println("Encontré el color: "+col); 
        */
        try{
        col = Color.valueOf("BERDE");
        System.out.println("Encontré el color: "+col); 
        }catch(IllegalArgumentException e){
            System.out.println("Ocurrió una excepción. El valor no es correcto");
        }        
    }   
}