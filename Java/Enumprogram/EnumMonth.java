
package Enumprogram;

import java.util.Scanner;

public class EnumMonth {
    enum Months {
        january, february, march, april, may, June, July, August, September, October, November, December;
//        int days;
    }

    public static void main(String args[]) {
//        Scanner sc= new Scanner(System.in);
//        String month= sc.next();
        Months m = Months.january;
        switch (m) {
            case january:
            case february:
            case march:
            case april:
            case may:
            case June:
            case July:
                System.out.println("31 days");break;
            case August:
            case September:
            case October:
            case November:
            case December:
                System.out.println("30days");
        }
    }
}
