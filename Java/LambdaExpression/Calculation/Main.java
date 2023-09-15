package Calculation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Enter your choice /n 1. Addition of two number \n 2. Substraction of two number \n 3. Multiplaction of two number");
        int choice=scanner.nextInt();

        switch (choice){
            case 1:
                Calculation calculation = (num1, num2)->{
                    System.out.println(num1+num2);
                };
                calculation.calArea(a, b);

                break;
            case 2:
                Calculation calculation1 = (num1, num2) ->{
                    System.out.println(num1-num2);
                };
                calculation1.calArea(a,b);
                break;
            case 3:
                Calculation calculation2 = (num1, num2) ->{
                    System.out.println(num1*num2);
                };
                calculation2.calArea(a,b);
                break;
        }
    }
}
