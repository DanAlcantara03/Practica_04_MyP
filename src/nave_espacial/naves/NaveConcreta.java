package nave_espacial.naves;

import nave_espacial.NaveEspacial;
import nave_espacial.componentes.armas.Armas;
import nave_espacial.componentes.blindaje.Blindaje;
import nave_espacial.componentes.cabina.Cabina;
import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;

/**
 * Clase abstracta que nos modela la estructura de una Nave Espacial fija que tiene
 * componentes especificos agregados por nosotros, creamos esta clase para no repetir
 * tanto codigo y que nos sea mas facil hacer las 3 naves fijas que se nos pide tener.
 */
public abstract class NaveConcreta extends NaveEspacial{
    
    /* Construnctor por defecto de una Nave individual */
    public NaveConcreta(){
        agregarSistemaDePropulsion();
        agregarBlindaje();
        agregarCabina();
        agregarArmas();
    }

    /**
     * Metodo que nos ayuda a que la nave obtenga un Sistema de Propulsión concreto
     * @return la nave con el sistema de Propulsion concreto
     */
    @Override public NaveEspacial agregarSistemaDePropulsion(){
        if(sistemaDePropulsion == null){
            sistemaDePropulsion = sDPC();
            naveComponenetes.add(sistemaDePropulsion);
        }else{
            System.out.println("La nave espacial ya tiene un Sistema de Propulsion");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a que una nave concreta tenga un blindaje concerto.
     * @return la nave con el Blindaje concreto.
     */
    @Override public NaveEspacial agregarBlindaje(){
        if(blindaje == null){
            blindaje = blindajeC();
            naveComponenetes.add(blindaje);
        }else{
            System.out.println("La nave espacial ya tiene un Blindaje ");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a que la nave concreta tenga una cabina concreta
     * @return la nave con la cabina concreta
     */
    @Override public NaveEspacial agregarCabina(){
        if(cabina == null){
            cabina = cabinaC();
            naveComponenetes.add(cabina);
        }else{
            System.out.println("La nave espacial ya tiene una Cabina.");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a que la nave concreta tenga armas concretas
     * @return La nave con las armas concretas.
     */
    @Override public NaveEspacial agregarArmas(){
        if(armas == null){
            armas = armasC();
            naveComponenetes.add(armas);
        }else{
            System.out.println("La nave espacial ya tiene Armas.");
        }
        return this;
    }

    /**
     * Metodo que nos ayuda a agregar de una manera sencilla un sistema de propulsión
     * concreto para asi agregarlo a los componentes de la nave espacial
     * @return El sistema de propulsión concreto que queremos tener.
     */
    protected abstract SistemaDePropulsion sDPC();

    /**
     * Metodo que nos ayuda a agregar de una manera sencilla un blindaje
     * concreto para asi agregarlo a los componentes de la nave espacial
     * @return El blindaje concreto que queremos tener.
     */
    protected abstract Blindaje blindajeC();

    /**
     * Metodo que nos ayuda a agregar de una manera sencilla una cabina
     * concreta, para asi agregarla a los componentes de la nave espacial
     * @return La cabina en concreto que queremos tener.
     */
    protected abstract Cabina cabinaC();

    /**
     * Metodo que nos ayuda a agregar de una manera sencilla armas en
     * concreto para asi agregarlas a los componentes de la nave espacial
     * @return La(s) arma(s) en concreto que queremos tener.
     */
    protected abstract Armas armasC();

}
