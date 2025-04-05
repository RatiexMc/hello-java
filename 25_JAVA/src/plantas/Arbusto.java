
package plantas;

public class Arbusto extends Planta{
    
    private double ancho;
    private boolean esDomestico;
    private String Variedad;
    private String colorHojas;
    private boolean sePodaONo;

    public Arbusto() {
    }

    public Arbusto(double ancho, boolean esDomestico, String Variedad, String colorHojas, boolean sePodaONo, String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.ancho = ancho;
        this.esDomestico = esDomestico;
        this.Variedad = Variedad;
        this.colorHojas = colorHojas;
        this.sePodaONo = sePodaONo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public String getVariedad() {
        return Variedad;
    }

    public void setVariedad(String Variedad) {
        this.Variedad = Variedad;
    }

    public String getColorHojas() {
        return colorHojas;
    }

    public void setColorHojas(String colorHojas) {
        this.colorHojas = colorHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }
    
    
    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola soy un arbusto");
    }
    
    
    
    
    
}
