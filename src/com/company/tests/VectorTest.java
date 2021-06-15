package com.company.tests;

import com.company.exceptions.EmptyStackException;
import com.company.resources.VectorStack;

import java.util.Vector;

public class VectorTest {
    VectorStack vectorStack;

    public VectorTest() {
        this.vectorStack = new VectorStack();
    }

    public void execute() {
        vectorStack.push("1");
        vectorStack.push("dois");
        vectorStack.push(3);
        vectorStack.push("batata");
        vectorStack.push("doce");
        vectorStack.push("é");
        vectorStack.push("ruim");

        vectorStack.printVector();

        vectorStack.pop();
        vectorStack.pop();
        vectorStack.pop();

        vectorStack.printVector();

        System.out.println("Ultimo elemento: " + vectorStack.top());

        System.out.println("Tamanho da pilha: " + vectorStack.size());

        vectorStack.pop();
        vectorStack.pop();
        vectorStack.pop();

        System.out.println("Ultimo elemento: " + vectorStack.top());

        System.out.println("Tamanho da pilha: " + vectorStack.size());

        vectorStack.pop();

        System.out.println("Ultimo elemento: " + vectorStack.top());
    }
}
