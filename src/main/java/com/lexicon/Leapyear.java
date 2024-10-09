package com.lexicon;
import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int yearInput = input.nextInt();
        if(yearInput % 4 == 0) {
            if(yearInput%100 == 0) {
                if(yearInput%400 == 0) {
                    System.out.printf("%d is Leap year",yearInput);
                } else System.out.printf("%d is not a Leap year",yearInput);
            } else System.out.printf("%d is Leap year",yearInput);
        } else System.out.printf("%d is Not a Leap year",yearInput);
    }
}
