package sl03;

import java.awt.Color;
import java.awt.TextField;

public class TextFields {

	String name = "";
	TextField TextField;

	TextFields(String name) {
		this.name = name;
	}

	public TextField add() {
		this.TextField = new TextField(this.name);
		return this.TextField;
	}


}
