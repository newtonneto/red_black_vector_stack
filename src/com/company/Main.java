package com.company;

import com.company.exceptions.EmptyStackException;
import com.company.resources.VectorStack;
import com.company.tests.VectorTest;

public class Main {

    public static void main(String[] args) {
        VectorTest vectorTest = new VectorTest();

        try {
            vectorTest.execute();
        } catch (EmptyStackException error) {
            System.out.println(error);
        }
    }
}
