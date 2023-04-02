package nave_espacial.componentes.blindaje.blindaje_fortaleza;

import nave_espacial.componentes.blindaje.*;

/**
 * Clase abstracta para encapsular los blindajes fortaleza que puedan llegar a
 * existir
 */
public abstract class BFortaleza extends Blindaje{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es un blindaje
     * de tipo fortaleza..
     * @return textualmente "Fortaleza"
     */
    public String subTipo(){
        return "Reforzado";
    }
}