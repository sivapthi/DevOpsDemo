package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
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

        int actualQuotient = calculator.multiply(num1, num2);

        assertEquals(expectedQuotient, actualQuotient);
    }
}
