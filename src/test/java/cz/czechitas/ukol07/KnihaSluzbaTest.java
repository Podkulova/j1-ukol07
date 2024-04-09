package cz.czechitas.ukol07;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class KnihaSluzbaTest {
    @Test
    void testVratiSeznamOdZadanehoAutora() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        List<Kniha> knihyOdAutora = knihaSluzba.vratKnihyPodleAutora("Božena Němcová");

        assertEquals(4, knihyOdAutora.size(), "Mělo by být vráceno 4 knihy od autora Boženy Němcové");
    }

    @Test
    public void testKnihyOdNeexistujicihoAutora() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        List<Kniha> knihyOdAutora = knihaSluzba.vratKnihyPodleAutora("Neexistující Autor");

        assertEquals(0, knihyOdAutora.size(), "Mělo by být vráceno 0 knih od neexistujícího autora");
    }

    @Test
    void testVratiSeznamVZadanemRoce() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        List<Kniha> knihyVRoce = knihaSluzba.vratKnihyPodleRoku(1856);

        assertEquals(2, knihyVRoce.size(), "Mělo by být vráceno 2 knihy vydané v roce 1856");
    }

    @Test
    public void testKnihyVRoceKdyzZadnyRokNenajde() {
        KnihaSluzba knihaSluzba = new KnihaSluzba();

        List<Kniha> knihyVRoce = knihaSluzba.vratKnihyPodleRoku(2025);

        assertEquals(0, knihyVRoce.size(), "Mělo by být vráceno 0");
    }
}