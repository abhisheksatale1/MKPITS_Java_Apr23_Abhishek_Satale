package Enumprogram;

public class EnumbyUsingConstructor {
    public static void main(String args[]) {
        enum Months {
            january(31), february(28), march(31), april(30), may(31), June(30), July(31), August(30), September(31), October(30), November(31), December(31);
            int days;

            Months(int days) {
                this.days = days;
            }

        }

       // Scanner sc= new Scanner(System.in);
//        String month= sc.next();
        Months m = Months.february;
        switch (m) {
            case january:
            case february:
            case march:
            case april:
            case may:
            case June:
            case July:
//                System.out.println("31 days");break;
            case August:
            case September:
            case October:
            case November:
            case December:
                System.out.println("Index of Month"+" "+m.ordinal()+" "+m+ " " +m.days +"days");
        }
    }
    }


//
