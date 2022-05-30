package ConditionalStatementsExercises;

import java.util.Scanner;

public class P02BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initPoints = Integer.parseInt(scanner.nextLine());

        double bonusPoints = 0;
        if (initPoints <= 100) {
            bonusPoints = 5;
        } else if (initPoints <= 1000) {
            bonusPoints = initPoints * 0.20;
        } else {
            bonusPoints = initPoints * 0.10;
        }

        if (initPoints % 2 == 0) {
            bonusPoints = bonusPoints + 1;
        }

        if (initPoints % 10 == 5) {
            bonusPoints = bonusPoints + 2;
        }

        System.out.println(bonusPoints);
        System.out.println(initPoints + bonusPoints);
    }
}