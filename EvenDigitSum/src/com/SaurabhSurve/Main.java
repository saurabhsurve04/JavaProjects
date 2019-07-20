package com.SaurabhSurve;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        int sum = 0;
        if (number >= 0 && number <= 9) {
            if (number % 2 == 0) {
                return number + number;
            } else {
                return -1;
            }
        }
        if (number > 9) {
            while (number > 0) {
                int digit = number % 10;
                number /= 10;
                if (digit % 2 == 0) {
                    sum += digit;
                }
            }
        }
        return sum;
    }

}
