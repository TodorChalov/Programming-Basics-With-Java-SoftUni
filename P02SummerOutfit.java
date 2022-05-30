package AdvancedConditionalStatemantsExsercisec;

import java.util.Scanner;

public class P02SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrease = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();


        String outfit = "";
        String shoes = "";


        if (time.equals("Morning")){
            if (degrease >= 10 && degrease <=18){
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            } else if (degrease >18 && degrease <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrease >= 25){
                outfit = "T-Shirt";
                shoes = "Sandals";
            }

        } else if (time.equals("Afternoon")){
            if (degrease >= 10 && degrease <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrease >18 && degrease <= 24){
                outfit = "T-Shirt";
                shoes = "Sandals";
            } else if (degrease >= 25){
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }

        } else if (time.equals("Evening")){
            if (degrease >= 10 && degrease <=18){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrease >18 && degrease <= 24){
                outfit = "Shirt";
                shoes = "Moccasins";
            } else if (degrease >= 25){
                outfit = "Shirt";
                shoes = "Moccasins";

            }

        }

        System.out.printf("It's %d degrees, get your %s and %s.",degrease,outfit,shoes );















    }
}
