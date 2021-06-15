package com.company.resources;

import com.company.exceptions.EmptyStackException;
import com.company.interfaces.IVectorStack;

import java.util.Vector;

public class VectorStack implements IVectorStack {
    private Vector vectorStack;

    public VectorStack() {
        this.vectorStack = new Vector();
    }

    @Override
    public Object top() throws EmptyStackException {
        return this.vectorStack.lastElement();
    }

    @Override
    public void push(Object o) {
        this.vectorStack.addElement(o);
    }

    @Override
    public Object pop() throws EmptyStackException {
        int index = this.size() - 1;

        return this.vectorStack.remove(index);
    }

    @Override
    public int size() {
        return this.vectorStack.size();
    }

    public void printVector() {
        int vectorLength = this.size();

        for (int index = 0; index < vectorLength; index++) {
            System.out.print(this.vectorStack.get(index) + " ");
        }
        System.out.println("\n");
    }
}
