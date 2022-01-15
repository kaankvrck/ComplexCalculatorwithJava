package CalculatorApp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComplexTest {

    @Test
    void add() {

        Complex a = new Complex(5,2);
        Complex c = new Complex(1,1);
        assertEquals(new Complex(6,3).toString(),a.add(c).toString());
    }

    @Test
    void subtract() {
        Complex a = new Complex(5,2);
        Complex c = new Complex(1,1);
        assertEquals(new Complex(4,1).toString(),a.subtract(c).toString());
    }

    @Test
    void multiply() {
        Complex a = new Complex(5,2);
        Complex c = new Complex(1,1);
        assertEquals(new Complex(3,7).toString(),a.multiply(c).toString());
    }

    @Test
    void divide() {
        Complex a = new Complex(5,20);
        Complex c = new Complex(1,1);
        assertEquals(new Complex(12.5,7.5).toString(),a.divide(c).toString());
    }

    @Test
    void sqrt() {
        Complex a = new Complex(25,100);
        assertEquals(new Complex(5,10).toString(),a.sqrt(a).toString());
    }

    @Test
    void invertSign() {
        Complex a = new Complex(5,2);
        assertEquals("-5.0 -2.0i",a.invertSign(a).toString());
    }

}