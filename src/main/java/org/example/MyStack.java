package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E>{

    ArrayList<E> delegate = new ArrayList<>();


    public MyStack() {
        this.delegate = this;
    }

    public void push(E e) {
        delegate.add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = delegate.get(delegate.size() - 1);
        remove(delegate.size() -1 );
        return e;
    }

    public E peekTop() {
        return delegate.get(delegate.size() - 1);
    }
}
