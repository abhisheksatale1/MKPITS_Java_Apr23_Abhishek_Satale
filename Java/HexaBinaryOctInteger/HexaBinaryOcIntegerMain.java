package HexaBinaryOctInteger;

import java.util.Scanner;

public class HexaBinaryOcIntegerMain {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        HexaBinaryOct hbo= new HexaBinaryOct();
        hbo.hexabinary(n);

    }
}
