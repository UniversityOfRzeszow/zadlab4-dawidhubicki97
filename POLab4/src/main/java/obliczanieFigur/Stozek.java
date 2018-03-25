/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;

/**
 *
 * @author Dawid
 */
public class Stozek {

    public Stozek(double promien, double dlugoscboku, double wysokosc) {
        this.promien = promien;
        this.dlugoscboku = dlugoscboku;
        this.wysokosc = wysokosc;
    }
    double promien;
    double dlugoscboku;
    double wysokosc;
    
    public double powierzchniaStozka(){
    double powierzchnia;
    powierzchnia=(Math.PI*(promien*promien))+(Math.PI*promien*dlugoscboku);
    return powierzchnia;
    }
    public double objetoscStozka(){
    double objetosc;
        objetosc=(1/3)*(Math.PI*(promien*promien))+(Math.PI*promien*dlugoscboku)*wysokosc;
        return objetosc;
    }
    public void wyswietlStozek(){
    System.out.println("Promien Stozka:" + promien);
    System.out.println("Dlugosc boku Stozka" + dlugoscboku);
    System.out.println("Wysokosc Stozka:" + wysokosc);
    System.out.println("Powierzchnia Stozka:" + powierzchniaStozka());
    System.out.println("Objetosc Stozka:" + objetoscStozka());
    }
}
