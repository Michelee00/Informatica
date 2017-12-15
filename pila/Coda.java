package pila;

public class Coda<T> {

    int testa, coda;
    private final int MAX;
    private T[] elem;

    Coda(int val) {
        testa = coda = 0;
        elem = (T[]) new Object[val];
        this.MAX = val;
    }

    public boolean isFull() {
        return testa == MAX;
    }

    public int getMax() {
        return this.MAX;
    }

    public boolean isEmpty() {
        return testa == coda;
    }

    public void enQueue(T val) {
        if (isEmpty()) {
            elem[coda] = val;
            testa++;
        } else if (isFull() == false) {
            testa++;
            for (int i = testa - 1; i > 0; i--) {
                elem[i] = elem[i - 1];
            }
            elem[coda] = val;
        } else {
            System.out.println("La coda è piena,non puoi aggiungere l'elemento " + val);
        }
    }

    public T deQueue() {
        T ele = null;
        if (isEmpty() == false) {
            ele = elem[testa - 1];
            coda++;
            for (int i = testa - 2; i >= coda - 1; i--) {
                elem[i + 1] = elem[i];
            }
            elem[coda - 1] = null;
        }
        return ele;
    }

    public void stampaCoda() {
        for (int i = 0; i < this.testa; i++) {
            System.out.print(elem[i] + " ");
        }
        System.out.println();
    }

    public int getTesta() {
        return testa;
    }

    public int getCoda() {
        return coda;
    }

    public T peek() {
        return elem[testa - 1];
    }

    public int getLength() {
        return elem.length;
    }

    public boolean isPalindrome() {
        Coda a = new Coda(MAX);
        Coda b = new Coda(MAX);
        boolean cond = false;
        for (int i = 0; i < getLength(); i++) {
            a.enQueue(elem[i]);
        }
        for (int i = getLength() - 1; i >= 0; i--) {
            b.enQueue(elem[i]);
        }
        for (int i = 0; i <= getLength(); i++) {
            if (a.deQueue() != b.deQueue()) {
                cond = false;
                return cond;
            } else {
                cond = true;
            }
        }
        return cond;
    }

    public void invertiCoda() {
        Pila s = new Pila(this.MAX);
        Coda d = new Coda(this.MAX);

        for (int i = 0; i < getLength(); i++) {
            s.push(deQueue());
        }
        for (int i = 0; i < MAX; i++) {
            d.enQueue(s.pop());
        }
        setElem((T[]) d.getElem());
    }

    private void setElem(T[] newElem) {
        elem = newElem;
    }

    private T[] getElem() {
        return elem;
    }
}
