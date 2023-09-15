package repetition_structures;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean again;
        do {
            System.out.println("Enter the First Number");

            int firstNumber = scanner.nextInt();
            System.out.println("Enter the Second Number");

            int secondNumber = scanner.nextInt();
            int sum = firstNumber + secondNumber;
            System.out.println("Sum is :" + sum);
            System.out.println("Do you want to repeat 1 for Yes 0 for No");
            again = scanner.nextBoolean();

        }while(again);
    }
}
