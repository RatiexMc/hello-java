package ejercicio4javajse;
import java.util.Scanner;
public class Ejercicio4JavaJSE {
    public static void main(String[] args) {
        // Realizar un programa que muestre en pantalla los números del 1 al 35 (uno abajo del otro)
        // Utilizar para esto alguna estrucutra repetitva.
        System.out.println(" Ejercicio 1");
        for (int cont = 0; cont <= 35; cont++) {
            System.out.println("Número: " + cont);
        }
        // Realizar un programa que dado por teclado un límite númerico(por ejemplo 100) muestre en pantalla todos los números hasta ese límite(empezando en 1)
        System.out.println("Ejercicio 2");
        int limite;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor ingrese un número: ");
        limite = teclado.nextInt();
        for (int contador = 1; contador <= limite; contador++) {
            System.out.println("Contando hasta el número ingresado:" + contador);
        }
        // Realizar un programa que muestre por pantalla los números del 200 al 250 saltando de 2 en 2. La secuencia deberia ser: 200...202...204...250  
        System.out.println("Ejercicio 3");
        for (int cont = 200; cont <= 250; cont = cont + 2) {
            System.out.println("Contando de 2 en 2 desde 200 hasta 250: " + cont);
        }
        // Reliza un programa que lleve a cabo la cuenta regresiva para el año nuevo. La cuenta debe comenzar en 10 y terminar en 1
        System.out.println("Ejercicio 4");
        for (int regresiva = 10; regresiva >= 1; regresiva = regresiva - 1) {
            System.out.println("Faltan: " + regresiva + "seg para año nuevo");
        }
        System.out.println("Feliz año nuevo!");
        // Realiza un programa que muestre en pantalla palabras que sean ingresadas por teclado hasta que se ingresen la palabra "salir"
        System.out.println("Ejercicio 5");
        String palabra;
        boolean bandera = true;
        while (bandera == true) {
            System.out.println("Ingresa una palabra, Yo lo repetiré");
            System.out.println("Pero si me dices 'salir', me voy");
            palabra = teclado.next();// Scanner teclado = new Scanner(System.in)
            System.out.println("La palabra ingresada es: " + palabra);
            if (palabra.equalsIgnoreCase("salir")) {
                bandera = false;
            }
        }
    }
}
