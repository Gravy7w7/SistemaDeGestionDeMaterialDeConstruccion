/**
 * @Pedro José Bacab Pech
 * @Anahi del Rosario Dzul Can
 */
public class ControladorProducto {

    VistaProducto vista = new VistaProducto();

    public void menuProducto(){
        switch (vista.menuProducto()){
            case 1: AgregarProducto();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

    public void AgregarProducto(){
        Producto obj1 = new Producto(
                vista.pedirCategoria(),
                vista.pedirNombreP(),
                vista.pedirPrecio(),
                vista.pedirDescripcion(),
                vista.pedirStock(),
                vista.pedirCodigo()
        );
        System.out.println("Producto agregado con éxito :)");
    }
}
