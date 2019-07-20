package com.SaurabhSurve;

public class Main {

    public static void main(String[] args) {
        System.out.println(getSharedDigit(12,23));
        System.out.println(getSharedDigit(9,99));
        System.out.println(getSharedDigit(15,55));
    }

    public static boolean getSharedDigit(int num1, int num2) {
        if ((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)) {
            while (num1 >= 10 && num2 >= 10) {
                int digit1 = num1 % 10;
                num1 /= 10;
                int digit2 = num2 % 10;
                num2 /= 10;

                if (num1 == num2 || num1 == digit2 || num2 == digit1) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return false;
    }
}