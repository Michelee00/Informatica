package sl03;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 *
 * @author matteo.pagano
 */
class AscoltatoreFinestra extends WindowAdapter {

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Mani in alto!");
		Runtime.getRuntime().exit(0);
	}
}
