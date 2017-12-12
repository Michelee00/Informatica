package sl03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.util.ArrayList;

public class SL03 {

    public static void main(String[] args) {
        Frame f = new Frame("prova");
        Button[] bottoni = new Button[6];
        ArrayList<Object> lista = new ArrayList<>();
        AscoltatoreWin finestra = new AscoltatoreWin();
        AscoltatoreBottoni mouse = new AscoltatoreBottoni(bottoni, lista);

        f.setLayout(new GridLayout(3, 3));
        f.setVisible(true);

        bottoni[0] = new Button("<<");
        bottoni[1] = new Button(">>");
        bottoni[2] = new Button("<");
        bottoni[3] = new Button(">");
        bottoni[4] = new Button("Add");
        bottoni[5] = new Button("Del");
        f.addWindowListener(finestra);
        for (int i = 0; i < bottoni.length; i++) {
            bottoni[i].addMouseListener(mouse);
        }
        mouse.getText().addMouseListener(mouse);
        f.add(bottoni[0]);
        f.add(mouse.getLb1());
        f.add(bottoni[1]);
        f.add(bottoni[2]);
        f.add(mouse.getLb2());
        f.add(bottoni[3]);
        f.add(bottoni[4]);
        f.add(mouse.getText());
        f.add(bottoni[5]);
        f.setSize(500, 500);
    }

}
