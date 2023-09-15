package decision_condition;

import java.util.Scanner;

public class GradeMessage {
    public static void main(String[] args){
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        char grade = scanner.next().charAt(0);
        scanner.close();
        String message;
        switch (grade){
            case 'A' :
                message = "Excellent job!";
                break;
            case 'B' :
                message = "Great job!";
                break;
            case 'C' :
            message = "Good job!";
                break;
            case 'D' :
                message = "You need to work a bit harder";
                break;
            case 'F' :
                message = "Uh oh";
                break;
            default:
                message = "Error!!! Invalid n grade";
                break;
        }
        System.out.println(message);
    }
}
