package ConditionalStatementsExercises;

import java.util.Scanner;

public class P03Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        int allMinutes = (hour * 60) + minutes + 15;

        int newHours = allMinutes / 60;
        int newMinutes = allMinutes % 60;


        if (newHours > 23) {
            newHours = 0;
            System.out.printf("%d:%02d", newHours, allMinutes);
        } else {

            System.out.printf("%d:%02d", newHours, allMinutes);
        }

    }
}
