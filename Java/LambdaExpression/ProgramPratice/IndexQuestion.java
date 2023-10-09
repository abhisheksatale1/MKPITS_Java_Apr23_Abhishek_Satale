package ProgramPratice;

import java.util.Scanner;

public class IndexQuestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index");
        int index = scanner.nextInt();
        int number =(index*10)+2;
        if (number%10==2)
            System.out.println(number);
        else
            System.out.println("Invalid Number");
    }
}
