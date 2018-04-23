package sl03;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 *
 * @author matteo.pagano
 */
class AscoltatoreBottoni implements MouseListener {
	
	static int count = 0;
	static ArrayList array;
	Button[] bottoni;
	private Label lung, elemCor;
	static TextField elemAddDel = new TextField("");
	
	public static TextField getElemAddDel() {
		return elemAddDel;
	}
	
	AscoltatoreBottoni(Button[] bottoni, ArrayList a, Label lung , Label elemCor) {
		this.bottoni = bottoni;
		this.array = a;
		this.lung=lung;
		this.elemCor=elemCor;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == bottoni[0]) {
			this.count = 0;
			bottoni[0].setBackground(Color.red);
			bottoni[1].setBackground(Color.green);
			bottoni[2].setBackground(Color.red);
			bottoni[3].setBackground(Color.green);
		}
		if (e.getSource() == bottoni[1]) {
			this.count = this.array.size();
			bottoni[0].setBackground(Color.green);
			bottoni[1].setBackground(Color.red);
			bottoni[3].setBackground(Color.red);
			bottoni[2].setBackground(Color.green);
		}
		if (e.getSource() == bottoni[2]) {
			if (this.count == 0) {
				bottoni[2].setBackground(Color.red);
				bottoni[3].setBackground(Color.green);
				bottoni[0].setBackground(Color.red);
				bottoni[1].setBackground(Color.green);
			} else {
				this.count--;
			}
		}
		if (e.getSource() == bottoni[3]) {
			if (this.count == this.array.size()) {
				bottoni[3].setBackground(Color.red);
				bottoni[2].setBackground(Color.green);
				bottoni[1].setBackground(Color.red);
				bottoni[0].setBackground(Color.green);
			} else {
				this.count++;
			}
		}
		if (e.getSource() == bottoni[4]) {
			if (elemAddDel.getText().equals("")) {
				bottoni[4].setBackground(Color.red);
			} else {
				bottoni[4].setBackground(Color.green);
				this.array.add(elemAddDel.getText());
				System.out.println(this.array);
			}
			lung.setText("lung="+this.array.size());
		}
		if (e.getSource() == bottoni[5]) {
			if (array.size() != 0) {
				if (this.array.contains(elemAddDel.getText())) {
					bottoni[5].setBackground(Color.green);
					this.array.remove(elemAddDel.getText());
					System.out.println(this.array);
				}else{
					bottoni[5].setBackground(Color.red);
				}
			}
			lung.setText("lung="+this.array.size());
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
