import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println((a)+"even"); // true
        System.out.println((b)+"odd"); // false


        if (a%2==0){
            System.out.println("number is even");
        } else if (a%2!=0) {
            System.out.println("number is odd");

        }
        else {
            System.out.println(0);
        }
    }

//    public static boolean isPrime(int n) {
//        if (n == 0 || n == 1) {
//            return false;
//        }
//        if (n == 2) {
//            return true;
//        }
//        for (int i = 2; i <= n / 2; i++) {
//            if (n % i == 0) {
//                return false;
//            }
//        }
//
//        return true;
//    }

}