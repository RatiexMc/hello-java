package ejercicio5javajse;
import java.util.Scanner;
public class Ejercicio5JavaJSE {
    public static void main(String[] args) {
        /*
        Un administrador de un estacionamiento necesita un programa que permita calcular el total a pagar de varios clientes que utilizan el servicio
        El programa debe solicitar por teclado dos datos: 1. La patente del vehiculo 2. El tipo de estacionamiento
        Los tipos de estacionamientos disponibles son 3:
        1. Por hora(cuyo valor es 3usd por hora)
        2. Por media jornada(cuyo valor fijo es de 15usd y posee 5% de descuento)
        3. Jornada completa( cuyo valor fijo es de 30usd y posee 10% de descuento
        El programa debe calcular el monto a pagar para cada cliente en función al tipo de estacionamiento seleccionada. La carga de datos debe continuar hasta 
        que el usuario ingrese la palabra "fin" en lugar de la patente
        Al finalizar el programa debe mostar por pantalla
        -La cantidad total de estacionamiento por hora
        -La cantidad total de estacionamiento por media jornada
        -La cantidad total de estacionamiento por jornada completa
        -La cantidad total de ingreso que hubo durante el día 
         */
        String patente = "";
        int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
        double totalPorHora, EnHoras = 0, EnMediasJornadas = 0, EnJornadasCompletas = 0, totalPorMediaJornada, totalPorJornada, totalDia = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¡Hola cliente de EmpresaVenEstaciona!");
        while (!patente.equalsIgnoreCase("fin")) {
            System.out.println("Ingrese la patente de su vehículo");
            patente = teclado.nextLine();

            if (!patente.equalsIgnoreCase("fin")) {
                System.out.println("Ingrese el tipo de servicio");
                System.out.println("1 - Por hora - 3USD cada hora");
                System.out.println("2 - Media Jornada (5 horas) - Posee 5% de descuento");
                System.out.println("3- Jornada completa (Hasta 10 horas) - Posee 10% de descuento");
                teclado = new Scanner(System.in);
                tipoServicio = teclado.nextInt();

                if (tipoServicio <= 0 || tipoServicio > 3) {
                    System.out.println("No ingresó un tipo de servicio correcto");
                } else {

                    if (tipoServicio == 1) {
                        System.out.println("Ingrese la cantidad de horas que desea estacionar");
                        cantHoras = teclado.nextInt();
                        totalPorHora = cantHoras * 3;
                        System.out.println("El total de su estacionamiento es de: $" + totalPorHora + " USD");
                        EnHoras = EnHoras + totalPorHora;
                        cont1 = cont1 + 1;
                        totalDia = totalDia + totalPorHora;
                    } else {
                        if (tipoServicio == 2) {
                            System.out.println("El servicio de media jornada corresponde a 5 hs y posee un descuento del 5%");
                            totalPorMediaJornada = 15 - (15 * 0.05);
                            System.out.println("El total de su estacionamiento es de: $" + totalPorMediaJornada + " USD");
                            EnMediasJornadas = EnMediasJornadas + totalPorMediaJornada;
                            cont2 = cont2 + 1;
                            totalDia = totalDia + totalPorMediaJornada;
                        } else {
                            System.out.println("El servicio de jornada completa corresponde a 10 hs y posee un descuento del 10%");
                            totalPorJornada = 30 - (30 * 0.10);
                            System.out.println("El total de su estacionamiento es de: $" + totalPorJornada + " USD");
                            EnJornadasCompletas = EnJornadasCompletas + totalPorJornada;
                            totalDia = totalDia + totalPorJornada;
                            cont3 = cont3 + 1;
                        }
                    }
                    System.out.println("************* ¡MUCHAS GRACIAS POR SU COMPRA! *************\n");
                }

                teclado = new Scanner(System.in);
            }
        }

        System.out.println("===========================================================");
        System.out.println("Totales Monetarios del día");
        System.out.println("Ingreso " + EnHoras + " usd en total en estacionamientos por hora");
        System.out.println("Ingreso " + EnMediasJornadas + " usd en total en estacionamiento por media jornada");
        System.out.println("Ingreso " + EnJornadasCompletas + " usd en total en estacionamientos por jornada completa");
        System.out.println("Cantidad Servicios por Hora: " + cont1);
        System.out.println("Cantidad Servicios de Media Jornada: " + cont2);
        System.out.println("Cantidad Servicios de Jornada Completa: " + cont3);
        System.out.println("El monto total recaudado del día es de: $" + totalDia + " USD");

    }

}
