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
public class Prostopadloscian {

    public Prostopadloscian(double pierwszakrawedzpodstawy, double drugakrawedzpodstawy, double krawedzboczna) {
        this.pierwszakrawedzpodstawy = pierwszakrawedzpodstawy;
        this.drugakrawedzpodstawy = drugakrawedzpodstawy;
        this.krawedzboczna = krawedzboczna;
    }

    double pierwszakrawedzpodstawy;
    double drugakrawedzpodstawy;
    double krawedzboczna;

    public double powierzchniaProstopadloscianu() {
        double powierzchnia;
        powierzchnia = (2 * pierwszakrawedzpodstawy * drugakrawedzpodstawy) + (2 * drugakrawedzpodstawy * krawedzboczna) + 2 * (pierwszakrawedzpodstawy * krawedzboczna);
        return powierzchnia;

    }

    public double objetoscProstopadloscianu() {
        double objetosc;
        objetosc = pierwszakrawedzpodstawy * drugakrawedzpodstawy * krawedzboczna;
        return objetosc;
    }
    public void wyswietlProstopadloscian(){
    System.out.println("Pierwsza krawedz podstawy prostopadloscianu:" + pierwszakrawedzpodstawy);
    System.out.println("Druga krawedz podstawy prostopadloscianu:" + drugakrawedzpodstawy);
    System.out.println("Trzecia krawedz podstawy prostopadloscianu:" + krawedzboczna);
    System.out.println("Powierzchnia Prostopadloscianu:" + powierzchniaProstopadloscianu());
    System.out.println("Objetosc Prostopadloscianu:" + objetoscProstopadloscianu());
    }
}
