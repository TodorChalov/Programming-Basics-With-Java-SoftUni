package AdvancedConditionalStatemantsExsercisec;

import java.util.Scanner;

public class P03NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String flowers = scanner.nextLine();
        int numFlowers = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double price = 0;


        if (flowers.equals("Roses")){
            price = 5;
            if(numFlowers > 80){
                price = price * 0.90;

            }


        } else if (flowers.equals("Dahlias")){
            price = 3.80;
            if (numFlowers > 90){
                price = price * 0.85;
            }


        }else if (flowers.equals("Tulips")){
            price = 2.80;
            if (numFlowers > 80){
                price = price * 0.85;
            }


        } else if (flowers.equals("Narcissus")){
            price = 3;
            if (numFlowers < 120){
                price = price * 1.15;
            }

        } else if (flowers.equals("Gladiolus")){
            price = 2.50;
            if (numFlowers < 80){
                price = price * 1.20;

            }


        }
        double totalPrice = price * numFlowers;
        double diff = Math.abs(budget - totalPrice);

        if (budget >= totalPrice){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",numFlowers,flowers,diff);

        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }

    }
}
