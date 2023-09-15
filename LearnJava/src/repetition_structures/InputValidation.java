package repetition_structures;

import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        double maxHours = 40;
        double salaryPerHour = 15;
        System.out.println("Enter the hours worked int the week");
        Scanner scanner = new Scanner(System.in);
        double hoursWorked = scanner.nextDouble();
        while(hoursWorked > maxHours || hoursWorked < 0){
            System.out.println("Error Invalid Hours, You have to write between 0 to 40");
            hoursWorked = scanner.nextDouble();
        }
        scanner.close();
        double salary = hoursWorked * salaryPerHour;
        System.out.println("Your Salary is :" + salary);
    }
}
