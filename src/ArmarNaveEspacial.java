import java.util.Scanner;

import nave_espacial.NaveEspacial;
import nave_espacial.naves.ConstruirNave;
import nave_espacial.naves.MAux;

public class ArmarNaveEspacial {
    /* El scanner que vamos a usar */
    private Scanner sc = new Scanner(System.in);
    /* Es el presupuesto inicial del usuario */
    private double presupuesto;
    /* Es la nave espacial que le venderemos al usuario */
    private NaveEspacial naveEspacial = new ConstruirNave();
    

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
    public void armarNave(int n){
        System.out.println("Elije con que componentes deseas armar tu nave:\n ");
        System.out.println(componentes());
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
        default:
            System.out.println("Incerte una opción valida.");
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

}
