/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package obliczanieFigur;


public class Kwadrat {

    public Kwadrat(double dlugoscboku) {
        this.dlugoscboku = dlugoscboku;
    }
    double dlugoscboku;
    
    public double obwodKwadratu(){
    double obwod;
    obwod=dlugoscboku*4;
    return obwod;
    }
     public double poleKwadratu(){
    double pole;
    pole=dlugoscboku*dlugoscboku;
    return pole;
    }
      public void wyswietlKwadrat(){
    System.out.println("Bok Kwadratu:" + dlugoscboku);
    System.out.println("Pole Kwadratu:" + poleKwadratu());
    System.out.println("Obwod Kwadratu:" + obwodKwadratu());
    }
}
