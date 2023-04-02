package nave_espacial.naves;

import java.util.LinkedList;
import java.util.Scanner;
import nave_espacial.componentes.ComponenteNave;
import nave_espacial.componentes.armas.armas_laser_destructor_de_planetas.LaserDestructorPD;
import nave_espacial.componentes.armas.armas_laser_simple.LaserSimplePD;
import nave_espacial.componentes.armas.armas_misiles_plasma.MisilesPlasmaPD;
import nave_espacial.componentes.blindaje.blindaje_fortaleza.FortalezaPD;
import nave_espacial.componentes.blindaje.blindaje_reforzado.ReforzadoPD;
import nave_espacial.componentes.blindaje.blindaje_simple.SimplePD;
import nave_espacial.componentes.cabina.cabina_ejercito.EjercitoPD;
import nave_espacial.componentes.cabina.cabina_tripulacion_pequeña.TripulacionPequeñaPD;
import nave_espacial.componentes.cabina.cabina_upiloto.PilotoPD;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intercontinental.IntercontinentalPD;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intergalactico.IntergalacticoPD;
import nave_espacial.componentes.sistema_de_propulsion.sdp_interplanetario.InterplanetarioPD;
/**
 * Clase especificamente hecha para obtener información de los componentes que hay 
 * disponibles y tambien para facilitar el que el usuario meta cierto valor
 */
public class MAux {
    
    /**
     * Metodo pensado para que el usuario pueda interactuar con el programa y tambien
     * para controlar alguna excepciones
     * @return Un numero incertado por el usuario
     */
    public static int getNum(){
        int c;
        while(true){
            Scanner sc = new Scanner(System.in);
            try{
                System.out.print("\nElija alguna opcion: ");
                c = sc.nextInt();
                System.out.print("\n");
                break;
            }catch(NumberFormatException e){}
        }
        return c;
    }

    /**
     * Metodo que nos regresa la lista de todos los componentes de tipo propulsión que
     * tenemos en existencia, si se agregan mas componentes simplemente hay que hacer 
     * sDP.add(new nombreDelComponente()) sobre este metodo y listo
     * @return un String con todos los sistemas de Propulsión disponibles hasta el momento.
     */
    public static String getPropulsion(){
        String comp = "Sistemas de Propulsion disponibles: \n";
        LinkedList<ComponenteNave> sDP = new LinkedList<ComponenteNave>();
        sDP.add(new IntercontinentalPD());
        sDP.add(new InterplanetarioPD());
        sDP.add(new IntergalacticoPD());
        comp += recorrerLista(sDP);
        return comp;
    }

    /**
     * Metodo que nos regresa la lista de todos los componentes de tipo Blindaje
     * tenemos en existencia, si se agregan mas componentes simplemente hay que hacer 
     * sDP.add(new nombreDelComponente()) sobre este metodo y listo.
     * @return un String con todos los Blindajes disponibles hasta el momento.
     */
    public static String getBlindajes(){
        String comp = "Blindajes Disponibles: \n";
        LinkedList<ComponenteNave> sDP = new LinkedList<ComponenteNave>();        
        sDP.add(new SimplePD());
        sDP.add(new ReforzadoPD());
        sDP.add(new FortalezaPD());
        comp += recorrerLista(sDP);
        return comp;
    }

    /**
     * Metodo que nos regresa la lista de todos los componentes de tipo Cabina que
     * tenemos en existencia, si se agregan mas componentes simplemente hay que hacer 
     * sDP.add(new nombreDelComponente()) sobre este metodo y listo.
     * @return un String con todas las cabinas disponibles hasta el momento.
     */
    public static String getCabinas(){
        String comp = "Cabinas Disponibles: \n";
        LinkedList<ComponenteNave> sDP = new LinkedList<ComponenteNave>();        
        sDP.add(new PilotoPD());
        sDP.add(new TripulacionPequeñaPD());
        sDP.add(new EjercitoPD());
        comp += recorrerLista(sDP);
        return comp;
    }

    /**
     * Metodo que nos regresa la lista de todos los componentes de tipo Armas que
     * tenemos en existencia, si se agregan mas componentes simplemente hay que hacer 
     * sDP.add(new nombreDelComponente()) sobre este metodo y listo.
     * @return un String con todas las armas disponibles hasta el momento.
     */
    public static String getArmas(){
        String comp = "Armas Disponibles: \n";
        LinkedList<ComponenteNave> sDP = new LinkedList<ComponenteNave>();        
        sDP.add(new LaserSimplePD());
        sDP.add(new MisilesPlasmaPD());
        sDP.add(new LaserDestructorPD());
        comp += recorrerLista(sDP);
        return comp;
    }

    /**
     * Metodo auxiliar para poner en formato todas las listas de componentes de
     * distintos tipos que podemos llegar a tener.
     * @param ll La lista con los componentes de Nave que queremos poner en un formato
     * @return Un string en lista numerada de todos los componentes que hay dentro de ll
     */
    private static String recorrerLista(LinkedList<ComponenteNave> ll){
        String s = "";
        int i = 1;
        for(ComponenteNave c: ll){
            s += i + ". " + c.nombre() + "\n";
            i++;
        }
        return s;
    }
}
