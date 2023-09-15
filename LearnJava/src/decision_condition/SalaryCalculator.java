package decision_condition;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){
        double salary = 1000;
        double bonus = 350;
        int salesExpected = 10;
        System.out.println("How many sales did the employee do ?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        if (sales > salesExpected){
            salary = salary + bonus;
        }
        System.out.println("Your Salary : "+ salary);

    }
}
