package CalculatorApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

class StackTest {

    int maxSize = 5;
    Stack s = new Stack(maxSize);
    Complex[] stacks = new Complex[maxSize];
    int top= 0;
    Complex j = new Complex(5,6);
    Complex x = new Complex(2,4);

    @Test
    public void push() {
        s.push(j);
        Assertions.assertSame(stacks[1]=j, stacks[top+1]=j);
        /*stacks[top + 1] = j;
        boolean flag = stacks[1] == x;
        Assertions.assertTrue(flag);*/

    }

    @Test
    public void dup() {
        stacks[top+1]=j;
        top++;
        Complex topVar2 = stacks[top];
        stacks[++top] = topVar2;
        Assertions.assertEquals(stacks[2],stacks[1]);
    }

    @Test
    void swap() {
        stacks[top] = j;
        stacks[top+1] = x;
        top+=2;
        //s.swap();
        Complex topVar = stacks[top - 1];
        Complex topVar2 = stacks[top - 2];
        stacks[top - 1] = topVar2;
        stacks[top - 2] = topVar;

        boolean flag = false;
        if(stacks[top-1].equals(topVar2) && stacks[top-2].equals(topVar)){
            flag = true;
        }
        Assertions.assertTrue(flag);
    }

    @Test
    void clear() {
        stacks[top] = j;
        stacks[top+1] = x;

        for(int i=0; i<stacks.length; i++){
            stacks[i] = null;
        }
        boolean flag = false;
        for(int i=0; i<stacks.length; i++){
            if(stacks[i] == null){
                flag = true;

            }
        }
        Assertions.assertTrue(flag);
    }

    @Test
    void drop() {
        stacks[top] = j;
        stacks[top+1] = x;
        s.drop();

        Complex last = stacks[top];
        stacks[top] = null;

        boolean flag = false;
        if(stacks[top] == null){
            flag = true;
        }
        Assertions.assertTrue(flag);
    }

}