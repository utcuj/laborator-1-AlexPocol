import models.Gara;
import models.Tren;

import javax.swing.*;
import java.awt.*;

public class Gui {

    private Gara gara;
    private JFrame frame;
    private JLabel codLabel;
    private JTextField codText;
    private JButton afisareButton;
    private JTextArea infoText;
    private JPanel mainPanel;
    private JPanel searchPanel;

    public Gui(Gara gara) {
        this.gara = gara;
    }

    public void go() {
        frame = new JFrame("Train Station");
        codLabel = new JLabel("Cod tren: ");
        codText = new JTextField(15);
        afisareButton = new JButton("Afisare tren");
        infoText = new JTextArea(3, 30);
        mainPanel = new JPanel(new FlowLayout());
        searchPanel = new JPanel(new FlowLayout());

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        infoText.setEditable(false);

        afisareButton.addActionListener(e -> {
            if (codText != null) {
                String cod = codText.getText();
                if (cod.equals("")) {
                    JOptionPane.showMessageDialog(frame, "Nu ati completat campul!");
                } else {
                    String info = showInfo(Integer.parseInt(cod));
                    if (!info.equals("")) {
                        infoText.setText(info);
                    } else {
                        infoText.setText("Trenul nu a fost gasit!");
                    }
                }
            }
        });

        searchPanel.add(codLabel);
        searchPanel.add(codText);
        searchPanel.add(afisareButton);
        mainPanel.add(searchPanel);
        mainPanel.add(infoText);

        frame.add(mainPanel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public String showInfo(int cod) {
        for (Tren tren : gara.getTrenuri()) {
            if (tren.getCod() == cod) {
                return tren.showSomeInfo();
            }
        }
        return "";
    }
}
