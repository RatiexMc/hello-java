package plantas;

public class Arbol extends Planta {

    private String variedad;
    private String tipoTronco;
    private String radioTronco;
    private String color;
    private String TipoHoja;

    public Arbol() {
    }

    public Arbol(String variedad, String tipoTronco, String radioTronco, String color, String TipoHoja, 
                  String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        super(nombre, altoTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoTronco = tipoTronco;
        this.radioTronco = radioTronco;
        this.color = color;
        this.TipoHoja = TipoHoja;
    }

    public String getVariedad() {
        return variedad;
    }

    public void setVariedad(String variedad) {
        this.variedad = variedad;
    }

    public String getTipoTronco() {
        return tipoTronco;
    }

    public void setTipoTronco(String tipoTronco) {
        this.tipoTronco = tipoTronco;
    }

    public String getRadioTronco() {
        return radioTronco;
    }

    public void setRadioTronco(String radioTronco) {
        this.radioTronco = radioTronco;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoHoja() {
        return TipoHoja;
    }

    public void setTipoHoja(String TipoHoja) {
        this.TipoHoja = TipoHoja;
    }

    @Override
    public void decirLoQueSoy() {
        System.out.println("Hola, soy un árbol");
    }

}
