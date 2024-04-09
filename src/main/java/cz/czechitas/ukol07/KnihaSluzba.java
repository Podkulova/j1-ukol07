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
        nactiKnihy();
    }

    private void nactiKnihy() {
        try (InputStream inputStream = KnihaSluzba.class.getResourceAsStream("knihy.json")) {
            ObjectMapper objectMapper = new ObjectMapper();
            knihy = objectMapper.readValue(inputStream, new TypeReference<List<Kniha>>() {});
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Kniha> vratSeznamVsechKnih() {
        return knihy;
    }

    public List<Kniha> vratKnihyPodleAutora(String autor) {
        return knihy.stream()
                .filter(kniha -> kniha.getAutor().equalsIgnoreCase(autor))
                .toList();
    }

    public List<Kniha> vratKnihyPodleRoku(int rok) {
        return knihy.stream()
                .filter(kniha -> kniha.getRokVydani() == rok)
                .toList();
    }
}
