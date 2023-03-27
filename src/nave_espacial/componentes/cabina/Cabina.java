package nave_espacial.componentes.cabina;

import nave_espacial.componentes.ComponenteNave;
/**
 * Clase abstracta para encapsular las cabinas que pueden llegar a existir
 */
public abstract class Cabina implements ComponenteNave{

    /**
     * Metodo que nos ayuda a saber que este componente es una cabina
     * @return textualmente "Cabina"
     */
    @Override public String tipo(){
        return "Cabina";
    }
}