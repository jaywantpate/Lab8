package org.example;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyStack<E> extends ArrayList<E>{

    ArrayList<E> delegate = new ArrayList<>();


    public MyStack() {
        this.delegate = this;
    }

    public void push(E e) {add(e);
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();
        E e = get(size() - 1);
        remove(size() -1 );
        return e;
    }

    public E peekTop() {
        return get(size() - 1);
    }
}
