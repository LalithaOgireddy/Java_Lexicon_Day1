package com.lexicon;
import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int num1 = input1.nextInt();
        System.out.println("Enter number2: ");
        int num2 = input1.nextInt();
        System.out.println("Select Operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Division");
        System.out.println("4. Subtraction");
        int op = input1.nextInt();
        int result;
        switch(op) {
            case 1:
                result=num1+num2;
                System.out.printf("%d + %d = %d",num1,num2,result);
                break;
            case 2:
                result=num1*num2;
                System.out.printf("%d * %d = %d",num1,num2,result);
                break;
            case 3:
                result=num1/num2;
                System.out.printf("%d / %d = %d",num1,num2,result);
                break;
            case 4:
                result=num1-num2;
                System.out.printf("%d - %d = %d",num1,num2,result);
                break;
            default:
                System.out.println("Enter proper input.");
        }
    }
}
