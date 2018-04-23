package alberobindiricerca;

import java.util.ArrayList;

/**
 *
 * @author matteo.pagano
 */
public class AlberoBinDiRicerca {

    private NodoConc<Comparable> radice;
    private int leaves;
    ArrayList<Comparable> a = new ArrayList();

    public void add(Comparable arg) {
        leaves++;
        if (radice == null) {
            radice = new NodoConc(arg, null, null);
            return;
        }
        NodoConc<Comparable> temporaneo = radice;
        boolean rl = arg.compareTo(temporaneo.info) > 0;
        while (temporaneo.right != null && rl) {
            if (rl) {
                temporaneo = temporaneo.right;
            } else {
                temporaneo = temporaneo.left;
            }
            rl = arg.compareTo(temporaneo.info) > 0;
        }
        while (temporaneo.left != null && !rl) {
            if (rl) {
                temporaneo = temporaneo.right;
            } else {
                temporaneo = temporaneo.left;
            }
            rl = arg.compareTo(temporaneo.info) > 0;
        }
        if (rl) {
            temporaneo.right = new NodoConc(arg, null, null);
        } else {
            temporaneo.left = new NodoConc(arg, null, null);
        }
    }

    public boolean isEmpty() {
        return radice.info != null;
    }

    public int leaves() {
        return this.leaves;
    }

    public ArrayList<Comparable> visitaAnticipata() {
        visitaAnticipata(radice);
        return this.a;
    }

    public void visitaAnticipata(NodoConc<Comparable> nodo) {
        if (isEmpty()) {
            this.a.add(nodo.info);
            if (nodo.left != null) {
                visitaAnticipata(nodo.left);
            }
            if (nodo.right != null) {
                visitaAnticipata(nodo.right);
            }
        }
    }

    public ArrayList<Comparable> visitaDifferita() {
        visitaDifferita(radice);
        return this.a;
    }

    public void visitaDifferita(NodoConc<Comparable> nodo) {
        if (isEmpty()) {
            if (nodo.right != null) {
                visitaDifferita(nodo.right);
            }
            if (nodo.left != null) {
                visitaDifferita(nodo.left);
            }
            this.a.add(nodo.info);
        }
    }

    public ArrayList<Comparable> visitaSimmetrica() {
        visitaSimmetrica(radice);
        return this.a;
    }

    private void visitaSimmetrica(NodoConc<Comparable> nodo) {
        if (isEmpty()) {
            if (nodo.left != null) {
                visitaSimmetrica(nodo.left);
            }
            this.a.add(nodo.info);
            if (nodo.right != null) {
                visitaSimmetrica(nodo.right);
            }
        }
    }

    public void search(Object x) {
        boolean tf = false;        
        for (int i = 0; i < this.a.size(); i++)
            tf = a.get(i).equals(x);
        if (tf)
            System.out.println("There is " + x);
        else 
            System.out.println("There isn't " + x);
        
    }
}
