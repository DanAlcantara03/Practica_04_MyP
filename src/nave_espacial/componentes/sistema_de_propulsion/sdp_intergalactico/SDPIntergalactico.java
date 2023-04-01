package nave_espacial.componentes.sistema_de_propulsion.sdp_intergalactico;

import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;

/**
 * Clase abstracta para encapsular los sitemas de propulsion Intergalacticos que
 * pueden llegar a existir
 */
public abstract class SDPIntergalactico extends SistemaDePropulsion{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente puede hacer viajes
     * intergalacticos.
     * @return textualmente "Viaje Intergalactico"
     */
    public String subTipo(){
        return "Viaje Intergalactico";
    }
}
