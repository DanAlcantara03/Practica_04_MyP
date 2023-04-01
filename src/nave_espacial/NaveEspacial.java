package nave_espacial;

import java.util.LinkedList;

import javax.print.attribute.standard.MediaSize.NA;

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
    private LinkedList<ComponenteNave> naveComponenetes;
    /* Es el sistema de propulsión de la nave */
    private SistemaDePropulsion sistemaDePropulsion;
    /* Es el blindaje que va a tener la nave */
    private Blindaje blindaje;
    /* Es la cabina que va a tener la nave */
    private Cabina cabina;
    /* Son las armas que va a tener la nave */
    private Armas armas;

    /* Constructor vacio */
    public NaveEspacial(){}

    /**
     * Metodo que nos ayuda a saber el nombre de la nave espacial en concreto que
     * extiende a esta clase abstracta
     * @return El nombre de la nave.
     */
    public abstract String getNombre();

    /**
     * Metodo auxiliar que nos ayuda a saber que la nave este terminada de armar
     * y tenga todos sus componentes.
     * @return true si la nave tiene todos sus componentes, false en otro caso.
     */
    protected boolean naveTerminada(){
        boolean t = sistemaDePropulsion != null && blindaje != null &&
        cabina != null && armas != null;
        if(t)
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