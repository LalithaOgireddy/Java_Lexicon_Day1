package com.lexicon;
import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuess {
    public static void main(String[] args) {
        Random random = new Random();
        int randomInt = random.nextInt(500);
        System.out.println(randomInt);
        Scanner input = new Scanner(System.in);
        boolean notGuessed=true;
        int guessedInput;
        int cnt=0;
        do {
            System.out.println("Guess the number");
            guessedInput = input.nextInt();
            cnt++;
            if(randomInt==guessedInput) {
                System.out.printf("You have guessed it right in %d tries",cnt);
                notGuessed=false;
            } else if(randomInt>guessedInput){
                System.out.println("Your guess is too small");
            } else {
                System.out.println("Your guess is too big");
            }
        }
        while(notGuessed);
    }
}
