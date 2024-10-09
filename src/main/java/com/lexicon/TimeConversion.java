package com.lexicon;
import java.util.Scanner;
public class TimeConversion {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Input Seconds: ");
        int secondsInput = inputObj.nextInt(); //86399
        int hours = secondsInput/3600;
        int minutes = (secondsInput%3600)/60;
        int seconds = (secondsInput%3600)%60;
        System.out.println(hours+":"+minutes+":"+seconds);
    }
}
