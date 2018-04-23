package alberobindiricerca;

public class NodoConc<T> {

    protected T info;
    protected NodoConc<T> left;
    protected NodoConc<T> right;

    protected NodoConc(T info, NodoConc left, NodoConc rigth) {
        this.info = info;
        this.left = left;
        this.right = rigth;
    }
}
