package org.example;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(12321));
        System.out.println(isPerfectNumber(1));
        System.out.println(numberToWords(123));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int originalNumber = number;
        int reversedNumber = 0;

        while (number > 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(originalNumber + ".");
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber(int number){
        if(number<1) {return  false;}
        if(number == 1) {return  true;}
        int total = 0;
        for(int i=1;i<number;i++){
            if(number % i == 0){
                total += i;
            }
        }
        System.out.println(total + ",");
        return number == total;
    }
    public static String numberToWords(int number){
        if(number < 0) {
            return "Invalid Value";
        }
        char[] digits = String.valueOf(number).toCharArray();
        String Text = "";

        for(char digit: digits){
            switch (digit){
                case '0':
                    Text += "Zero ";
                    break;
                case '1':
                    Text += "One ";
                    break;
                case '2':
                    Text += "Two ";
                    break;
                case '3':
                    Text += "Three ";
                    break;
                case '4':
                    Text += "Four ";
                    break;
                case '5':
                    Text += "Five ";
                    break;
                case '6':
                    Text += "Six ";
                    break;
                case '7':
                    Text += "Seven ";
                    break;
                case '8':
                    Text += "Eight ";
                    break;
                case '9':
                    Text += "Nine ";
                    break;
            }
        }
        return Text.trim(); // trim remove spaces from the beginning and end of string.
    }
}
