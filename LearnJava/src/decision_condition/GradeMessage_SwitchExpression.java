package decision_condition;

import java.util.Scanner;

public class GradeMessage_SwitchExpression {
    public static void main(String[] args){
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        scanner.close();
        String message = switch (grade){
            case 'A' -> "Excellent job!";
            case 'B' -> "Great job!";
            case 'C' -> "Good job!";
            case 'D' -> "You need to work a bit harder";
            case 'F' -> "Uh oh";
            default -> "Error!!! Invalid n grade";
        };
        System.out.println(message);

    }
}
