package repetition_structures;

import java.util.Arrays;
import java.util.Scanner;

public class AvergeTest {
    public static void main(String[] args) {
        System.out.println("Enter how many Students there are");
        Scanner scanner = new Scanner(System.in);
        int numberStudent = scanner.nextInt();
        int average = 0;
        int numberGrades = 0;
        int totalOfAllScores = 0;
        for (int i = 0 ; i < numberStudent ; i++){
            System.out.println("Enter how many grades he have");
            numberGrades = scanner.nextInt();
            int total = 0;
            for (int j = 0 ; j < numberGrades ; j++){
                System.out.println("Enter the test Score");
                int testScore = scanner.nextInt();
                total = total + testScore;
                System.out.println(total);
            }
            totalOfAllScores = totalOfAllScores + total;
        }
        average = totalOfAllScores/numberGrades;
        System.out.println("The average score is :" + average);

    }
}
