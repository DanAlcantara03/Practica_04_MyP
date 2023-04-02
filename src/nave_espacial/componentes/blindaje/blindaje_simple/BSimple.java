package nave_espacial.componentes.blindaje.blindaje_simple;

import nave_espacial.componentes.blindaje.*;

/**
 * Clase abstracta para encapsular los blindajes simples que puedan llegar a
 * existir
 */
public abstract class BSimple extends Blindaje{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es un blindaje
     * de tipo simple..
     * @return textualmente "Simple"
     */
    public String subTipo(){
        return "Simple";
    }
}
