import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
/*
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = i;
            System.out.println(num[i]);
        }

        int a = 2;
        while (a <= 25) {
            System.out.println(a);
            a++;
        }

 */
        Scanner terminal = new Scanner(System.in);
//        System.out.println("What is your name?");
//        String name;
//        name = terminal.nextLine();
//        System.out.println("Your name is: " + name);


        Random randomizer = new Random();
        int randomNumber = randomizer.nextInt(ThreadLocalRandom.current().nextInt(10 - 1))+1;
        System.out.println("I generated random number from 1 to 10, please guess it!");
        boolean isGuessed = false;

        do {
            System.out.println("Please write a number: ");
            int answer = terminal.nextInt();
            if (answer == randomNumber) {
                System.out.println("You guessed the number: Number was: " + randomNumber);
                isGuessed = true;
            } else {
                System.out.println("Number is not correct!");
            }
        } while (!isGuessed);

        System.out.println("Bye");


    }
}

