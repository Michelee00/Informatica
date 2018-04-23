package sl03;

import java.awt.Label;

public class Labels {

	String name = "";
	Label TextField;

	Labels(String name) {
		this.name = name;
	}

	public Label add() {
		this.TextField = new Label(this.name);
		return this.TextField;
	}
}
