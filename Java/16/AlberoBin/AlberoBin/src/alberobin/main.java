package alberobin;

/**
 *
 * @author matteo.pagano
 */
public class main {
    public static void main(String[] args){
        AlberoBin a=new AlberoBin(5, new AlberoBin(2, new AlberoBin (9, null, null), new AlberoBin(4, null, new AlberoBin(7, new AlberoBin(6, null, null), new AlberoBin(8, null, null)))), new AlberoBin(3, new AlberoBin(1, null, null), new AlberoBin(10, null, null)));
        AlberoBin.visitaAnticipata(a);
        System.out.println();
        AlberoBin.visitaDifferita(a);
        System.out.println();
        AlberoBin.visitaSimmetrica(a);
    }
}