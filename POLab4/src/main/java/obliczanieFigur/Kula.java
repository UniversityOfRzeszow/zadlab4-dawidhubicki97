/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;

public class Kula {

    public Kula(double promien) {
        this.promien = promien;
    }

    double promien;

    public double powierzchniaKuli() {
        double powierzchnia;
        powierzchnia = 4 * Math.PI * (promien * promien);
        return powierzchnia;
    }

    public double objetoscKuli() {
        double objetosc;
        objetosc = (4 / 3) * Math.PI * (promien * promien * promien);
        return objetosc;
    }
     public void wyswietlKule(){
    System.out.println("Promien Kuli:" + promien);
    System.out.println("Powierzchnia Kuli:" + powierzchniaKuli());
    System.out.println("Objetosc Kuli:" + objetoscKuli());
    }
}
