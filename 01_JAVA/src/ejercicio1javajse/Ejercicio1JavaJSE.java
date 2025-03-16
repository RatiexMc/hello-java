/*  Un instituto de Inglés desea informar a sus alumnos los 'días' y 'horarios' de sus clases. Para ello, decidió la creación de una aplicación que, a partir 
    del ingreso de la edad del alumno, le informe en que día y horario los alumnos tienen clase, como información, la academia proporciona los siguientes datos 
    respecto a los grupos y diferentes horarios
    kinder(4 a 6 años)
    Lunes y Miércoles de 16:00 a 17:00
    1er año(de 7 a 8 años)
    Martes y Jueves de 16:30 a 17:30
    2ndo año(De 9 a 10 años)
    Martes y Jueves de 17:30 a 19:00
    3er año(De 11 a 13 años)
    Lunes y Miércoles de 17:00 a 18:30
 */
package ejercicio1javajse;

import java.util.Scanner;

public class Ejercicio1JavaJSE {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        System.out.println("*****Bievenido a tu consulta de horarios!*****");

        System.out.println("Ingrese tu edad para saber tu horario de curso");
        edad = teclado.nextInt();
        if (edad < 4 || edad > 13) {
            System.out.println("Tu edad está por fuera de las edades de nuestros cursos disponibles");
        } else {
            if (edad >= 4 && edad < 7) {
                System.out.println("En Curso Kinder, el horario es: Lunes y Miércoles de 16:00 a 17:00");
            } else {

                if (edad >= 7 && edad < 9) {
                    System.out.println("En 1er Año, el horario es Martes y Jueves de 16:30 a 17:30");
                } else {
                    if (edad >= 9 && edad < 11) {
                        System.out.println("En 2ndo Año, el horario es Martes y Jueves de 17:30 a 19:00");
                    } else {
                        if (edad >= 11 && edad < 14) {
                            System.out.println("En 3er año, el horario es Lunes y Miercoles de 17:00 a 18:30");
                        }
                    }
                }
            }
        }
    }
}
