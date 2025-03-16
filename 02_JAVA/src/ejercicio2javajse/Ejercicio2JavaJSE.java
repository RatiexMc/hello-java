package ejercicio2javajse;
import java.util.Scanner;
public class Ejercicio2JavaJSE {
    public static void main(String[] args) {
        // Programa que dependiendo del promedio de un alumno de un alumno, nos diga si aprobó o no una materia  
        // Se aprueba a partir de 6 puntos de 10 puntos
        Scanner teclado = new Scanner(System.in);
        double promedio;
        String condicionFinal;
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();
        if (promedio < 0 || promedio > 10) {
            System.out.println("Tu promedio está fuera entre 1 y 10");
        } else {
            condicionFinal = promedio >= 6 ? "Aprobado" : "Desaprobado";
            System.out.println("La condición final del alumno es: " + condicionFinal + " y el promedio fue: " + promedio);
        }
        /*   Una tienda vende Fideo y Arroz al por mayor mediante su página web, Como se trata de una tienda mayorista, pues solicita la cantidad de paquetes 
             en cada venta y dependiendo de estas, realiza controles
             -Si la cantidad de productos es menor a 5: Se debe emitir un mensaje indicando que no se permiten compras inferiores a 5 productos
             -Si la cantidad de productos es mayor o igual a 5 pero menor a 15: Se debe emitir un mensaje que el costo del envío es de 10 usd
             -Si la cantidad de productos es mayor a 15, se debe de emitir que el costo de envío es gratuito
        EXTRA:
            Solicitar, adémas de la cantidad de paquetes, el costo total que suma la compra en USD, y aplicar las siguientes promociones
            -Si el monto total es inferior a 100usd: No hay promociones. Informar cuanto USD más necesita para poder entrar a una promoción
            -Si el monto total supera los 100usd pero es menor a los 300usd: Informar que posee un descuento del 5% sobre el total. Especificar cuanto sería el
            nuevo monto total con descuento
            -Si el monto supera los 300usd, Informar que posee un descuento de 10%. Especificar cuanto sería el nuevo monto total con descuento
         */
        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalConDesc;
        //Scanner teclado = new Scanner(System.in);
        //Preguntar por teclado cuantos paquetes son
        System.out.println("Ingrese la cantidad de paquetes");
        cantidadPaquetes = teclado.nextInt();
        // Evaluar los posibles casos
        if (cantidadPaquetes < 5) {
            if (cantidadPaquetes < 0) {
                System.out.println("No se permiten compras con cantidad de paquetes negativos");
            } else {
                System.out.println("No se permiten ventas minoristas (cantidad de paquetes menor a 5)");
            }
        } else {
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();

            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
                System.out.println("El costo del envío es de 10 USD");
                montoTotal = montoTotal + 10;
            } else {
                System.out.println("Usted no tiene costo de envío. ¡Muchas gracias por su compra!");
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 por lo que no posee promociones. Necesita comprar: " + diferencia + " USD para entrar en promo");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = montoTotal * 0.05;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDesc);
                } else {
                    descuento = montoTotal * 0.10;
                    totalConDesc = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10% que equivale a: " + descuento
                            + " El monto total con descuento es de: " + totalConDesc);
                }
            }

        }

    }

}