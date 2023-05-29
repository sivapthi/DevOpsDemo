package ch.zhaw.iwi.devops.demo;

public class Calculator {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public float addfloat(int num1, float num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public int multiply(int num1, int num2) {
        if (num1 == 0 || num2 ==0) {
            throw new IllegalArgumentException("Multiplikation mit 0 nicht erlaubt");
       } 
       return num1 * num2;
    }

    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divsion durch 0 ist nicht erlaubt");
        }
        return num1 / num2;
    }

    public int modulo(int num1, int num2) {
        int result = num1 % num2;

        if(result < 0) {
            result +=Math.abs(num2);
        }
        return result;
    }

    public int zweiOperationen(int num1, int num2) {
        int summe = add(num1, num2);
        int produkt = multiply(num1, num2);
        return summe + produkt;
    }
}
