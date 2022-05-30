package AdvancedConditionalStatementsLAB;

import java.util.Locale;
import java.util.Scanner;

public class P03AnimalType {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String animal = scanner.nextLine();
        while (!animal.equals("dog")) {
            animal = scanner.nextLine();

        }
        System.out.println("Enter dog name");
        String dogName = scanner.nextLine();

        while (!dogName.toLowerCase(Locale.ROOT).equals("rex")) {
            System.out.println("Enter dog name");

            dogName = scanner.nextLine();


        }
        System.out.println("Come Rex");

        switch (animal) {
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;


        }


    }
}
