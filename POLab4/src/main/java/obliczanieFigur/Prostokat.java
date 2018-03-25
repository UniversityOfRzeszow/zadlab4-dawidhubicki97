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
public class Prostokat {

    public Prostokat(double pierwszybok, double drugibok) {
        this.pierwszybok = pierwszybok;
        this.drugibok = drugibok;
    }
    double pierwszybok;
    double drugibok;
    
    public double obwodProstokata(){
    double obwod;
    obwod=(2*pierwszybok)+(2*drugibok);
        return obwod;
    }
    public double poleProstokata(){
    double pole;
    pole=pierwszybok*drugibok;
        return pole;
    }
    public void wyswietlProstokat(){
    System.out.println("Pierwszy Bok Prostokata:" + pierwszybok);
    System.out.println("Drugi Bok Prostokata:" + drugibok);
    System.out.println("Pole Prostokata:" + poleProstokata());
    System.out.println("Obwod Prostokata:" + obwodProstokata());
    }
}
