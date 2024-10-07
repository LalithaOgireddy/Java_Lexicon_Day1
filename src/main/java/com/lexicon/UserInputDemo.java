package com.lexicon;
import java.util.Scanner;

public class UserInputDemo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = myObj.nextLine();
        System.out.println("Your name is "+userName);
    }
}
