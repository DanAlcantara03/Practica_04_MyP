import nave_espacial.naves.MAux;

/**
  * Clase main para elegir alguna de las naves espaciales del catalogo.
 */
public class ComprarNaveEspacial{

    public static void main(String [] args){
      /* Objeto que nos va a simplificar mucho la implemetnación del programa. */
      ArmarNaveEspacial aNE = new ArmarNaveEspacial();
      
      System.out.println("Bienvenido al sistema para crear naves espaciales :.)");      
      aNE.setPresupuesto();
      aNE.armarNave();
      if(aNE.getNaveEspacial().getCosto() <= aNE.getPresupuesto()){
        System.out.println("Tu nave está lista para recoger, estas son sus caracteristicas: \n"
        + aNE.getNaveEspacial().muestraNave() 
        + "\nPor favor paga en caja: " + aNE.getNaveEspacial().getCosto());
      }else{
        boolean salir = true;
        while(salir){
        aNE.elegirPresupuesto();
        if(aNE.getNaveEspacial().getCosto() <= aNE.getPresupuesto()){
          System.out.println("\nDesea salir del programa?\n1. Si \n2.No");
          int n = MAux.getNum();
          switch(n){
            case 1: 
              salir = false;
            break;
            case 2:
            break;
            default:
            System.out.println("Esa es una opción invalida.\n");
          }
        }
      }
    }
  }
}