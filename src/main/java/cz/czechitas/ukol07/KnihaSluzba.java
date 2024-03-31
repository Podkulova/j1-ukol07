package cz.czechitas.ukol07;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class KnihaSluzba {
    private List<Kniha> knihy;

    public KnihaSluzba() {
        knihy = nactiKnihyZJson();
    }
    private List<Kniha> nactiKnihyZJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        List<Kniha> knihy = new ArrayList<>();

        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }

        return knihy;
    }
    public List<Kniha> getKnihy() {

        return knihy;
    }

    //Ve třídě KnihaSluzba vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih.
    public List<Kniha> vratSeznamVsechKnizek() {
        return knihy;
    }

    //Ve třídě KnihaSluzba vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih od zadaného autora
    // (jméno autora bude parametr metody). Vrácený seznam může být prázdný.
    public List<Kniha> vratiSeznamOdZadanehoAutora (String jmenoAutora){
       List<Kniha> knihaodAutora = new ArrayList<>();

       for (Kniha kniha : knihy) {
           if (kniha.getAutor().equals(jmenoAutora)) {
               knihaodAutora.add(kniha);
           }
       }
       return knihaodAutora;
    }

    //Ve třídě KnihaSluzba vytvořte vhodně pojmenovanou metodu, která vrátí seznam (List) všech knih vydaných
    // v zadaném roce (rok bude parametr metody). Vrácený seznam může být prázdný.
    public List<Kniha> vratiSeznamVZadanemRoce (int rokVydani){
        List<Kniha> knihyVRoce = new ArrayList<>();

        for (Kniha kniha : knihy) {
            if (kniha.getRokVydani() == rokVydani) {
                knihyVRoce.add(kniha);
            }
        }
        return knihyVRoce;
    }
}
