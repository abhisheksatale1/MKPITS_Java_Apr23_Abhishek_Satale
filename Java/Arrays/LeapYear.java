import java.util.Scanner;

public class LeapYear {

    public void LeapYearVerification (){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year: ");
        long year = scanner.nextInt();

        boolean isLeapYear = false;

        if (year % 400 == 0) {
            isLeapYear = true;
        } else if (year % 4 == 0 && year % 100 != 0) {
            isLeapYear = true;
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
