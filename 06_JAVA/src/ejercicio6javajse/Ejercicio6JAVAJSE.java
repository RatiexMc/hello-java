package ejercicio6javajse;
import java.util.Scanner;
public class Ejercicio6JAVAJSE {
    public static void main(String[] args) {
        // VECTORES
        //int numeros [] = {15,25,22,13,64,91,23}; // Va tomar como vector de 7 índice
        int numeros[] = new int[8];
        numeros[0] = 15;// Primera posicion Pero es el Indice 0
        numeros[1] = 35;// Segunda posicion Pero es el Indice 1
        numeros[2] = 22;// Tercera posicion Pero es el Indice 2
        numeros[3] = 14;// Cuarta posicion Pero es el Indice 3..
        numeros[4] = 64;
        numeros[5] = 61;
        numeros[6] = 91;
        numeros[7] = 23;
        //Mostrar el elemento de la 5nta posición
        System.out.println("El elemento de la 5nta posición es: "+numeros[4]);
        // Recorrer el vector
        for (int i=0; i< numeros.length; i++){
            System.out.println("Estoy en el Índice: "+i+" y el valor es: "+numeros[i]);
        }
        //Que el usuario ingrese los valores del vector
        Scanner teclado = new Scanner(System.in);
        for (int i=0; i< numeros.length ; i++){
            System.out.println("Ingrese el valor para el Indice "+i+": ");
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Los valores ingresados son: ");
        for (int i=0; i< numeros.length; i++){
            System.out.println("Estoy en el Índice: "+i+" y el valor es: "+numeros[i]);
        }
        // MATRICES
        int matriz [] [] = new int [3][4];
        //Scanner teclado = new Scanner(System.in);
        System.out.println("Tamaño de Filas: "+matriz.length);// Así lee las filas en matrices de java
        System.out.println("Tamaño de Columnas: "+matriz[0].length); // Así lee las columnas en matrices de java
        //Recorrido y carga de matrices
        for( int f=0; f<3; f++){
            for(int c=0; c<4; c++){
                System.out.println("Ingrese el valor para la fila: "+f+" y la columna "+c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        //Recorrido y muestra de matrices
        for( int f=0; f<3; f++){
            for(int c=0; c<4; c++){
                System.out.println("Fila: "+f+" Columna:"+c+" Valor: "+matriz[f][c]);
            }
        }       
    }   
}
