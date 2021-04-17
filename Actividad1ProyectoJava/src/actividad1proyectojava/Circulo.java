package actividad1proyectojava;

/**
 *
 * @author Adrian Santana
 */
public class Circulo extends Punto {

    /**
     *
     */
    protected float radio;

    /**
     *CONSTRUCTOR SIN PARAMETROS DE CLASE CIRCULO
     */
    public Circulo() {
    }

    /**
     *
     * CONSTRUCTOR CON PARAMETROS DE CLASE CIRCULO
     * 
     * @param radio Introducimos el radio del circulo
     */
    public Circulo(float radio) {
        this.radio = radio;
    }

    /**
     *
     * 
     * 
     * @param radio Introducimos el radio del circulo
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     *
     * @param CentroX se introduce el valor CentroX heredado
     */
    public void setCentroX(float CentroX) {
        this.CentroX = CentroX;
    }

    /**
     *
     * @param CentroY Se introduce el valor CentroY heredado
     */
    public void setCentroY(float CentroY) {
        this.CentroY = CentroY;
    }

    /**
     *
     * @return Retornamos el radio
     */
    public float getRadio() {
        return radio;
    }

    /**
     *
     * @return Retornamos la posicion X heredada
     */
    public float getCentroX() {
        return CentroX;
    }

    /**
     *
     * @return la posicion Y heredada
     */
    public float getCentroY() {
        return CentroY;
    }
    
    
    
    
    
    
}
