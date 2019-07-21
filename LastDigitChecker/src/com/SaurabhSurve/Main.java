package com.SaurabhSurve;

public class Main {

    public static void main(String[] args) {
        System.out.println(lastDigitCheck(11,100,99));
        System.out.println(lastDigitCheck(11,101,99));
        System.out.println(lastDigitCheck(11,100,91));
        System.out.println(lastDigitCheck(10,101,91));
        System.out.println(lastDigitCheck(11,100,9));
        System.out.println(lastDigitCheck(11,9,91));
        System.out.println(lastDigitCheck(-10,100,91));
    }
    public static boolean lastDigitCheck(int num1, int num2, int num3) {
        if ((num1 >= 10 && num1 <= 1000) && (num2 >= 10 && num2 <= 1000) && (num3 >= 10 && num3 <= 1000)) {
            while (true) {
                int lastDigit1 = num1 % 10;
                int lastdigit2 = num2 % 10;
                int lastdigit3 = num3 % 10;

                if (lastDigit1 == lastdigit2 || lastDigit1 == lastdigit3 || lastdigit2 == lastdigit3) {
                    return true;
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }

    }
}
