package nave_espacial.componentes.blindaje.blindaje_reforzado;

import nave_espacial.componentes.blindaje.*;

/**
 * Clase abstracta para encapsular los blindajes reforzados que puedan llegar a
 * existir
 */
public abstract class BReforzado extends Blindaje{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es un blindaje
     * de tipo reforzado..
     * @return textualmente "Reforzado"
     */
    public String subTipo(){
        return "Reforzado";
    }
}
