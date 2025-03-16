package ejercicio3javajse;
import java.util.Scanner;
public class Ejercicio3JavaJSE {
    public static void main(String[] args) {   
     int contador = 0;
     //Do While
     do{
         System.out.println("Estoy en la vuelta N° "+contador);//+(contador+1)
     contador = contador +1; // contador++
     }while(contador<10);
     // While
     // Bucle controlado por controlador
     contador = 0;
     while(contador <10){
         System.out.println("Estoy en la vuelta de N° "+contador);
         contador ++;
     }
     // Bucle controlado por centinela
     boolean bandera = true;
     Scanner teclado = new Scanner(System.in);
     String respuesta;
     while(bandera == true){
         System.out.println("El valor de mi bandera es: "+bandera);
         System.out.println("Estás actualmente suscrito? "+bandera);
         System.out.println("¿Querés salir de TodoCode?");
         respuesta = teclado.next();
         if(respuesta.equalsIgnoreCase("si")){ 
        // Comparar el texto del string, añadiendo al equals el IgnoreCase, para que ignore el mayuscula y minusculas
         bandera = false;
         }  
     }
     //Bucle For
     for (contador = 0; contador<10; contador++){
         System.out.println("Estoy en el for N°"+contador); 
     }
     // Bucle Infinito
     contador = 0;
     while(contador <=10){
         System.out.println("Bucle Infinito");
     }
    }
}