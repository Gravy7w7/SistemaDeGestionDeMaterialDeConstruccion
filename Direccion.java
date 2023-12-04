import java.io.Serializable;

/**
 * Clase Direccion que es usada por la clase Cliente
 * @author Anahi del Rosario Dzul Can
 */


public class Direccion implements Serializable {

    private String calle;
    private String cruzamientos;
    private String numeroCasa;
    private String colonia;
    private String ciudad;
    private String referencia;

    /**
     * Constructor que recibe sus datos a través de la creación del cliente
     * @param calle que recibe de Cliente
     * @param cruzamientos que recibe de Cliente
     * @param numeroCasa que recibe de Cliente
     * @param colonia que recibe de Cliente
     * @param ciudad que recibe de Cliente
     * @param referencia que recibe de Cliente
     */
    public Direccion(String calle, String cruzamientos, String numeroCasa, String colonia, String ciudad, String referencia){
        this.calle=calle;
        this.cruzamientos=cruzamientos;
        this.numeroCasa=numeroCasa;
        this.colonia=colonia;
        this.ciudad=ciudad;
        this.referencia=referencia;
    }

    //setter y getter

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setCruzamientos(String cruzamientos) {
        this.cruzamientos = cruzamientos;
    }

    public void setNumeroCasa(String numeroCasa) {
        this.numeroCasa = numeroCasa;
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

    public String getCalle() {
        return calle;
    }

    public String getCruzamientos() {
        return cruzamientos;
    }

    public String getNumeroCasa() {
        return numeroCasa;
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
     * Método toString para imprimir las variables
     * @return los valores asignados respectivamente
     */
    public String toString(){
        return"\nCalle: "+calle
                +"\nCruzamiento: "+cruzamientos
                +"\nNúmero de casa: "+numeroCasa
                +"\nColonia: "+colonia
                +"\nCiudad: "+ciudad
                +"\nReferencia: "+referencia;
    }
}
