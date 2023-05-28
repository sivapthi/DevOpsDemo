package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void TestAddition(){
        Calculator calculator = new Calculator();
        int num1 = 6;
        int num2 = 5;
        int expectedSum = 11;

        int actualSum = calculator.add(num1, num2);
  
        assertEquals(expectedSum, actualSum);
    } 

    @Test
    public void TestSubtraktion(){
        Calculator calculator = new Calculator();
        int num1 = 6;
        int num2 = 5;
        int expectedDifference = 1;

        int actualDifference = calculator.subtract(num1, num2);
        
        assertEquals(expectedDifference, actualDifference);
    }

    @Test
    public void TestMultiplikation(){
        Calculator calculator = new Calculator();
        int num1 = 6;
        int num2 = 5;
        int expectedProduct = 30;

        int actualProduct = calculator.multiply(num1, num2);

        assertEquals(expectedProduct, actualProduct);
    }

    @Test
    public void TestDivision(){
        Calculator calculator = new Calculator();
        int num1 = 4;
        int num2 = 2;
        int expectedQuotient = 2;

        int actualQuotient = calculator.divide(num1, num2);

        assertEquals(expectedQuotient, actualQuotient);
    }

    @Test
    public void TestAddition1(){
        Calculator calculator = new Calculator();
        int num1 = 7;
        int num2 = 7;
        int expectedSum = 14;

        int actualSum = calculator.add(num1, num2);
  
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void TestSubtraktion1(){
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;
        int expectedDifference = 5;

        int actualDifference = calculator.subtract(num1, num2);
        
        assertEquals(expectedDifference, actualDifference);
    }

    @Test
    public void TestMultiplikation1(){
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;
        int expectedProduct = 50;

        int actualProduct = calculator.multiply(num1, num2);

        assertEquals(expectedProduct, actualProduct);        
    }

    @Test
    public void TestDivision1(){
        Calculator calculator = new Calculator();
        int num1 = 10;
        int num2 = 5;
        int expectedQuotient = 2;

        int actualQuotient = calculator.divide(num1, num2);

        assertEquals(expectedQuotient, actualQuotient);
    }

    @Test
    public void TestMultiplikation2(){
        Calculator calculator = new Calculator();
        int num1 = 20;
        int num2 = 6;
        int expectedProduct = 120;

        int actualProduct = calculator.multiply(num1, num2);

        assertEquals(expectedProduct, actualProduct);        
    }

    @Test
    public void TestDivision2(){
        Calculator calculator = new Calculator();
        int num1 = 60;
        int num2 = 10;
        int expectedQuotient = 6;

        int actualQuotient = calculator.divide(num1, num2);

        assertEquals(expectedQuotient, actualQuotient);
    }

    @Test
    public void TestUnterNullResultat() {
        Calculator calculator = new Calculator();
        int result = calculator.modulo(10, 3);
        assertTrue(result >= 0);
    }

}
