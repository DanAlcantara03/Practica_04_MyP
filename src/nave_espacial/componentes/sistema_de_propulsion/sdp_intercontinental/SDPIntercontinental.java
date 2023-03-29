package nave_espacial.componentes.sistema_de_propulsion.sdp_intercontinental;

import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;

/**
 * Clase abstracta para encapsular los sitemas de propulsion Intercontinentales que
 * pueden llegar a existir
 */
public abstract class SDPIntercontinental extends SistemaDePropulsion{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente puede hacer viajes
     * intercontinentales.
     * @return textualmente "Viaje Intercontinental"
     */
    public String subTipo(){
        return "Viaje Intercontinental";
    }
}
