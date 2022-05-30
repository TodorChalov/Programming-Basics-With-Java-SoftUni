package AdvancedConditionalStatemantsExsercisec;

import java.util.Scanner;

public class P01Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int cows = Integer.parseInt(scanner.nextLine());


      // •	Premiere – премиерна прожекция, на цена 12.00 лева.
      // •	Normal – стандартна прожекция, на цена 7.50 лева.
      // •	Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева.

        double price = 0;
        switch (type){
            case "Premiere":
                price = 12;

                break;
            case "Normal":
                price = 7.50;

                break;
            default:
                case"Discount":
                price = 5.00;

                break;
        }

        int allSeats= rows * cows;
        double totalPrice = allSeats * price;
        System.out.printf("%.2f leva",totalPrice);

    }
}
