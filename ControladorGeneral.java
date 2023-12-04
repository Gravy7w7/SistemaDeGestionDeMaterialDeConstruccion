/**
 * @author Pedro José Bacab Pech
 * @author Anahi del Rosario Dzul can
 */
public class ControladorGeneral implements Interfaz1 {

    CargarElementos obj1 = new CargarElementos();

    VistaGeneral vistaG = new VistaGeneral();
    ControladorProducto controlProducto = new ControladorProducto();
    ControladorVentaProducto controlVenta = new ControladorVentaProducto();
    ControladorCliente controlCliente = new ControladorCliente();
    ControladorProveedor controlProveedor = new ControladorProveedor();


    /**
     * Primer Método que se ejecuta en el programa, es el menú principal
     */
    public void MenuGeneral(){
        int opcion;

        obj1.InicializarProductos();
        obj1.InicializarClientes();
        obj1.InicializarProveedores();
        obj1.InicializarVentas();

        do {
            opcion= vistaG.menuGeneral();

            switch (opcion) {
                case 1:
                    controlProducto.menuProducto();
                    break;
                case 2:
                    controlCliente.menuCliente();
                    break;
                case 3:
                    controlProveedor.menuProveedor();
                    break;
                case 4:
                    controlVenta.venderProducto();
                    break;
                case 5:
                    imprimirRegistroDeVentas();
                    break;
                case 0:
                    vistaG.saliendoDelPrograma();
                    break;
                default:
                    vistaG.opcionNoValida();
                    break;
            }
        }while(opcion != 0);
    }

    /**
     * Método que sirve para poder ver el registro de ventas
     */
    public void imprimirRegistroDeVentas(){
        int a= vistaG.ingreseNumeroDeVenta();
        boolean encontrado=false;

        for(int i=0 ; i<listaVenta.size() ; i++){
            int b = listaVenta.get(i).getNumeroDeVenta();

            if(a==b){
                System.out.println(listaVenta.get(i));
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vistaG.noExisteVenta();
        }

    }

}
