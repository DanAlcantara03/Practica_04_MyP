package nave_espacial.naves;

import nave_espacial.NaveEspacial;
import nave_espacial.componentes.armas.armas_misiles_plasma.MisilesPlasmaPD;
import nave_espacial.componentes.blindaje.blindaje_reforzado.ReforzadoPD;
import nave_espacial.componentes.cabina.cabina_upiloto.PilotoPD;
import nave_espacial.componentes.sistema_de_propulsion.SistemaDePropulsion;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intercontinental.IntercontinentalPD;
import nave_espacial.componentes.sistema_de_propulsion.sdp_intergalactico.IntergalacticoPD;
import nave_espacial.componentes.sistema_de_propulsion.sdp_interplanetario.InterplanetarioPD;

public class ConstruirNave extends NaveEspacial{
    /* Un string para que el usuario pueda ponerle el nombre que quiera a su nave
    o simplemente quedarse con el nombre por defecto "Nave Armada" */
    private String nombre = "Nave Armada";

    /* Constructor vacio. */
    public ConstruirNave(){}

    /**
     * Metodo que nos ayuda a saber el nombre de la nave.
     * @return el nombre de la nave
     */
    @Override public String getNombre() {
        return nombre;
    }

    /**
     * Metodo para asignarle un nombre a la nave
     * @param nombre El nombre que se le quiere asignar a la nave.
     */
    public void setNombre(String nombre) {
        if(nombre != null && nombre != "")
            this.nombre = nombre;
    }

    /**
     * Metodo que nos ayuda a agregar un sistema de propulsión a la nave espacial si
     * es que no lo tiene ya.
     */
    @Override public NaveEspacial agregarSistemaDePropulsion(){
        if( sistemaDePropulsion != null)
            System.out.println("Ya ah elegido un sistema de propulsión para esta nave.");
        else
            elegirSDP();
        return this;
    }

    /**
     * Metodo que nos ayuda a agregar un sistema de propulsión a la nave espacial si
     * es que no lo tiene ya.
     */
    @Override public NaveEspacial agregarBlindaje(){
        if( blindaje != null)
            System.out.println("Ya ah elegido un Blindaje para esta nave.");
        else
            elegirB();
        return this;
    }

    /**
     * Metodo que nos ayuda a agregar un sistema de propulsión a la nave espacial si
     * es que no lo tiene ya.
     */
    @Override public NaveEspacial agregarCabina(){
        if( cabina != null)
            System.out.println("Ya ah elegido una cabina para esta nave.");
        else
            elegirC();
        return this;
    }

    @Override public NaveEspacial agregarArmas(){
        if( armas != null)
            System.out.println("Ya ah elegido armas para esta nave.");
        else
            elegirA();
        return this;
    }

    /**
     * Metodo auxiliar para elegir uno de los sistemas de propulsión disponibles.
     */
    private void elegirSDP(){
        while(true){
            System.out.println(MAux.getPropulsion() + "\n");
            int n = MAux.getNum();
            switch(n){
                case 1:
                    sistemaDePropulsion = new IntercontinentalPD();
                break;
                case 2:
                    sistemaDePropulsion = new InterplanetarioPD();                
                break;                
                case 3:
                    sistemaDePropulsion = new IntergalacticoPD();
                break;
                default: 
                    System.out.println("Esa no es una opción valida intentelo de nuevo\n");
            }
        }
    }

    /**
     * Metodo auxiliar para elegir uno de los blindajes disponibles.
     */
    private void elegirB(){
        while(true){
            System.out.println(MAux.getBlindajes() + "\n");
            int n = MAux.getNum();
            switch(n){
                case 1:
                    //blindaje = new;
                break;
                case 2:
                    blindaje = new ReforzadoPD();
                break;                
                case 3:
                    //blindaje = new;
                break;
                default: 
                    System.out.println("Esa no es una opción valida intentelo de nuevo\n");
            }
        }
    }

    /**
     * Metodo auxiliar para elegir una de las cabinas disponibles.
     */
    private void elegirC(){
        while(true){
            System.out.println(MAux.getCabinas() + "\n");
            int n = MAux.getNum();
            switch(n){
                case 1:
                    cabina = new PilotoPD();
                break;
                case 2:
                    //cabina = new;
                break;                
                case 3:
                    //cabina = new;
                break;
                default: 
                    System.out.println("Esa no es una opción valida intentelo de nuevo\n");
            }
        }
    }

    /**
     * Metodo auxiliar para elegir una de las armas disponibles.
     */
    private void elegirA(){
        while(true){
            System.out.println(MAux.getArmas() + "\n");
            int n = MAux.getNum();
            switch(n){
                case 1:
                    // armas = new;
                break;
                case 2:
                    armas = new MisilesPlasmaPD();
                break;                
                case 3:
                    //armas = new;
                break;
                default: 
                    System.out.println("Esa no es una opción valida intentelo de nuevo\n");
            }
        }
    }
}
