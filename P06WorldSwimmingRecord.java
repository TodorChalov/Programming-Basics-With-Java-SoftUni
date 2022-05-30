package ConditionalStatementsExercises;

import java.util.Scanner;

public class P06WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double worldRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timeInSec = Double.parseDouble(scanner.nextLine());


        double completeTime = distance * timeInSec;
        double addingTime = Math.floor(distance / 15) * 12.5;


        double allTime =completeTime + addingTime;

        if (allTime < worldRecord){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds." , allTime);
        }else{
            System.out.printf("No, he failed! He was %.2f seconds slower." , allTime-worldRecord);
        }


    }
}
