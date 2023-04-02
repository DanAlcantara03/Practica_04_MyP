package nave_espacial.componentes.armas.armas_laser_simple;

import nave_espacial.componentes.armas.*;

/**
 * Clase abstracta para encapsular las armas laser simples que puedan llegar a
 * existir
 */
public abstract class ALaserSimple extends Armas{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es un arma de tipo
     * laser simple
     * @return textualmente "Laser simple"
     */
    public String subTipo(){
        return "Laser simple";
    }
}