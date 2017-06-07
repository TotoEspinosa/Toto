/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp;

/**
 *
 * @author tecnica
 */
public class Tp {

    /**
     * @param args the command line argument
     */
    public static void main(String[] args) {
        uno objetouno = new uno();
        objetouno.numero=10;
        objetouno.cadena="hola";
        System.out.println(objetouno);
        dos objetodos = new dos();
        objetodos.numero2=12;
        objetodos.cadena2="perdon";
        System.out.println(objetodos);
        tres objetotres = new tres();
        objetotres.numero3=14;
        objetotres.cadena3="consulta";
        System.out.println(objetotres);
        cuatro objetocuatro= new cuatro();
        objetocuatro.numero4=16;
        objetocuatro.cadena4="perco";
        System.out.println(objetocuatro);
        cinco objetocinco;
        objetocinco = new cinco();
        objetocinco.numero5=18;
        objetocinco.cadena5="jorge";
        System.out.println(objetocinco);
                
        
    }

}
