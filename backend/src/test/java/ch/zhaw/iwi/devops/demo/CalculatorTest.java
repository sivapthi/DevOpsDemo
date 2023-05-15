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
}
