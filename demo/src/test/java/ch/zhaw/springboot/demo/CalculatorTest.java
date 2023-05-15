
import org.junit.Test;
import static org.junit.Assert;

public class CalculatorTest {

    @Test
    public void Addition(){
        Calculator calculator = new calculator();
        int num1 = 5;
        int num2 = 6;
        int expectedSum = 11;

        int actualSum = calculator.add(num1, num2);

        Assert.assertEquals(expectedSum, actualSum);
    } 
}
