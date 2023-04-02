package nave_espacial.naves;

import nave_espacial.componentes.armas.Armas;
import nave_espacial.componentes.armas.armas_laser_destructor_de_planetas.LaserDestructorPD;
import nave_espacial.componentes.blindaje.Blindaje;
import nave_espacial.componentes.blindaje.blindaje_fortaleza.FortalezaPD;
import nave_espacial.componentes.cabina.Cabina;
import nave_espacial.componentes.cabina.cabina_ejercito.EjercitoPD;
import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intergalactico.IntergalacticoPD;


/**
 * Clase concreta que nos modela una Base espacial de guerra, la cual va 
 * a tener los componenetes Viaje Intergalácitco, Blindaje Fortaleza,
 * Ejército, Láser destructor de planetas
 */
public class BaseEspacialDeGuerra extends NaveConcreta{
    
    /* Constructor por defecto de una Base Espacial de querra */
    public BaseEspacialDeGuerra(){
        super();
    }

    /**
     * Metodo que nos da el nombre de la nave espacial
     * @return el nombre de la nave espacial.
     */
    @Override public String getNombre(){
        return "Base espacial de Guerra";
    }

    /**
     * @return un sistema de Propulsión Intergalactico PD.
     */
    @Override protected SistemaDePropulsion sDPC(){
        return new IntergalacticoPD();
    }

    /**
     * @return un blindaje de Fortaleza PD.
     */
    @Override protected Blindaje blindajeC(){
        return new FortalezaPD();
    }
    
    /**
     * @return una cabina para un ejercito PD.
     */
    @Override protected Cabina cabinaC(){
        return new EjercitoPD();
    }

    /**
     * @return Un laser Destructor de planetas PD
     */
    @Override protected Armas armasC(){
        return new LaserDestructorPD();
    }
}
