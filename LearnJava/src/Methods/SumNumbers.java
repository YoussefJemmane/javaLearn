package Methods;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        int number1 = getNumber1();
        int number2 = getNumber2();
        sumNumbers(number2 , number1);
    }
    public static int getNumber1(){
        System.out.println("Enter the first number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        return number1;
    }

    public static int getNumber2(){
        System.out.println("Enter the second number");
        Scanner scanner = new Scanner(System.in);
        int number2 = scanner.nextInt();
        return number2;
    }

    public static void sumNumbers(int number1,int number2){
        System.out.println("The sum is :" + (number1+number2));
    }
}
