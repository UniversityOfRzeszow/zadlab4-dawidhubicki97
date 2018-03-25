package pl.edu.ur.polab4;

import java.util.Scanner;
import obliczanieFigur.*;
import wprowadzDane.*;

/**
 *
 * @author Dawid
 */
public class Main {

    public static void main(String[] args) {

        Scanner wybor = new Scanner(System.in);
        int duzyswitch;
        System.out.println("1.zadanie 4");
        System.out.println("2.zadanie 5");
        duzyswitch = wybor.nextInt();
        switch (duzyswitch) {
            case 1: {

                int menu = 1;
                while (menu != 0) {
                    System.out.println("Menu:");
                    System.out.println("1.kwadrat");
                    System.out.println("2.prostokat");
                    System.out.println("3.kolo");
                    System.out.println("4.szescian");
                    System.out.println("5.prostopadloscian");
                    System.out.println("6.kula");
                    System.out.println("7.stozek");
                    System.out.println("dla jakiej figury chcesz obliczyc pole");

                    menu = wybor.nextInt();
                    switch (menu) {

                        case 1: {
                            System.out.println("Podaj bok kwadratu");
                            Kwadrat pierwszykwadrat = new Kwadrat(wybor.nextInt());
                            pierwszykwadrat.wyswietlKwadrat();
                            break;
                        }
                        case 2: {
                            System.out.println("Podaj boki prostokata");
                            Prostokat pierwszyprostokat = new Prostokat(wybor.nextInt(), wybor.nextInt());
                            pierwszyprostokat.wyswietlProstokat();
                            break;
                        }
                        case 3: {
                            System.out.println("Podaj promien kola");
                            Kolo pierwszekolo = new Kolo(wybor.nextInt());
                            pierwszekolo.wyswietlKolo();
                            break;
                        }
                        case 4: {
                            System.out.println("Podaj bok Szescianu");
                            Szescian pierwszyszescian = new Szescian(wybor.nextInt());
                            pierwszyszescian.wyswietlSzescian();
                            break;
                        }
                        case 5: {
                            System.out.println("Podaj boki prostopadloscianu");
                            Prostopadloscian pierwszyprostopadloscian = new Prostopadloscian(wybor.nextInt(), wybor.nextInt(), wybor.nextInt());
                            pierwszyprostopadloscian.wyswietlProstopadloscian();
                            break;
                        }
                        case 6: {
                            System.out.println("Podaj promien Kuli");
                            Kula pierwszakula = new Kula(wybor.nextInt());
                            pierwszakula.wyswietlKule();
                            break;
                        }
                        case 7: {
                            System.out.println("Podaj promien,dlugosc boku i wysokosc stozka");
                            Stozek pierwszystozek = new Stozek(wybor.nextInt(), wybor.nextInt(), wybor.nextInt());
                            pierwszystozek.wyswietlStozek();
                            break;
                        }
                    }
                }

            }
            case 2: {
                Student[] studenci = new Student[100];

                for (int i = 0; i < 100; i++) {
                    studenci[i] = new Student();
                }

                int ktorestudenci=1, podana;
                while (ktorestudenci != 0){
                System.out.println("1.wprowadzanie danych studenta pod wybrany index tablicy");
                System.out.println("2.edycja spod wybranego indeksu");
                System.out.println("3.usuniecie danych studenta");
                System.out.println("4.wyswietlenie obiektu o danym indeksie");
                System.out.println("5.wyswietlenie wszystkich obiektow");
                System.out.println("6.wyswietlenie zakresu obiektów w podanym zakresie");

                ktorestudenci = wybor.nextInt();
                switch (ktorestudenci) {

                    case 1: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz wprowadzic dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].podWybrany();
                        break;

                    }
                    case 2: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz wprowadzic dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].podWybrany();
                        break;
                    }
                    case 3: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz przypisac domyslne dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].przypiszdomyslne();
                        break;
                    }
                    case 4: {
                        System.out.println("Podaj indeks tablicy dla ktorego chcesz wyswietlic dane: ");
                        podana = wybor.nextInt();
                        studenci[podana].wyswietlDane();
                        break;
                    }
                    case 5: {
                        for (int i = 0; i < 100; i++) {
                            studenci[i].wyswietlDane();
                        }
                        break;
                    }
                    case 6: {
                        int poczatek, koniec;
                        System.out.println("Podaj poczatek zakresu: ");
                        poczatek = wybor.nextInt();
                        System.out.println("Podaj koniec zakresu: ");
                        koniec = wybor.nextByte();
                        for (int i = poczatek; i < koniec; i++) {
                            studenci[i].wyswietlDane();
                        }
                        break;
                    }
                }
                }
            }
        }
    }
}
