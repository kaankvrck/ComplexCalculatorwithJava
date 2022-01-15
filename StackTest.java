package CalculatorApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {

    @Test
    public void push() {
        int maxSize=5;
        int top = 0;

        Stack s = new Stack(maxSize);
        Complex[] stacks = new Complex[maxSize];

        System.out.println(stacks[0]);
        Complex j = new Complex(5,6);
        //Assertions.assertEquals(stacks[0]=j,s.push(j));
    }

    @Test
    void dup() {
    }

    @Test
    void swap() {
    }

    @Test
    void over() {
    }

    @Test
    void clear() {
    }

    @Test
    void drop() {
    }

    @Test
    void peek() {
    }

    @Test
    void isEmpty() {
    }

    @Test
    void isFull() {
    }
}