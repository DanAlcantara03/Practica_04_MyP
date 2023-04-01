package nave_espacial.naves;

import nave_espacial.NaveEspacial;
import nave_espacial.componentes.armas.armas_misiles_plasma.MisilesPlasmaPD;
import nave_espacial.componentes.blindaje.blindaje_reforzado.ReforzadoPD;
import nave_espacial.componentes.cabina.cabina_upiloto.PilotoPD;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intercontinental.IntercontinentalPD;

/**
 * Clase concreta que nos modela una NaveEspacial individual, la cual va a tener
 * los componenetes Viaje Intercontinental PD, Blindaje reforzado PD, Cabina para 
 * 1 Piloto PD, y de Armas Misiles de Plasma.
 */
public class NaveIndividual extends NaveEspacial{
    
    /* Construnctor por defecto de una Nave individual */
    public NaveIndividual(){
        agregarSistemaDePropulsion();
        agregarBlindaje();
        agregarCabina();
        agregarArmas();
    }

    /**
     * Metodo que nos da el nombre de la nave espacial
     * @return el nombre de la nave espacial.
     */
    @Override public String getNombre(){
        return "Nave Individual de combate";
    }

    /**
     * Metodo que nos ayuda a que la nave Individual tenga un sistema de propulsion
     * intercontinetal por defecto.
     * @return la nave con el sistema de Propulsion intercontinental
     */
    @Override public NaveEspacial agregarSistemaDePropulsion(){
        if(sistemaDePropulsion == null){
            sistemaDePropulsion = new IntercontinentalPD();
            naveComponenetes.add(sistemaDePropulsion);
        }else{
            System.out.println("La nave espacial ya tiene un Sistema de Propulsion");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a que la nave Individual tenga un blindaje reforzado
     * por defecto.
     * @return la nave con el Blindaje reforzado.
     */
    @Override public NaveEspacial agregarBlindaje(){
        if(blindaje == null){
            blindaje = new ReforzadoPD();
            naveComponenetes.add(blindaje);
        }else{
            System.out.println("La nave espacial ya tiene un Blindaje ");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a que la nave individual tenga una cabina de 1 piloto por
     * defecto
     * @return la nave con la cabina de 1 piloto
     */
    @Override public NaveEspacial agregarCabina(){
        if(cabina == null){
            cabina = new PilotoPD();
            naveComponenetes.add(cabina);
        }else{
            System.out.println("La nave espacial ya tiene una Cabina.");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a que la nave individual tenga una cabina de 1 piloto por
     * defecto
     * @return la nave con la cabina de 1 piloto
     */
    @Override public NaveEspacial agregarArmas(){
        if(armas == null){
            armas = new MisilesPlasmaPD();
            naveComponenetes.add(cabina);
        }else{
            System.out.println("La nave espacial ya tiene Armas.");
        }
        return this;
    }
}
