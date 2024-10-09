package com.lexicon;
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter three numbers separated by spaces ");
        int numb1 = input2.nextInt();
        int numb2 = input2.nextInt();
        int numb3 = input2.nextInt();
        double result = (numb1+numb2+numb3)/3;
        System.out.printf("(%d + %d + %d)/3=%f",numb1,numb2,numb3,result);
    }
}
