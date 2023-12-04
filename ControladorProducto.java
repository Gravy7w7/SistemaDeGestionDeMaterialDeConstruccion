/**
 * @Pedro José Bacab Pech
 * @Anahi del Rosario Dzul Can
 */
public class ControladorProducto implements Interfaz1 {

    /**
     * Crear la vista para el controlador del producto
     */
    VistaProducto vista = new VistaProducto();

    /**
     * Método que ejecuta el menu del producto y permite la entrada de un digito para ejecutar según lo que se desee hacer
     */
    public void menuProducto(){
        int opcion;

        do {
            opcion= vista.menuProducto();

            switch (opcion) {
                case 1:
                    AgregarProducto();
                    break;
                case 2:
                    menuModificarProducto();
                    break;
                case 3:
                    BorrarProducto();
                    break;
                case 4:
                    buscarProducto();
                    break;
                case 0:
                    vista.volviendoMenuPrincipal();
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }
        }while(opcion != 0);
    }

    /**
     * Método que es llamado por menuProducto() para la creación de un nuevo producto
     */
    public void AgregarProducto(){
        Producto obj1 = new Producto(
                vista.pedirCategoria(),
                vista.pedirNombreP(),
                vista.pedirPrecio(),
                vista.pedirDescripcion(),
                vista.pedirStock(),
                vista.pedirCodigo()

        );

        listaProductos.add(obj1);
        vista.agregadoConExito();
    }

    /**
     * Método que ejecuta una menu adicional para la modificación de un producto, recibiendo un digito como entrada para decidir que se desea realizar
     */
    public void menuModificarProducto(){
        int opcion;

        do {

            opcion= vista.menuModificarProducto();

            switch (opcion) {
                case 1:
                    modificarNombre();
                    break;
                case 2:
                    modificarPrecio();
                    break;
                case 3:
                    modificarCategoria();
                    break;
                case 4:
                    modificarStock();
                    break;
                case 0:
                    vista.volviendoMenuPrincipal();
                    break;
                default:
                    vista.opcionNoValida();
                    break;
            }
        }while(opcion != 0);
    }

    /**
     * Método que es llamado por menuProducto() para borrar un producto mediante su código
     */
    public void BorrarProducto(){
        int a=vista.pedirCodigo();
        boolean encontrado=false;

        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(a==b){
                int c=listaProductos.get(i).getStock()-1;
                listaProductos.get(i).setStock(c);
                vista.borradoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProducto();
        }
    }

    /**
     * Método que es llamado por menuModificarProducto para la modificación del nombre
     */
    public void modificarNombre(){
        int a=vista.pedirCodigo();
        boolean encontrado=false;

        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(a==b){
                listaProductos.get(i).setNombreProducto(vista.pedirNombreP());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProducto();
        }
    }

    /**
     * Método que es llamado por MenuMoodificarProducto para la modifiación del precio
     */
    public void modificarPrecio(){
        int a=vista.pedirCodigo();
        boolean encontrado=false;

        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(a==b){
                listaProductos.get(i).setPrecio(vista.pedirPrecio());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProducto();
        }
    }

    /**
     * Método que es llamado por menuModificarProducto para la modificación de la categoria
     */
    public void modificarCategoria(){
        int a=vista.pedirCodigo();
        boolean encontrado=false;

        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(a==b){
                listaProductos.get(i).setCategoria(vista.pedirCategoria());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProducto();
        }
    }

    /**
     * Método que es llamado por menuModificarProducto() para la modifiación del precio
     */
    public void modificarStock(){
        int a=vista.pedirCodigo();
        boolean encontrado=false;

        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(a==b){
                listaProductos.get(i).setStock(vista.pedirStock());
                vista.modificadoConExito();
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProducto();
        }
    }

    /**
     * Método que es llamado por menuProducto() para la búsqueda de un producto en concreto y saber sus característicias
     */
    public void buscarProducto(){
        int a=vista.pedirCodigo();
        boolean encontrado=false;

        for(int i=0 ; i<listaProductos.size() ; i++){
            int b = listaProductos.get(i).getCodigo();

            if(a==b){
                System.out.println(listaProductos.get(i));
                encontrado=true;
                break;
            }
        }
        if(!encontrado){
            vista.noExisteProducto();
        }
    }

}
