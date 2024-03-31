package cz.czechitas.ukol07;

import java.io.IOException;
import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) {



    //Ve třídě Aplikace vytvořte spouštěcí metodu main. V této metodě vytvořte instanci třídy KnihaSluzba.
      KnihaSluzba knihaSluzba = new KnihaSluzba();

    //Vypište do konzole (pomocí System.out) celkový počet knížek v naší malé databázi.

        int pocetKnizek = knihaSluzba.getKnihy().size();
        System.out.println("Celkový počet knih v databázi: " + pocetKnizek);

        //Vypište do konzole názvy všech knížek, které napsal Karel Čapek.
        List<Kniha> knihyKarelaCapka = knihaSluzba.vratiSeznamOdZadanehoAutora("Karel Čapek");

        System.out.println("Knihy napsané Karlem Čapkem:");
        for (Kniha kniha : knihyKarelaCapka) {
            System.out.println(kniha.getNazev());
        }

        List<Kniha> knihyVRoce1845 = knihaSluzba.vratiSeznamVZadanemRoce(1845);

        //Vypište všechny knížky vydané poprvé v roce 1845. Výpis bude ve tvaru jméno autora: název knihy.
        System.out.println("Knihy vydané poprvé v roce 1845:");
        for (Kniha kniha : knihyVRoce1845) {
            System.out.println(kniha.getAutor() + ": " + kniha.getNazev());
        }


    }

}
