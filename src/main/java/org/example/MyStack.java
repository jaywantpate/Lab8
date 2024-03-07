package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E>{

    ArrayList<E> delegate = new ArrayList<>();


    public MyStack() {
        this.delegate = this;
    }

    public boolean isEmpty() {
        return delegate.isEmpty();
    }

    public int size(){
        return delegate.size();
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = delegate.get(size() - 1);
        remove(size() -1 );
        return e;
    }

    public E peekTop() {
        return delegate.get(size() - 1);
    }
}
