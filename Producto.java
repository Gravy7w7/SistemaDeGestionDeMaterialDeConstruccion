import java.io.Serializable;

/**
 * Clase producto
 * @author Anahi del Rosario Dzul Can
 */
public class Producto implements Serializable {

    protected int Categoria;
    protected String NombreProducto;
    protected int Precio;
    protected String Descripcion;
    protected int Stock;
    protected int Codigo;

    /**
     * Constructor de la clase
     * @param Categoria recibido del ControladorGeneral
     * @param NombreProducto recibido del ControladorGeneral
     * @param Precio recibido del ControladorGeneral
     * @param Descripcion recibido del ControladorGeneral
     * @param Stock recibido del ControladorGeneral
     * @param Codigo recibido del ControladorGeneral
     */
    public Producto(int Categoria, String NombreProducto, int Precio, String Descripcion, int Stock, int Codigo){
        this.Categoria = Categoria;
        this.NombreProducto = NombreProducto;
        this.Precio = Precio;
        this.Descripcion = Descripcion;
        this.Stock = Stock;
        this.Codigo = Codigo;
    }

    /**
     * Constructor por defecto
     */
    public Producto(){}

    /**
     * Metodo toString para imprimir las variables
     * @return los valores asignados respectivamente
     */
    public String toString() {
        return "\nNombre del Producto: "+ NombreProducto +
                "\nCategoria: " + Categoria +
                "\nPrecio: " + Precio +
                "\nEn stock: " + Stock +
                "\nCódigo: " + Codigo;
    }

    //getter y setter

    public int getCategoria() {
        return Categoria;
    }

    public void setCategoria(int categoria) {
        Categoria = categoria;
    }

    public String getNombreProducto() {
        return NombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        NombreProducto = nombreProducto;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int codigo) {
        Codigo = codigo;
    }

}
