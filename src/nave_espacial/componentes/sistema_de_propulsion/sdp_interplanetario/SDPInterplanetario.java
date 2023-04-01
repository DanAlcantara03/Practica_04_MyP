package nave_espacial.componentes.sistema_de_propulsion.sdp_interplanetario;

import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;

/**
 * Clase abstracta para encapsular los sitemas de propulsion Interplanetarios que
 * pueden llegar a existir
 */
public abstract class SDPInterplanetario extends SistemaDePropulsion{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente puede hacer viajes
     * interplanetarios.
     * @return textualmente "Viaje Interplanetario"
     */
    public String subTipo(){
        return "Viaje Interplanetario";
    }
}
