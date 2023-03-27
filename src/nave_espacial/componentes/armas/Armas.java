package nave_espacial.componentes.armas;

import nave_espacial.componentes.ComponenteNave;
/**
 * Clase abstracta para encapsular las Armas que pueden llegar a existir
 */
public abstract class Armas implements ComponenteNave{

    /**
     * Metodo que nos ayuda a saber que este componente es una arma
     * @return textualmente "Armas"
     */
    @Override public String tipo(){
        return "Armas";
    }
}