package ch.zhaw.iwi.devops.demo;

public class Calculator {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    public int divide(int num1, int num2) {
        return num1 / num2;
    }

    public int modulo(int num1, int num2) {
        int result = num1 % num2;

        if(result < 0) {
            result +=Math.abs(num2);
        }
        return result;
    }
}
