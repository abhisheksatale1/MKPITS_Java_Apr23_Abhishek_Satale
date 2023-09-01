package Interface_Example;

import java.util.Scanner;

public class InterfaceThird implements InterfaceFirst, InterfaceSecond {
    Scanner scanner = new Scanner(System.in);


    @Override
    public void display() {
        System.out.println("Enter the choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
            InterfaceFirst.super.display();
            break;
            case 2:
            InterfaceSecond.super.display();
            break;
            default:
                System.out.println(".................");

        }
    }
}
