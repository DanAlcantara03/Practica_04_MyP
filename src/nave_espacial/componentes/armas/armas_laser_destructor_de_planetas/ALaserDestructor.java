package nave_espacial.componentes.armas.armas_laser_destructor_de_planetas;

import nave_espacial.componentes.armas.*;

/**
 * Clase abstracta para encapsular las armas laser destructoras de planetas que puedan llegar a
 * existir
 */
public abstract class ALaserDestructor extends Armas{
    
    /**
     * Metodo abstracto que nos ayuda a saber que este componente es un arma de tipo
     * laser destructor de planetas
     * @return textualmente "Laser destructor de planetas"
     */
    public String subTipo(){
        return "Laser destructor de planetas";
    }
}
