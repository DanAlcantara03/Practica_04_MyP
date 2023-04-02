package nave_espacial.componentes.cabina.cabina_ejercito;

import nave_espacial.componentes.cabina.Cabina;

/**
 * Clase abstracta para encapsular las cabinas para un ejercito que pueden llegar
 * a existir
 */
public abstract class CEjercito extends Cabina{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es una cabina que
     * puede llevar a un ejercito.
     * @return textualmente "Ejercito"
     */
    public String subTipo(){
        return "Ejercito";
    }
}
