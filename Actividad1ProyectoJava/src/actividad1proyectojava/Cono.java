package actividad1proyectojava;

/**
 *
 * @author Adrian Santana
 */
public class Cono extends Circulo {

    private float altura;

    private String color;

    /**
     * CONSTRUCTOR SIN PARAMETROS
     */
    public Cono() {
    }

    /**
     *
     * @param altura se Introduce el valor altura
     * @param color  se introduce el valor color
     */
    public Cono(float altura, String color) {
        this.altura = altura;
        this.color = color;
    }

    /**
     *
     * @param altura se introduce el valor altura
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     *
     * @param color se introduce el valor color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     * @param radio se introduce el valor radio heredado
     */
    public void setRadio(float radio) {
        this.radio = radio;
    }

    /**
     *
     * @param CentroX Se introduce el valor CentroX heredado
     */
    public void setCentroX(float CentroX) {
        this.CentroX = CentroX;
    }

    /**
     *
     * @param CentroY se introduce el valor CentroY heredado
     */
    public void setCentroY(float CentroY) {
        this.CentroY = CentroY;
    }

    /**
     *
     * @return se retorna el valor de la altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     *
     * @return Se retorna el valor del conor.
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @return Se retorna el valor del radio heredado.
     */
    public float getRadio() {
        return radio;
    }

    /**
     *
     * @return Se retorna el valor CentroX heredado.
     */
    public float getCentroX() {
        return CentroX;
    }

    /**
     *
     * @return Se retorna el valor de CentroY heredado
     */
    public float getCentroY() {
        return CentroY;
    }
    
    /**
     *METODO QUE IMPRIMIRÁ UN LOS VALORES DE ALTURA, COLOR, RADIO, CENTROX Y CENTROY.
     */
    public void imprimir() {
        

    System.out.println("Altura" + getAltura());
    System.out.println("Color:" + getColor());
    System.out.println("radio:" + getRadio());
    System.out.println("CentroX:" + getCentroX());
    System.out.println("CentroY:" + getCentroY());
         
    }
}
