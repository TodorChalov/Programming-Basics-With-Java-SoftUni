package ConditionalStatementsExercises;

import java.util.Scanner;

public class P04ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        //•	Пъзел - 2.60 лв.
        //•	Говореща кукла - 3 лв.
        //•	Плюшено мече - 4.10 лв.
        //•	Миньон - 8.20 лв.
        //•	Камионче - 2 лв.

        double allSumToys = (puzzle * 2.60) + (dolls * 3) + (bears * 4.10) + (minions * 8.20) + (trucks * 2);
        int allToys = puzzle + dolls + bears + minions + trucks;

            if (allToys >= 50) {

                allSumToys = allSumToys * 0.75;
            }


            allSumToys = allSumToys * 0.90;

        double diff = Math.abs(allSumToys - tripPrice);
        if (allSumToys >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.",diff);

        } else {
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }

}
