package ejercicio7javajse;

import java.util.Scanner;

public class Ejercicio7JAVAJSE {

    public static void main(String[] args) {
        /*
Ejercicios
1 - ) Llevar a cabo un programa que incluya un vector que almacene los nombres: Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel,
Luisa y Ludmila. Realizar un recorrido del vector para cargar los datos y otro recorrido para mostrar los mismos en pantallas.
2 - ) Realizar un programa que permita la carga de 10 números en un vector. Una vez cargados, se necesita que el programa determine cual 
es el mayor  y cual es el menor de ellos.
3 - ) Realizar un programa que permita la carga de 15 números en un vector, una vez cargados, se necesita que el programa cuente e informe 
por pantalla cuántas veces se cargó el número 3.
4 - ) Un empleado desea almacenar en un vector sus 12 sueldos del año. A partir de esto, necesita un programa que determine y muestre
por pantalla la suma total de sus 12 sueldos, y el promedio de sueldo que tuvo en el año
5 - ) Un alumno quiere saber cual es su promedio general de X cantidad de materias de toda su carrera, una vez ingresado la cantidad
de materiales, quiere ir cargando sus calificaciones. Imprimir su promedio.
EJERCICIO EXTRA
En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario- Cada fila corresponde a las notas de cada alumno
Se necesita un programa que permita a un profesor cargar en las 3 primeras posiciones de cada fila las notas del alumno y que en un vector diferente, se calculen los promedios
Este vector debe tener la misma cantidad de posiciones que alumnos y coincidir en sus índices
Una vez realizados los cálculos, se desea mostrar las 3 notas de cada alumno y el promedio correspondiente, recorriendo la matriz
Ejemplo
                Notas 1   Notas 2  Notas 3     /  VectorPromedio 
Alumno 1        5           4              4   /        ?
Alumno 2        5           4              5   /        ?
Alumno 3        5           4              4   /        ?
Alumno 4        5           4              5   /        ? 
        */

// Ejercicio 1
        System.out.println("Ejercicio 1");
        String nombres[] = new String[8];
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Por favor ingrese nombre:");
            nombres[i] = teclado.nextLine();
        }
        System.out.println("Los nombres ingresados son: ");
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Nombre ingresado: " + nombres[i]);
        }
// Ejercicio 2
        System.out.println("Ejercicio 2");
        int numeros[] = new int[10];
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Por favor ingrese el número a cargar: ");
            //teclado = new Scanner(System.in);
            numeros[i] = teclado.nextInt();
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(" Los valores del vector son: " + numeros[i]);
        }
        int numMayor = numeros[0], numMenor = numeros[0];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > numMayor) {
                numMayor = numeros[i];
            }
            if (numeros[i] < numMenor) {
                numMenor = numeros[i];
            }
        }
        System.out.println("El número mayor es: " + numMayor);
        System.out.println("El número menor es: " + numMenor);
// Ejercio 3
        System.out.println("Ejercicio 3");
        int contador = 0;
        int vector[] = new int[15];
        for (int i = 0; i < vector.length; i++) {
            System.out.println("En la posición " + i + " vamos cargar el valor de : ");
            vector[i] = teclado.nextInt();
            if (vector[i] == 3) {
                contador = contador + 1;
            }
        }
        for (int i = 0; i < vector.length; i++) {

            System.out.println(" Los valores del vector son: " + vector[i]);
        }
        System.out.println("Se ha ingresado el número 3, una cantidad de " + contador + " veces");
//Ejercicio 4
        System.out.println("Ejercicio 4");
        int sueldo[] = new int[12];
        int total = 0, promedio = 0;
        for (int i = 0; i < sueldo.length; i++) {
            System.out.println("Por favor ingrese su sueldo del mes N°" + (i + 1) + ": ");
            sueldo[i] = teclado.nextInt();
        }
        for (int i = 0; i < sueldo.length; i++) {
            total = total + sueldo[i];
            System.out.println("Su sueldo del mes N°" + (i + 1) + " es de: " + sueldo[i] + " USD");
        }
        promedio = total / 12;
        System.out.println("El total de dinero ganado en estos 12 meses fueron de: " + total + " USD ");
        System.out.println("El promedio de estos 12 meses de tu sueldo es de: " + promedio + " USD ");
//Ejercicio5 
        System.out.println("Ejercicio 5");
        int cantidadNotas;
        double promNotas = 0, sumNotas = 0;
        System.out.println("Ingrese la cantidad de Notas a cargar:");
        cantidadNotas = teclado.nextInt();
        int notas[] = new int[cantidadNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese su nota N°:" + (i + 1) + ": ");
            notas[i] = teclado.nextInt();
        }
        for (int i = 0; i < notas.length; i++) {
            System.out.println(" Sus calificaciones son: " + notas[i]);
            sumNotas = sumNotas + notas[i];
        }
        promNotas = sumNotas / cantidadNotas;
        System.out.println("El promedio de sus calificaciones son: " + promNotas);
//Ejercicio Extra
System.out.println("Ejercicio EXTRA");
        teclado = new Scanner(System.in);
        double notasAlumno[][] = new double[4][3];
        double promedios[] = new double[4];
        double totales;
        int contAlumno = 0;
        for (int f = 0; f < notasAlumno.length; f++) {
            contAlumno = contAlumno + 1;
            System.out.println("El alumno: " + contAlumno);
            System.out.println("Ingresa sus respectivas calificaciones: ( Tres calificaciones )");
            for (int c = 0; c < notasAlumno[0].length; c++) {
                notasAlumno[f][c] = teclado.nextDouble();
            }
        }
        for (int f = 0; f < notasAlumno.length; f++) {
            totales = 0;
            for (int c = 0; c < notasAlumno[0].length; c++) {
                totales = totales + notasAlumno[f][c];
            }
            promedios[f] = totales / notasAlumno[0].length;
        }

        contAlumno = 0;
        System.out.println("---------------Los Promedios--------------------");
        for (int f = 0; f < notasAlumno.length; f++) {
            contAlumno = contAlumno + 1;
            System.out.println("El alumno: " + contAlumno);
            for (int c = 0; c < notasAlumno[0].length; c++) {
                System.out.println("La nota cargada es: " + notasAlumno[f][c]);
            }
            System.out.println("El promedio de ese: " + promedios[f]);
            System.out.println("------------------------------------------------");
        }
















    }
    
}
