package nave_espacial.naves;

import nave_espacial.componentes.armas.Armas;
import nave_espacial.componentes.armas.armas_laser_simple.LaserSimplePD;
import nave_espacial.componentes.blindaje.Blindaje;
import nave_espacial.componentes.blindaje.blindaje_simple.SimplePD;
import nave_espacial.componentes.cabina.Cabina;

import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;
import nave_espacial.componentes.sistema_de_propulsion.sdp_interplanetario.InterplanetarioPD;


/**
 * Clase concreta que nos modela una NaveEspacial militar de transporte, la cual va 
 * a tener los componenetes Viaje Interplanetario PD, Blindaje Simple, Cabina para 
 * Ejercito PD y Laser Simple PD
 */
public class NaveMilitar extends NaveConcreta{
    
    /* Constructor por defecto de una Nave individual */
    public NaveMilitar(){
        super();
    }

    /**
     * Metodo que nos da el nombre de la nave espacial
     * @return el nombre de la nave espacial.
     */
    @Override public String getNombre(){
        return "Nave Militar de Transporte";
    }

    /**
     * @return un sistema de Propulsión interplanetario PD.
     */
    @Override protected SistemaDePropulsion sDPC(){
        return new InterplanetarioPD();
    }

    /**
     * @return un blindaje Simple PD.
     */
    @Override protected Blindaje blindajeC(){
        return new SimplePD();
    }
    
    /**
     * @return una cabina para un ejercito PD.
     */
    @Override protected Cabina cabinaC(){
        return null;
    }

    /**
     * @return Un laser Simple
     */
    @Override protected Armas armasC(){
        return new LaserSimplePD();
    }
}
