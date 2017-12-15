package pila;

public class Pila<T> {

    private int top;
    private final int MAX;
    private T elem[];

    Pila(int val) {
        top = 0;
        this.MAX = val + 1;
        elem = (T[]) new Object[this.MAX];
    }

    public boolean isFull() {
        if (top + 1 == MAX) {
            System.out.println("Non puoi inserire altri elementi perchè la pila è piena");
        }
        return top + 1 == MAX;
    }

    public boolean isEmpty() {
        if (top == 0) {
            System.out.println("Non puoi estrarre elementi perchè la pila è vuota");
        }
        return top == 0;
    }

    public void push(T val) {
        if (isFull() == false) {
            this.top++;
            elem[top] = val;
        } else {

        }
    }

    public int getLength() {
        return elem.length;
    }

    public T pop() {
        T val = elem[top];
        if (isEmpty() == false) {
            top--;
        }
        return val;
    }

    public T top() {
        if (isEmpty() == false) {
            return elem[top];
        } else {
            return null;
        }
    }

    public void stampaPila() {
        for (int i = top; i > 0; i--) {
            System.out.println(elem[i]);
        }
    }

    public boolean isPalindrome() {
        Pila a = new Pila(MAX - 1);
        Pila b = new Pila(MAX - 1);
        boolean cond = false;
        for (int i = 1; i < getLength(); i++) {
            a.push(elem[i]);
        }
        for (int i = getLength() - 1; i > 0; i--) {
            b.push(elem[i]);
        }
        for (int i = 1; i < getLength(); i++) {
            if (a.pop() != b.pop()) {
                cond = false;
                return cond;
            } else {
                cond = true;
            }

        }

        return cond;
    }

    public void invertiPila() {
        Coda q = new Coda(this.MAX);
        for (int i = 1; i < getLength(); i++) {
            q.enQueue(pop());
        }
        for (int i = 0; i < MAX - 1; i++) {
            push((T) q.deQueue());
        }
    }

    private void setElem(T[] newElem) {
        elem = newElem;
    }

    private T[] getElem() {
        return elem;
    }
}
