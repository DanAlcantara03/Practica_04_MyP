package nave_espacial;

import java.util.LinkedList;
import nave_espacial.componentes.ComponenteNave;
import nave_espacial.componentes.armas.Armas;
import nave_espacial.componentes.blindaje.Blindaje;
import nave_espacial.componentes.cabina.Cabina;
import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;

/**
 * Clase que nos ayuda a tener una nave espacial en común
 */
public abstract class NaveEspacial{
    /* Una lista con todos los componenetes que va a tener la nave espacial */
    protected LinkedList<ComponenteNave> naveComponenetes;
    /* Es el sistema de propulsión de la nave */
    protected SistemaDePropulsion sistemaDePropulsion;
    /* Es el blindaje que va a tener la nave */
    protected Blindaje blindaje;
    /* Es la cabina que va a tener la nave */
    protected Cabina cabina;
    /* Son las armas que va a tener la nave */
    protected Armas armas;

    /* Constructor vacio */
    public NaveEspacial(){}

    /**
     * Metodo que nos ayuda a saber el nombre de la nave espacial en concreto que
     * extiende a esta clase abstracta
     * @return El nombre de la nave.
     */
    public abstract String getNombre();

    /**
     * Metodo que nos ayuda a saber el costo total de la nave en base a todos los
     * componentes que esta tiene, si y solo si ya tiene todos los componentes
     * asignados.
     * @return 0 si aun no estan todos los componentes, el precio total si todos los 
     * componentes han sido asignados.
     */
    public double getCosto(){
        double cTotal = 0;
        if(naveTerminada()){
            for(ComponenteNave cN: naveComponenetes){
                cTotal += cN.precio();
            }
        }
        return cTotal;
    }

    /**
     * Metodo que nos muestra como es la nave y todos sus componentes.
     * @return Un string con todas las caracteristicas de la nave si es que ya elegimos
     * todos los componentes, en caso contrario regresa "".
     */
    public String muestraNave(){
        String nave = "";
        if(naveTerminada()){
            nave += "Nave Espacial " + getNombre() + "\n";
            nave += " Componentes: \n";
            for(ComponenteNave i: naveComponenetes){
                nave += "   " + i.nombre() + "\n";
            }
            nave += " Ataque: " + getAtaque() + "\n";
            nave += " Defensa: " + getDefensa() + "\n";
            nave += " Velocidad: " + getVelocidad() + "\n";
            nave += " Peso: " + getPeso() + "\n";
            nave += " Precio: " + getCosto() + "\n";
        }
        return nave;
    }

    /**
     * Metodo abstracto que nos ayuda a agregar el sistema de Propulsion a la nave
     * @return La nave con el sistema de propulsión ya agregado.
     */
    public abstract NaveEspacial agregarSistemaDePropulsion();

    /**
     * Metodo abstracto que nos ayuda a agregar el Blindaje a la nave
     * @return La nave con el Blindaje ya agregado.
     */
    public abstract NaveEspacial agregarBlindaje();

    /** Metodo abstracto que nos ayuda a agregar la cabina a la nave
     * @return La nave con la cabina ya agregada.
     */
    public abstract NaveEspacial agregarCabina();

    /** Metodo abstracto que nos ayuda a agregar las armas a la nave
     * @return  La nave con las armas ya agregadas.
     */
    public abstract NaveEspacial agregarArmas();

    /**
     * Metodo que nos ayuda a saber de cuanto es el ataque total de la nave
     * @return 0 si la nave no esta terminada, el ataque total de la nave en otro caso.
     */
    public int getAtaque(){
        int ataque = 0;
        if(naveTerminada()){
            for(ComponenteNave cN: naveComponenetes){
                ataque += cN.ataque();
            }
        }
        return ataque;
    }

    /**
     * Metodo que nos ayuda a saber de cuanto es la defensa total de la nave
     * @return 0 si la nave no esta terminada, la defensa total de la nave en otro caso.
     */
    public int getDefensa(){
        int defensa = 0;
        if(naveTerminada()){
            for(ComponenteNave cN: naveComponenetes){
                defensa += cN.defensa();
            }
        }
        return defensa;
    }

    /**
     * Metodo que nos ayuda a saber cual es la velocidad de la nave espacial.
     * @return 0 si la nave no esta terminada, la velocidad total de la nave en otro caso.
     */
    public int getVelocidad(){
        int velocidad = 0;
        if(naveTerminada()){
            for(ComponenteNave cN: naveComponenetes){
                velocidad += cN.velocidad();
            }
        }
        return velocidad;
    }

    /**
     * Metodo que nos ayuda a saber cual es el peso total de la nave espacial.
     * @return 0 si la nave no esta terminada, el peso total de la nave en otro caso.
     */
    public double getPeso(){
        double peso = 0;
        if(naveTerminada()){
            for(ComponenteNave cN: naveComponenetes){
                peso += cN.peso();
            }
        }
        return peso;
    }
    
    /**
     * Metodo auxiliar que nos ayuda a saber que la nave este terminada de armar
     * y tenga todos sus componentes.
     * @return true si la nave tiene todos sus componentes, false en otro caso.
     */
    public boolean naveTerminada(){
        boolean t = sistemaDePropulsion != null && blindaje != null &&
        cabina != null && armas != null;
        if(!t)
            System.out.println(naveSinTerminar());
        return t;
    }

    /**
     * Metodo auxiliar que nos ayuda a saber que componentes faltan para terminar de
     * armar la nave.
     * @return Un String con los componenetes que faltan para terminar la nave.
     */
    private String naveSinTerminar(){
        String msj = "\nFaltan por elegir los componentes: \n";
        if(sistemaDePropulsion == null)
            msj += "   Sistema de Propulsión\n";
        if(blindaje == null)
            msj += "   Blindaje\n";
        if(cabina == null)
            msj += "   Cabina\n";
        if(armas == null)
            msj += "   Armas\n";
        return msj;
    }
}