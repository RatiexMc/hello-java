
package poojava2jse;


public class POOJAVA2JSE {

    
    public static void main(String[] args) {
         Alumno alu = new Alumno();
         Alumno alu2 = new Alumno(15, "Junior","Velaustegui");
        
        System.out.println("ID: "+alu2.getId());
        System.out.println("Nombre: "+alu2.getNombre());
        System.out.println("Apellido: "+alu2.getApellido());
    
    
    
    }
    
}
