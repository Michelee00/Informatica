package CalcoloEspressione;

import java.util.Arrays;

public class Espressione {
	Albero valutatore = new Albero();
	PostFissa lettore = new PostFissa();
	String espressione;

	public Espressione(String espressione) {
		this.espressione = espressione;
		init(espressione);
	}

	private void costruisciAlbero(String[] postfissa) {
		Pila<Nodo> pila = new Pila<>();
		Nodo nodo, nodoSX, nodoDX;

		System.out.println(Arrays.toString(postfissa));

		for (int i = 0; i < postfissa.length; i++) {

			String letteraCorrente = postfissa[i];
			if (!isOperatore(letteraCorrente)) {
				if (isNumero(letteraCorrente)) {
					nodo = new Nodo(new Item(Double.parseDouble(letteraCorrente), Item.NUMERO));
					pila.push(nodo);
				} else {
					nodo = new Nodo(new Item(letteraCorrente.charAt(0), Item.VARIABILE));
					pila.push(nodo);
				}
			} else {
				nodo = new Nodo(new Item(letteraCorrente.charAt(0), Item.OPERATORE));
				nodoSX = pila.pop();
				nodoDX = pila.pop();

				System.out.println(nodoSX.info + ":" + letteraCorrente + ":" + nodoDX.info);
				nodo.sx = nodoDX;
				nodo.dx = nodoSX;
				pila.push(nodo);
			}
		}
		nodo = pila.getFront();
		pila.pop();

		valutatore.radice = nodo;
	}

	public void setVar(String x, double i) {
		espressione = espressione.replace(x, i + "");
		init(espressione);
	}

	public void stampaAlbero() {
		StampaAlbero.stampaNodo(valutatore.radice);
	}

	private boolean isOperatore(String lettera) {
		return (lettera.equals("+") || lettera.equals("-") || lettera.equals("*") || lettera.equals("/") || lettera.equals("^"));
	}

	private boolean isNumero(String letteraCorrente) {
		if (letteraCorrente.contains(".")) {
			letteraCorrente = letteraCorrente.substring(0, letteraCorrente.indexOf("."));
		}
		for (int i = 0; i < letteraCorrente.length(); i++) {
			int valore = (int) letteraCorrente.charAt(i);
			if (valore > 47 && valore < 58) {
				//va bene continua
			} else {
				return false;
			}
		}
		return true;
	}

	private void init(String espressione) {
		String postfissa = lettore.leggi(espressione);
		System.out.println("Postfissa generata : " + postfissa);
		costruisciAlbero(postfissa.split(" "));
	}

	public double getRis() {
		return valutatore.getRis();
	}
}
