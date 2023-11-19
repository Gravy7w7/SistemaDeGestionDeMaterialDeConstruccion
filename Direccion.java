/**
 * Clase Direccion que es usada por la clase Cliente
 * @author Pedro Jose Bacab Pech
 */
public class Direccion {

    private int calle;
    private String colonia;
    private String ciudad;
    private String referencia;

    //setter y getter


    public void setCalle(int calle) {
        this.calle = calle;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCalle() {
        return calle;
    }

    public String getColonia() {
        return colonia;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getReferencia() {
        return referencia;
    }

    /**
     * Metodo toString para imprimir las variables
     * @return los valores asignados respectivamente
     */
    public String toString(){
        return"\nCalle: "+calle
                +"\nColonia: "+colonia
                +"\nCiudad: "+ciudad
                +"\nReferencia: "+referencia;
    }
}
