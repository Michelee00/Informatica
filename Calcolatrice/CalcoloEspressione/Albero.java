package CalcoloEspressione;

public class Albero {
	Nodo radice;

	public Albero() {
	}

	double getRis() {
		return vis(radice);
	}

	private double vis(Nodo p) {
		if (p.info.tipo == Item.OPERATORE) {
			char operatore = (char) p.info.valore;
			switch ((char) operatore) {
				case '+':
					return vis(p.sx) + vis(p.dx);
				case '-':
					return vis(p.sx) - vis(p.dx);
				case '*':
					return vis(p.sx) * vis(p.dx);
				case '/':
					return vis(p.sx) / vis(p.dx);
			}
		} else {
			return p.info.valore;
		}
		return 0;
	}
}

class Nodo {

	Item info;
	Nodo dx;
	Nodo sx;

	public Nodo(Item valore) {
		this.info = valore;
	}

	Item getInfo() {
		return info;
	}
}