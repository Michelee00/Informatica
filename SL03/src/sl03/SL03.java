package sl03;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.util.ArrayList;
import javax.swing.SwingUtilities;
import static sl03.AscoltatoreBottoni.getElemAddDel;

public class SL03 {

	public static void main(String[] args) {
		Frame f = new Frame("Bottone con ascoltatore");
		f.setSize(300, 300);
		ArrayList <Object> array = new ArrayList<>(5);
		
		AscoltatoreFinestra af = new AscoltatoreFinestra();
		f.addWindowListener(af);
		
		Label lung = new Label("lung=" + array.size());
		Label elemCor=new Label("");
		
		Button[] bottoni = new Button[7];
		
		bottoni[0]=new Button("<<");
		bottoni[1]=new Button(">>");
		bottoni[2]=new Button("<");
		bottoni[3]=new Button(">");
		bottoni[4]=new Button("Add");
		bottoni[5]=new Button("Del");
		bottoni[6]=new Button(elemCor.getText());
		
		f.setLayout(new GridLayout(3, 3));
		
		f.add(bottoni[0]);
		f.add(lung);
		f.add(bottoni[1]);
		f.add(bottoni[2]);
		f.add(elemCor);
		f.add(bottoni[3]);
		f.add(bottoni[4]);
		f.add(getElemAddDel());
		f.add(bottoni[5]);
		
		AscoltatoreBottoni ab = new AscoltatoreBottoni(bottoni,array,lung,elemCor);
		f.addMouseListener(ab);
		
		for (int i = 0; i < bottoni.length; i++) {
			bottoni[i].addMouseListener(ab);
		}
		
		f.setVisible(true);
	}
	public static void aggiorna(Frame f){
		SwingUtilities.updateComponentTreeUI(f);
	}

}
