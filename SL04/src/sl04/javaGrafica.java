package sl04;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;

/**
 *
 * @author matteo.pagano
 */
public class javaGrafica {
	public static void main(String[] args) {
		Frame f = new Frame("prova");
		f.setLayout(new GridLayout(3, 3));
		f.setSize(500, 500);
		f.setVisible(true);
		ascoltatoreWin aw=new ascoltatoreWin();
		f.addWindowListener(aw);
		Button[] b = new Button[4];
		Label[] l = new Label[5];
		
		b[0] = new Button("Push");
		b[1] = new Button("Pop");
		b[2] = new Button("<<");
		b[3] = new Button(">");
		l[0] = new Label();
		l[1] = new Label();
		l[2] = new Label();
		l[3] = new Label();
		l[4] = new Label();
		
		f.add(l[0]);
		f.add(l[1]);
		f.add(b[0]);
		f.add(l[2]);
		f.add(l[3]);
		f.add(b[1]);
		f.add(b[2]);
		f.add(l[4]);
		f.add(b[3]);
		
	}
}
