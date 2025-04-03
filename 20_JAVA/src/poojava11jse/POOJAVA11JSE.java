package poojava11jse;
public class POOJAVA11JSE {
    public static void main(String[] args) {
       double num = 1.67;
       // casteo a entero
       int numInt =(int)num;
       // casteo a long
       long numLong = (long)num;
        System.out.println("Double:" +num);
        System.out.println("Int: "+numInt);
        System.out.println("Long: "+numLong);
        
        String cantidad = "15";
        String precio = "150.27";
        int cantEntero = Integer.parseInt(cantidad);
        double precioDouble = Double.parseDouble(precio);
        System.out.println("El valor total de la compra es: "+ (cantEntero * precioDouble));
        
        int edad = 30;
        double estatura = 1.67;
        String edadString = String.valueOf(edad);
        String estaturaString = String.valueOf(estatura);
        System.out.println("Edad: "+edadString+ " Estatura: "+estaturaString);
    }   
}
