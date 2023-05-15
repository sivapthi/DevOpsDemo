package ch.zhaw.iwi.devops.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void TestAddition(){
        Calculator calculator = new Calculator();
        int num1 = 5;
        int num2 = 6;
        int expectedSum = 11;

        int actualSum = calculator.add(num1, num2);
  
        assertEquals(expectedSum, actualSum);
    } 
}
