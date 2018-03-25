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
public class Szescian {

    public Szescian(double dlugoscboku) {
        this.dlugoscboku = dlugoscboku;
    }
    double dlugoscboku;
    public double objetoscSzescianu(){
    double objetosc;
    objetosc=dlugoscboku*dlugoscboku*dlugoscboku;
    return objetosc;
    }
     public double powierzchniaSzescianu(){
    double powierzchnia;
    powierzchnia=6*(dlugoscboku*dlugoscboku);
    return powierzchnia;
    }
     public void wyswietlSzescian(){
    System.out.println("Dlugosc boku Szescianu:" + dlugoscboku);
    System.out.println("Powierzchnia Szescianu:" + objetoscSzescianu());
    System.out.println("Objetosc Szescianu:" + powierzchniaSzescianu());
    }
}
