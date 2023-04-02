import java.util.LinkedList;
import java.util.Scanner;

import nave_espacial.NaveEspacial;
import nave_espacial.naves.BaseEspacialDeGuerra;
import nave_espacial.naves.ConstruirNave;
import nave_espacial.naves.MAux;
import nave_espacial.naves.NaveConcreta;
import nave_espacial.naves.NaveIndividual;
import nave_espacial.naves.NaveMilitar;

public class ArmarNaveEspacial {
    /* El scanner que vamos a usar */
    private Scanner sc = new Scanner(System.in);
    /* Es el presupuesto inicial del usuario */
    private double presupuesto;
    /* Es la nave espacial que le venderemos al usuario */
    private NaveEspacial naveEspacial;
    
    /**
     * Constructor por defecto.
     */
    public ArmarNaveEspacial(){
        naveEspacial = new ConstruirNave();
    }

    /**
     * Metodo que nos ayuda a poner un presupuesto inicial para asi compararlo con el precio
     * final de la nave.
     */
    public void setPresupuesto(){
        while(true){
            System.out.print("\nPor favor diganos cuál es su presupuesto: ");
            try{
                presupuesto = sc.nextDouble();
                break;
            }catch(NumberFormatException e){}
        }
    }
    
    /**
     * Metodo getter del presupuesto
     * @return El presupuesto.
     */
    public double getPresupuesto(){
        return presupuesto;
    }

    /**
     * Metodo getter de la nave Espacial
     * @return la nave espacial.
     */
    public NaveEspacial getNaveEspacial(){
        return naveEspacial;
    }

    /**
     * Metodo que nos ayuda a armar la nave poco a poco
     */
    public void armarNave(){
        int n ;
        while(!naveEspacial.naveTerminada()){
            System.out.println("Elije con que componentes deseas armar tu nave:\n ");
            System.out.println(componentes());
            n = MAux.getNum();
            switch(n){
            case 1:
                naveEspacial.agregarSistemaDePropulsion();
            break;
            case 2:
                naveEspacial.agregarBlindaje();
            break;
            case 3:
                naveEspacial.agregarCabina();
            break;
            case 4:
                naveEspacial.agregarArmas();
            break;
            case 0:
            if(!naveEspacial.naveTerminada()){
                System.out.println("La nave aun no esta terminada.\n");
            }
            break;
            default:
                System.out.println("Inserte una opción valida.\n");
                n = MAux.getNum();
            }
        }
    }
    
    /**
     * Metodo auxiliar para poder elegir si es que el precio de la nave excede
     * el presupuesto del cliente.
     */
    public void elegirPresupuesto(){
        int n;
        System.out.println("Lo sentimos el precio de la nave excede tu presupuesto:" 
        + "\n1.- ¿Desea Diseñar otra nave?"
        + "\n2.- Ver nuestro catalogo");
        while(true){
            n = MAux.getNum();
            System.out.println("");
            switch(n){ 
                case 1:
                naveEspacial = new ConstruirNave();
                armarNave();
                break;
                case 2:
                System.out.println(catalogo());
                elegirNave();
                break;
                default:
                System.out.print("Por favor inserte una opcion valida: ");
            }
        }
    }

    /**
     * Metodo auxiliar para saber cuales son los componentes disponibles para crear la nave
     * @return
     */
    private String componentes(){
        String comp = "";
        comp += "1.- Sistemas de propulsión\n";
        comp += "2.- Blindajes\n";
        comp += "3.- Cabinas\n";
        comp += "4.- Armas\n";
        comp += "0.- Terminar Nave";
        return comp;
    }

    /**
     * Metodo auxiliar que nos regresa el catalogo de todas las naves por defecto que tenemos
     * @return un String con todas las naves por defecto que tenemos y sus descripciones.
     */
    private String catalogo(){
        String catalog = "\nCatalogo por defecto: \n";
        LinkedList<NaveConcreta> nC = new LinkedList<>();
        nC.add(new NaveIndividual());
        nC.add(new NaveMilitar());
        nC.add(new BaseEspacialDeGuerra());
        for(NaveConcreta n: nC){
            catalog += n.muestraNave() + "\n\n";
        }
        return catalog;
    }

    /**
     * Metodo auxiliar que nos ayuda a elegir una de las naves por default que creamos.
     */
    private void elegirNave(){
        int n = MAux.getNum();;
        while(true)
            switch(n){
                case 1:
                naveEspacial = new NaveIndividual();
                break;
                case 2:
                naveEspacial = new NaveMilitar();
                break;
                case 3:
                naveEspacial = new BaseEspacialDeGuerra();
                break;
                default:
                System.out.println("Por favor inserte una opcion valida: ");
                n = MAux.getNum();
            }
    }
}
