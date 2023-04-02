
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
        aNE.elegirPresupuesto();
      }
    }
}