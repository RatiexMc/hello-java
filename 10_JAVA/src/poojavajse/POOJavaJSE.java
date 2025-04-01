package poojavajse;
public class POOJavaJSE {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno();
        Alumno alu2 = new Alumno(2,"Juan","Marecos");
        System.out.println("La Id  del alumno  2 es: "+alu2.getId());
        System.out.println("El nombre es: "+alu2.getNombre());
        System.out.println("El apellido es: "+alu2.getApellido());
        alu1.setId(1);
        alu1.setNombre("Junior");
        alu1.setApellido("Velaustegui");
        System.out.println("-------------------------------------");
        System.out.println("La Id del alumno 1 es: "+alu1.getId());
        System.out.println("El nombre es: "+alu1.getNombre());
        System.out.println("El apellido es: "+alu1.getApellido());
        System.out.println("-------------------------------------");
        //Cambiar de valor
        alu2.setId(10);
        System.out.println("La Id  del alumno  2 es: "+alu2.getId());
        System.out.println("El nombre es: "+alu2.getNombre());
        System.out.println("El apellido es: "+alu2.getApellido());
        
        
        
    
    }
    
}
