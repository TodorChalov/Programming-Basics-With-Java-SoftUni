package ConditionalStatementsExercises;

import java.util.Scanner;

public class P01SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int sumSec = timeFirst + timeSecond + timeThird;

        int min = sumSec / 60;
        int sec = sumSec % 60;

        if (sec < 10){
            System.out.printf("%d:0%d", min , sec);

        }else{
            System.out.printf("%d:%d", min , sec );
        }
    }
}
