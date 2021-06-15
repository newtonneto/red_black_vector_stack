package com.company.interfaces;

import com.company.exceptions.EmptyStackException;

public interface IVectorStack {
    public Object top() throws EmptyStackException;
    public void push(Object o);
    public Object pop() throws EmptyStackException;
    public int size();
}
