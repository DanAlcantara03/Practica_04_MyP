package nave_espacial.componentes.cabina.cabina_upiloto;

import nave_espacial.componentes.cabina.Cabina;

/**
 * Clase abstracta para encapsular las cabinas con un solo piloto que pueden llegar
 * a existir
 */
public abstract class CPiloto extends Cabina{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es una cabina que
     * puede conducir unicamente un solo piloto.
     * @return textualmente "Un Piloto"
     */
    public String subTipo(){
        return "Un Piloto";
    }
}
