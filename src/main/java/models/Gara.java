package models;

import java.util.List;

public class Gara {

    private List<Tren> trenuri;

    public Gara(List<Tren> trenuri) {
        this.trenuri = trenuri;
    }

    public List<Tren> getTrenuri() {
        return trenuri;
    }

    public void setTrenuri(List<Tren> trenuri) {
        this.trenuri = trenuri;
    }
}
