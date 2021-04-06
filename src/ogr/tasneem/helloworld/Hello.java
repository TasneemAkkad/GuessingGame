package ogr.tasneem.helloworld;

import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        System.out.println("Welcome To The Guessing Game");
        Random random = new Random(10);
        int ranNumber = random.nextInt();
        int guessingLimit = 0;

        System.out.println("You have 5 chances to win the challenge");

        while (guessingLimit <= 4){
            System.out.println("Please enter a number: ");
            Scanner scn =  new Scanner(System.in);
            int userNumber = scn.nextInt();

            if(userNumber == ranNumber ){
                System.out.println("you win!! :))");
            }else if (userNumber != ranNumber && guessingLimit <= 3){
                System.out.println("try again!");
            }

            guessingLimit++;
        }
        System.out.println("You are out of guesses :(");
    }
}
