package nave_espacial.componentes.armas.armas_misiles_plasma;

import nave_espacial.componentes.armas.*;

/**
 * Clase abstracta para encapsular las armas misiles de plasma que puedan llegar a
 * existir
 */
public abstract class AMisilesPlasma extends Armas{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es un arma de tipo
     * misiles de plasma
     * @return textualmente "Misiles de Plasma"
     */
    public String subTipo(){
        return "Misiles de Plasma";
    }
}
