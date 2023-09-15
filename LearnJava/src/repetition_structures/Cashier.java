package repetition_structures;

import java.util.Scanner;

public class Cashier {
    public static void main(String[] args) {
        System.out.println("Enter the number of items");
        Scanner scanner = new Scanner(System.in);
        int numberOfItems = scanner.nextInt();
        int total = 0;
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("Enter the price" + (i+=1));
            int price = scanner.nextInt();
            total = total + price;
        }
        scanner.close();
        System.out.println("Your total is :"+total);
    }
}
