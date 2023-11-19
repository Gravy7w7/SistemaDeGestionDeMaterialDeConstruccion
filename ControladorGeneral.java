/**
 * @author Pedro José Bacab Pech
 * @author Anahi del Rosario Dzul can
 */
public class ControladorGeneral {
    VistaGeneral vistaG = new VistaGeneral();
    ControladorProducto controlProducto = new ControladorProducto();

    public void MenuGeneral(){

        switch(vistaG.menuGeneral()){
            case 1:controlProducto.menuProducto();
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                break;
        }
    }

}
