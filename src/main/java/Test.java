import models.ComparatorPlecare;
import models.Gara;
import models.Ora;
import models.Tren;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
        Gara gara = new Gara(initializareTrenuri());

        System.out.println("Inainte de sortare:");
        for(Tren tren : gara.getTrenuri()) {
            System.out.println(tren.showFullInfo());
        }

        Collections.sort(gara.getTrenuri(), new ComparatorPlecare());

        System.out.println("Dupa sortare:");
        for(Tren tren : gara.getTrenuri()) {
            System.out.println(tren.showFullInfo());
        }

        Gui gui = new Gui(gara);
        gui.go();
	}

	public static List<Tren> initializareTrenuri() {
        List<Tren> trenuri = new ArrayList<>();
        trenuri.add(new Tren("Brasov", 224, new Ora(13, 50)));
        trenuri.add(new Tren("Cluj-Napoca", 358, new Ora(10, 5)));
        trenuri.add(new Tren("Dej", 759, new Ora(9, 30)));
        trenuri.add(new Tren("Arad", 427, new Ora(21, 23)));
        trenuri.add(new Tren("Constanta", 864, new Ora(17, 0)));
        return trenuri;
    }
}
