package models;

public class Tren {

    private String destinatie;
    private int cod;
    private Ora ora;

    public Tren(String destinatie, int cod, Ora ora) {
        this.destinatie = destinatie;
        this.cod = cod;
        this.ora = ora;
    }

    public String getDestinatie() {
        return destinatie;
    }

    public void setDestinatie(String destinatie) {
        this.destinatie = destinatie;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Ora getOra() {
        return ora;
    }

    public void setOra(Ora ora) {
        this.ora = ora;
    }

    public String showFullInfo() {
        return "Cod: " + cod +"  Destinatie: " + destinatie +  "  Ora plecare: " + ora.showOra();
    }

    public String showSomeInfo() {
        return "  Destinatie: " + destinatie +  "  Ora plecare: " + ora.showOra();
    }
}
