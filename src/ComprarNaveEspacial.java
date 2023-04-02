import java.util.Scanner;

import nave_espacial.NaveEspacial;
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
      int n;
        n = -1;
        while(n != 0){
          n = MAux.getNum();
          aNE.armarNave(n);
          if(n == 0 && !aNE.getNaveEspacial().naveTerminada()){
            System.out.println("La nave aun no esta terminada.");
            n = -1;
          }
        }
        if(aNE.getNaveEspacial().getCosto() <= aNE.getPresupuesto()){
          System.out.println("Tu nave está lista para recoger, estas son sus caracteristicas: \n"
          + aNE.getNaveEspacial().muestraNave() 
          + "\nPor favor paga en caja: " + aNE.getNaveEspacial().getCosto());
        }else{
          aNE.elegirPresupuesto();
        }
    }
}