package poojava12jse;
public class POOJava12JSE { 
 enum Color{
 ROJO, AZUL, VERDE, AMARILLO, NARANJA, NEGRO, BLANCO
 }  
    public static void main(String[] args) {
        Color color= Color.ROJO;
        System.out.println("Nuestro color es: "+color);
        for(Color c : Color.values()){
            System.out.println("El color es: "+c);
        }
              
    }   
}