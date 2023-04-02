package nave_espacial.componentes.armas.armas_laser_destructor_de_planetas;

/**
 * Clase especifica que nos modela un blindaje reforzado por defecto, aqui ya 
 * implementaremos todos los metodos de la interfaz ComponenteNave
 */
public class LaserDestructorPD extends ALaserDestructor{
    
    /* Constructor vacio. */
    public LaserDestructorPD(){}

    /**
     * Metodo que nos ayuda a saber el nombre del componente 
     * @return El nombre del componente de la nave
     */
    @Override public String nombre(){
        return tipo() + " " + subTipo() + " " + "Por Defecto";
    }

    /**
     * Metodo que nos ayuda a saber la descripción del componente de la nave
     * @return La descripción del componente de la nave
     */
    @Override public String descripcion(){
        return "Derrota a un ejercito o a un planeta en cuestion de segundos con un disparo";
    }

    /**
     * Metodo que nos ayuda a saber el precio del componente de la nave
     * @return El precio del componente de la nave
     */
    @Override public double precio(){
        return 50000;
    }

    /**
     * Metodo que nos ayuda a saber cuanto ataque modifica el componente de la nave
     * @return Un aumento o disminución del ataque de la nave
     */
    @Override public int ataque(){
        return 90;
    }

    /**
     * Metodo que nos ayuda a saber cuanta defensa modifica el componente de la nave
     * @return Un aumento o disminución de la defensa de la nave
     */
    @Override public int defensa(){
        return 85;
    }

    /**
     * Metodo que nos ayuda a saber cuanta velocidad modifica el componente de la nave
     * @return Un aumento o disminución de la velocidad de la nave
     */
    @Override public int velocidad(){
        return -5000;
    }

    /**
     * Metodo que nos ayuda a saber cuanto peso modifica el componente de la nave
     * @return Un aumento o disminución del peso que va a tener la nave al terminar
     * de armarla
     */
    @Override public double peso(){
        return 5600;
    }
}
