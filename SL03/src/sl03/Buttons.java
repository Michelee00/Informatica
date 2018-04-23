package sl03;

import java.awt.Button;
import java.awt.Color;

public class Buttons {
	String name = "";
	Button bottone;

	Buttons(String name) {
		this.name = name;
	}

	public Button add() {
		this.bottone = new Button(this.name);
		return this.bottone;
	}

	public void setColor(Color c) {
		this.bottone.setBackground(c);
	}

}
