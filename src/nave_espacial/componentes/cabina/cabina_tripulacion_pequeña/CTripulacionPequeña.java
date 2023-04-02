package nave_espacial.componentes.cabina.cabina_tripulacion_pequeña;

import nave_espacial.componentes.cabina.Cabina;

/**
 * Clase abstracta para encapsular las cabinas para una tripulacion pequeña que pueden llegar
 * a existir
 */
public abstract class CTripulacionPequeña extends Cabina{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es una cabina que
     * puede llevar a una tripulacion pequeña.
     * @return textualmente "Tripulacion pequeña"
     */
    public String subTipo(){
        return "Tripulacion pequeña";
    }
}
