package cz.czechitas.ukol07;

import java.io.IOException;
import java.util.List;

/**
 * Spouštěcí třída aplikace
 */
public class Aplikace {
    public static void main(String[] args) {


        KnihaSluzba knihaSluzba = new KnihaSluzba();

        // Celkový počet knih
        System.out.println("Celkový počet knih: " + knihaSluzba.vratSeznamVsechKnih().size());

        // Knihy od Karla Čapka
        System.out.println("Knihy od Karla Čapka:");
        knihaSluzba.vratKnihyPodleAutora("Karel Čapek").forEach(kniha -> System.out.println(kniha.getAutor() + ": " + kniha.getNazev()));

        // Knihy vydané v roce 1845
        System.out.println("Knihy vydané v roce 1845:");
        knihaSluzba.vratKnihyPodleRoku(1845).forEach(kniha -> System.out.println(kniha.getAutor() + ": " + kniha.getNazev()));
    }
}
