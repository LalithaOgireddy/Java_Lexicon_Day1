package com.lexicon;
import java.util.Scanner;

public class PrintUsername {
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        System.out.println("Hello "+inputObj.nextLine());
    }
}
