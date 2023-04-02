package nave_espacial.naves;

import nave_espacial.componentes.armas.Armas;
import nave_espacial.componentes.armas.armas_misiles_plasma.MisilesPlasmaPD;
import nave_espacial.componentes.blindaje.Blindaje;
import nave_espacial.componentes.blindaje.blindaje_reforzado.ReforzadoPD;
import nave_espacial.componentes.cabina.Cabina;
import nave_espacial.componentes.cabina.cabina_upiloto.PilotoPD;
import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intercontinental.IntercontinentalPD;

/**
 * Clase concreta que nos modela una NaveEspacial individual, la cual va a tener
 * los componenetes Viaje Intercontinental PD, Blindaje reforzado PD, Cabina para 
 * 1 Piloto PD, y de Armas Misiles de Plasma.
 */
public class NaveIndividual extends NaveConcreta{
    
    /* Constructor por defecto de una Nave individual */
    public NaveIndividual(){
        super();
    }

    /**
     * Metodo que nos da el nombre de la nave espacial
     * @return el nombre de la nave espacial.
     */
    @Override public String getNombre(){
        return "Nave Individual de combate";
    }

    /**
     * @return un sistema de Propulsión intercontinental PD.
     */
    @Override protected SistemaDePropulsion sDPC(){
        return new IntercontinentalPD();
    }

    /**
     * @return un blindaje Reforzado PD.
     */
    @Override protected Blindaje blindajeC(){
        return new ReforzadoPD();
    }
    
    /**
     * @return una cabina con 1 piloto PD.
     */
    @Override protected Cabina cabinaC(){
        return new PilotoPD();
    }

    /**
     * @return Unos misiles de Plasma PD.
     */
    @Override protected Armas armasC(){
        return new MisilesPlasmaPD();
    }
}
