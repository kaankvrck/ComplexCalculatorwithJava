package CalculatorApp;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class UserDefinedOperationTest {

    UserDefinedOperation a = new UserDefinedOperation("operationName", "operation");

    @org.junit.jupiter.api.Test
    void getOperationName() {
        Assertions.assertEquals("operationName",a.getOperationName());
    }

    @org.junit.jupiter.api.Test
    void setOperationName() {
        a.setOperationName("testOperationName");
        Assertions.assertEquals("testOperationName",a.getOperationName());
    }

    @org.junit.jupiter.api.Test
    void getOperation() {
        Assertions.assertEquals("operation",a.getOperation());

    }

    @org.junit.jupiter.api.Test
    void setOperation() {
        a.setOperation("testOperation");
        Assertions.assertEquals("testOperation",a.getOperation());
    }
}