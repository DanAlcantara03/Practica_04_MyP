package nave_espacial.componentes;

/**
 * Interfaz general que encapusla todo lo que tiene que tener un componente en general
 * de una nave espacial.
 */
public interface ComponenteNave {
    
    /**
     * Metodo que nos ayuda a saber cual es el tipo de componente de la nave 
     * @return El tipo del componente de la nave
     */
    public String tipo();

    /**
     * Metodo que nos ayuda a saber el nombre del componente de la nave
     * @return El nombre del componente de la nave 
     */
    public String nombre();

    /**
     * Metodo que nos ayuda a saber la descripción del componente de la nave
     * @return La descripción del componente de la nave
     */
    public String descripcion();

    /**
     * Metodo que nos ayuda a saber el precio del componente de la nave
     * @return El precio del componente de la nave
     */
    public double precio();

    /**
     * Metodo que nos ayuda a saber cuanto ataque modifica el componente de la nave
     * @return Un aumento o disminución del ataque de la nave
     */
    public int ataque();

    /**
     * Metodo que nos ayuda a saber cuanta defensa modifica el componente de la nave
     * @return Un aumento o disminución de la defensa de la nave
     */
    public int defensa();

    /**
     * Metodo que nos ayuda a saber cuanta velocidad modifica el componente de la nave
     * @return Un aumento o disminución de la velocidad de la nave
     */
    public int velocidad();

    /**
     * Metodo que nos ayuda a saber cuanto peso modifica el componente de la nave
     * @return Un aumento o disminución del peso de la nave
     */
    public double peso();

}
