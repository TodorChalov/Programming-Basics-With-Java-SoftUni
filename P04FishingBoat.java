package AdvancedConditionalStatemantsExsercisec;

import java.util.Scanner;

public class P04FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int budget = Integer.parseInt(scanner.nextLine());
         String season = scanner.nextLine();
         int fishermen = Integer.parseInt(scanner.nextLine());

         double priceBoat = 0;


         if (season.equals("Spring")){
             priceBoat = 3000;


         } else if (season.equals("Summer")){
             priceBoat = 4200;

         } else if (season.equals("Autumn")){
             priceBoat = 4200;

         } else if (season.equals("Winter")){
             priceBoat = 2600;

         }
         if (fishermen <= 6){
             priceBoat = priceBoat * 0.90;


         } else if (fishermen <=11){
             priceBoat = priceBoat * 0.85;

        } else if (fishermen > 12){
             priceBoat = priceBoat * 0.75;
         }

         if (fishermen % 2 == 0 && !season.equals("Autumn")){
             priceBoat = priceBoat * 0.95;

        }

         double diff = Math.abs(budget - priceBoat);

         if (budget >= priceBoat){
             System.out.printf("Yes! You have %.2f leva left.", diff);

         } else {
             System.out.printf("Not enough money! You need %.2f leva.", diff);
         }
    }
}
