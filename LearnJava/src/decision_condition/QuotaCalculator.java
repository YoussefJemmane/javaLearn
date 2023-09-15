package decision_condition;

import java.util.Scanner;

public class QuotaCalculator {
    public static void main(String[] args){
        int salesExpected = 10;
        System.out.println("How Many Sales do you made in this week");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        if (sales > salesExpected){
            System.out.println("Congratulations !!");
        }else{
            int leftSales = salesExpected - sales;
            System.out.println("Unfortunately " + leftSales + " Sales Left");
        }
    }
}
