package nave_espacial.componentes.sistema_de_propulsion;

import nave_espacial.componentes.ComponenteNave;
/**
 * Clase abstracta para encapsular los sitemas de propulsion en general que pueden
 * llegar a existir
 */
public abstract class SistemaDePropulsion implements ComponenteNave{

    /**
     * Metodo que nos ayuda a saber que este componenete es un sistema de propulsión
     * @return textualmente "Sistema de Propulsion"
     */
    @Override public String tipo(){
        return "Sistema de Propulsion";
    }

    /**
     * Metodo abstracto que nos ayuda a saber el subtipo de Sistema de Propulsión que
     * es (Viaje Intercontinental, Viaje Planetario, Viaje Intergaláctico).
     * @return El tipo de Viaje que puede hacer el sistema de Propulsión que implemente
     * esta clase
     */
    public abstract String subTipo();
}