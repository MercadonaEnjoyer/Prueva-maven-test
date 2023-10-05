package eetac.dsa;

import eetac.dsa.excepciones.EmptyStackException;
import eetac.dsa.excepciones.FullStackException;

import java.util.Vector;

public class StackImpl<E> implements Stack<E>{
    int n;
    E[] data;
    public StackImpl(int i) {
        this.data = (E[]) new Object[i];
        this.n = 0;
    }

    @Override
    public void push(E e) throws FullStackException {
        if(n == data.length){
            throw new FullStackException("stack lleno");
        }
        data[n++] = e;
    }

    @Override
    public E pop() throws EmptyStackException {
        if(n == 0){
            throw new EmptyStackException("stack vacio");
        }
        E e = data[n-1];
        data[n] = null;
        n--;
        return e;
    }

    @Override
    public E peek() throws EmptyStackException {
        if(n == 0){
            throw new EmptyStackException("stack vacio");
        }
        E e = data[n-1];
        return e;
    }

    @Override
    public int size() {
        return n;
    }
}
