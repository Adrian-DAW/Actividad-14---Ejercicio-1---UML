package actividad1proyectojava;

/**
 *
 * @author Adrian Santana
 */
public class Punto {

    /**
     * Representa la posición X del punto
     */
    protected float CentroX;

    /**
     * Representa la posición Y del punto
     */
    protected float CentroY;

    /**
     * Constructor sin parametros del punto
     */
    public Punto() {
    }
    
    /**
     *
     *CONSTRUCTOR CON PARAMETROS
     * 
     * @param CentroX Indicamos posicion  X
     * @param CentroY Indicamos posicion Y
     */
    public Punto(float CentroX, float CentroY) {
        this.CentroX = CentroX;
        this.CentroY = CentroY;
    }

    /**
     *
     * @param CentroX Se introduce el valor de X
     */
    public void setCentroX(float CentroX) {
        this.CentroX = CentroX;
    }

    /**
     *
     * @param CentroY Se introduce el valor de Y
     */
    public void setCentroY(float CentroY) {
        this.CentroY = CentroY;
    }

    /**
     *
     * @return Retornamos el valor de X
     */
    public float getCentroX() {
        return CentroX;
    }

    /**
     *
     * @return Retornamos el valor de Y
     */
    public float getCentroY() {
        return CentroY;
    }
    
 
    
}
