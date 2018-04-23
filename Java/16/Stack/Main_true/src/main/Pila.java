package main;

/**
 *
 * @author miche
 */
public class Pila {
    private Object [] dati;
    private int testa=0;
    private Pila (int n) {
        this.dati=new Object [n];
        this.testa=0;    
    }
    private Pila (){
        this(100);
    }
    public boolean isEmpty (){
        return testa==0;
    }
    public void push (Object d){
        dati[testa]=d;
        testa++;
    }
    public Object pop (){
        Object r=top();
        testa--;
        return r;
    }
    public Object top (){
        return dati [testa-1];
    }
    public boolean isFull (){
        return testa>dati.length;
    }
}