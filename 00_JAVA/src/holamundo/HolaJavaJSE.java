package holamundo;

import java.util.Scanner;//Librería para detectar mensaje recibido por el teclado

public class HolaJavaJSE {//Clase principal

    public static void main(String[] args) {//Todo lo que se va ejecutar y mostrar en pantalla 
        Scanner teclado = new Scanner(System.in);//Al tener el teclado en español, va tomar mi valor decimal con coma
        // Hola Mundo
        System.out.println("Hola Mundo! Bienvenido a JAVA");
        System.out.println("Hola, JAVA es increíble");
        // Tipos de datos
        int miedad = 22;
        double estatura = 1.72;
        boolean tieneCarnet = true;
        char letra = 'A';
        String direccion = "Como me encanta JAVA ahora";
        long numeroLargo = 975464192;
        System.out.println("Hola! Mi Edad es: " + miedad);
        System.out.println("Mi estatura es: " + estatura);
        System.out.println("Dirección:" + direccion);
        // Operadores 
        // Declaraciones de variables
        double num1, num2, suma;
        System.out.println("Ingrese el primer número a operar");
        num1 = teclado.nextInt();//Método del escaner que me permite traer un "entero" para recibirlo, va darme error en números con coma o letras
        //Si quiero recibir un número con coma num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo número a operar");
        num2 = teclado.nextInt();
        suma = num1 / num2;
        System.out.println("El resultado es:" + suma);
        // Condicionales de JAVA
        int edad;
        System.out.println("Ingrese la edad");
        edad = teclado.nextInt();
        // Operador IF / Operador IF/ELSE / Operadores Múltiples
        if (edad > 18) {
            System.out.println("Sos mayor de 18, Felicitaciones");

            if (edad > 40) {
                System.out.println("Sos generación X");
            } else {
                System.out.println("Sos millennial o Centennial");
            }
        } else {
            if (edad == 18) {
                System.out.println("Tu edad es 18");
            } else {
                System.out.println("Sos menor de 18, Crece aún");
            }
        }
        System.out.println("Llegué al final");
        //Estructura Switch
        System.out.println("Estructura Switch");
        //Declaración de la variables
        int dia = 0;
        String nombreDia;
        //Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 7");
        dia = teclado.nextInt(); //Lee el teclado por el día de la semana
        switch (dia) {
            case 1:
                nombreDia = "Lunes";
                break;//Rompe de que se terminó de ejecutar el caso 1
            case 2:
                nombreDia = "Martes";
                break;//Rompe de que se terminó de ejecutar el caso 2
            case 3:
                nombreDia = "Miércoles";
                break;//Rompe de que se terminó de ejecutar el caso 3
            case 4:
                nombreDia = "Jueves";
                break;//Rompe de que se terminó de ejecutar el caso 4
            case 5:
                nombreDia = "Viernes";
                break;//Rompe de que se terminó de ejecutar el caso 5
            case 6:
                nombreDia = "Sábado";
                break;//Rompe de que se terminó de ejecutar el caso 6
            case 7:
                nombreDia = "Sábado";
                break;//Rompe de que se terminó de ejecutar el caso 7
            default:
                nombreDia = "Dia Incorrecto"; // Si la persona pone otro número que no deba
        }
        System.out.println("El día de la semana es:" + nombreDia);
        //Comparar String 
        String cadena1 = "Hola";
        String cadena2 = "hola";
        boolean resultado = cadena2.equals(cadena1);
        System.out.println(resultado);
        String nuevaCadena1 = cadena1.toUpperCase();
        String nuevaCadena2 = cadena2.toUpperCase();
        resultado = nuevaCadena1.equals(nuevaCadena2);
        //Validar el mismo texto, ignorando el mayuscula o minuscula
        System.out.println("resultado");
        // Otro metódo de convertir en 1 sola línea
        // boolean resultado = cadena2.toUpperCase().equals(cadena1.toUpperCase());
        // Solo validar el contenido
        cadena1.equalsIgnoreCase(cadena2);
        // Concatenar String
        String nombre = "Codi";
        String curso = "Curso de JAVA";
        String mensaje = "Hola, bienvenido ".concat(nombre);
        mensaje = mensaje.concat("al");
        mensaje = mensaje.concat("curso");
        mensaje = mensaje.concat(".");
        //Otra manera para concatenar String
        System.out.println("Hola, bienvenido " + nombre + "al" + curso + ".");
        // Condiciones IF CODIGOFACILITO
        String colorLuz = "Verde";
        if (colorLuz.equals("Verde")) {
            System.out.println("Puede continuar");
        } else {
            System.out.println("Alto Total");
        }
        // El promedio mínimo para aprobar es de 7
        // Si el promedio es diez = muchas felicidades
        // Si el promedio es aprobatorio menor a 10 = Felicidades
        // Si el promedio no es aprobatorio = Es necesario repasar bloques
        int promedios = 9;
        if (promedios <= 7) {
            System.out.println("Felicidades");
            //El promedio es aprobatorio
            if (promedios == 10) {
                System.out.println(" Muchas felicidades");
            }
        } else {
            //El promedio no es aprobatorio
            System.out.println("Es necesario repasar bloques");
        }
        // Scope o Alcance
        int promedio1 = 10;
        if (promedio1 > 7) {
            String mensajes = "Felicidades, tu promedio es de " + promedio1;
            if (promedio1 == 10) {
                System.out.println(mensajes);
            }
        }
        System.out.println(mensaje);
        // Switch 
        char calificacion = 'B';
        switch (calificacion) {
            case 'A':
                System.out.println("Excelente");
                break;
            case 'B':
                System.out.println("Bien Hecho");
                break;
            case 'C':
                System.out.println("Bien Hechos");
                break;
            case 'D':
                System.out.println("Excelente");
                break;
            case 'E':
                System.out.println("Aprobatorio");
                break;
            case 'F':
                System.out.println("Puedes mejorar");
                break;
            default:
                System.out.println("Calificacion no válida");
        }
        //Ejemplo
        int numeroMes = 4;
        String estacion = "", mes = "";
        switch (numeroMes) {
            case 12:
                mes = "Diciembre";
            case 1:
                mes = "Enero";
            case 2:
                mes = "Febrero";
                estacion = "Invierno";
                break;
            case 3:
                mes = "Marzo";
            case 4:
                mes = "Abril";
            case 5:
                mes = "Mayo";
                estacion = "Primavera";
                break;
            case 6:
                mes = "Junio";
            case 7:
                mes = "Julio";
            case 8:
                mes = "Agosto";
                estacion = "Verano";
                break;
            case 9:
                mes = "Septiembre";
            case 10:
                mes = "Octubre";
            case 11:
                mes = "Noviembre";
                estacion = "Otoño";
                break;
        }
        System.out.println("El mes de " + mes + " se encuentra en la estación " + estacion);
        String tipoDia = "";
        String diaSemana = "Lunes";
        switch (diaSemana.toLowerCase()) {
            case "lunes":
                tipoDia = "Inicio de semana";
                break;
            case "martes":
            case "míercoles":
            case "jueves":
                tipoDia = "Mediados de semana";
                break;
            case "viernes":
                tipoDia = "Inicio de fin se semana";
                break;
            case "sábado":
            case "domingo":
                tipoDia = "Fin de seman";
                break;
        }
        System.out.println(diaSemana + " es " + tipoDia);
    }
}
