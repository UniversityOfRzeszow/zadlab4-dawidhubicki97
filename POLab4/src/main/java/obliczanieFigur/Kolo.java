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
public class Kolo {

    public Kolo(double promien) {
        this.promien = promien;
    }

    double promien;

    public double poleKola() {
        double pole;
        pole = Math.PI * (promien * promien);
        return pole;
    }

    public double obwodKola() {
        double obwod;
        obwod = 2 * Math.PI * promien;

        return obwod;
    }
    public void wyswietlKolo(){
    System.out.println("Promien Kola:" + promien);
    System.out.println("Pole Kola:" + poleKola());
    System.out.println("Obwod Kola:" + obwodKola());
    }
}
