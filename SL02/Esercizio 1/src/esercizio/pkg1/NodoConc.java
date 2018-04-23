package esercizio.pkg1;

/**
 *
 * @author michele.argenti
 * @param <T>
 */
public class NodoConc <T>{
	T info;
	NodoConc <T> next;
	NodoConc (T info, NodoConc <T> next){
            this.info=info;
            this.next=next;
	}
}