package nave_espacial.componentes.blindaje;

import nave_espacial.componentes.ComponenteNave;
/**
 * Clase abstracta para encapsular los Blindajes que pueden llegar a existir
 */
public abstract class Blindaje implements ComponenteNave{

    /**
     * Metodo que nos ayuda a saber que este componente es una blindaje
     * @return textualmente "Blindaje"
     */
    @Override public String tipo(){
        return "Blindaje";
    }

    /**
     * Metodo abstracto que nos ayuda a saber el subtipo de Cabina que es 
     * (Simple, Reforzado, Fortaleza).
     * @return El tipo de Blindaje que modela la clase que implementa a esta clase.
     */
    public abstract String subTipo();
}