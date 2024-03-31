package cz.czechitas.ukol07;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Kniha {
    @JsonProperty("autor")
    public String autor;
    @JsonProperty("nazev")
    public String nazev;
    @JsonProperty("rok_vydani")
    public int rokVydani;

    public Kniha() {
    }

    public Kniha(String autor, String nazev, int rokVydani) {
        this.autor = autor;
        this.nazev = nazev;
        this.rokVydani = rokVydani;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getNazev() {
        return nazev;
    }

    public void setNazev(String nazev) {
        this.nazev = nazev;
    }

    public int getRokVydani() {
        return rokVydani;
    }

    public void setRokVydani(int rokVydani) {
        this.rokVydani = rokVydani;
    }


}
