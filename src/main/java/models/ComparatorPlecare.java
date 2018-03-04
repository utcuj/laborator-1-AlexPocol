package models;

import java.util.Comparator;

public class ComparatorPlecare implements Comparator<Tren> {

    @Override
    public int compare(Tren o1, Tren o2) {
        Ora ora1 = o1.getOra();
        Ora ora2 = o2.getOra();

        if (ora1.getOra() == ora2.getOra()) {
            if (ora1.getMinute() == ora2.getMinute()) {
                return 0;
            } else if (ora1.getMinute() > ora2.getMinute()) {
                return 1;
            } else {
                return -1;
            }
        } else if (ora1.getOra() > ora2.getOra()) {
            return 1;
        }
        return -1;
    }
}
