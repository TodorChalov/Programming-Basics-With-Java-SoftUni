package ConditionalStatementsExercises;

import java.util.Scanner;

public class P05GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double budgetMove = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double cloutsOneStatist = Double.parseDouble(scanner.nextLine());


        //•	Декорът за филма е на стойност 10% от бюджета.
        //•	При повече от 150 статиста,  има отстъпка за облеклото на стойност 10%.

        double priceDecor = budgetMove * 0.10;
        double priceClouts = statists * cloutsOneStatist;

        if (statists > 150) {
            priceClouts = priceClouts * 0.90;
        }

        double totalSum = priceDecor + priceClouts;

        double diff = Math.abs(budgetMove - totalSum);

        if (budgetMove >= totalSum) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);

        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", diff);
        }


    }
}
