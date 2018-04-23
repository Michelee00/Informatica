package esercizio.pkg1;

/**
 *
 * @author michele.argenti
 * @param <T>
 */
public class ListaConcatenata <T> {
    NodoConc <T> n;
    public ListaConcatenata(){
        n=new NodoConc (null, null);
    }
    public ListaConcatenata(T[] a){
        n=new NodoConc (null, null);
        for (T a1 : a) {
            n.info = a1;
            n.next=new NodoConc (null, null);
            n=n.next;
        }
    }
    @Override
    public String toString(){
        NodoConc t=n;
        String f="";
        for (int i = 0; i < size(); i++) {
            f+=""+n.info+" ";
            t=t.next;
        }
        return f;
    }
    public int size(){
        NodoConc t=n;
        int s=0;
        while(t.next!=null){
            s++;
            t=t.next;
        }
        return s;
    }
}