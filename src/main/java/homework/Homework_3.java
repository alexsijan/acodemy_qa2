package homework;


import java.util.Scanner;

public class Homework_3 {
    public static void main(String[] args) {

//        Point 1:

        int x = 10;
        if (x == 10) {
            System.out.println("Integer value is: " + x);
        } else {
            System.out.println("This is not the number 10");
        }
        System.out.println();


//        Point 2:

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите Ваш возраст:");
        int age = sc.nextInt();
        if (18 <= age && age <= 21) {
            System.out.println("Ваш возраст от 18 лет до 21 года, Ваша скидка: 10%");
        } else if (22 <= age && age <= 65) {
            System.out.println("Ваш возраст от 22 лет до 65 лет, Ваша скидка 15%");
        } else if (age > 65) {
            System.out.println("Ваш возраст более 65 лет, Ваша скидка 20%");
        } else {
            System.out.println("Ваш возраст менее 18 лет, Мы не можем Вас обслужить");
        }
        System.out.println();

//        Point 3:

//      animal search by index

        String[] animals = {"Hare", "Wolf", "Dog", "Cat", "Raccoon", "Hippo", "Otter", "Hedgehog", "Fox", "Beaver"};
        String animal = " ";
        for (int i = 0; i < animals.length; i++) {
            animal = animals[9];
        }
        System.out.println(animal);

        System.out.println();

//        Point 4:

        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0)
                System.out.print(i + " ");
        }
        System.out.println("\n");


//        Point 5:

        String[] transport = {"auto", "bike", "bus", "trolley", "tram", "subway"};
        String travelOptions = transport[5];
        switch (travelOptions) {
            case "auto":
                System.out.println("I go to work by: " + travelOptions);
                break;
            case "bike":
                System.out.println("I go to work by: " + travelOptions);
                break;
            case "bus":
                System.out.println("I go to work by: " + travelOptions);
                break;
            case "trolley":
                System.out.println("I go to work by: " + travelOptions);
                break;
            case "tram":
                System.out.println("I go to work by: " + travelOptions);
                break;
            case "subway":
                System.out.println("I go to work by: " + travelOptions);
                break;
        }
        System.out.println("\n");


//        Point 6:

        for (int i = 1; i <= 100; i++) {

            System.out.print(i + " ");
        }
        System.out.println("\n");


//        Point 7:

        for (int i = 50; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("\n");


//        Point 8:

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int result = i * j;
                System.out.printf("%4d", result);
            }
            System.out.println();
        }


    }
}
