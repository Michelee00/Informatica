package esercizio.pkg1;

/**
 *
 * @author michele.argenti
 */
public class Esercizio1 {
    public static void main(String[] args) {
        ListaConcatenata a=new ListaConcatenata();
        System.out.println(a.toString());
        System.out.println(a.size());
        String [] f={"a"};
        ListaConcatenata b=new ListaConcatenata(f);
        System.out.println(b.toString());
        System.out.println(b.size());
    }
}