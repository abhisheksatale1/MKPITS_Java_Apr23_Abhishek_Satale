import BankApp.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the:-\n 1=Deposit \n 2=withdrow \n 3,4,5,6,7,8,9...=balance");
        int number=scanner.nextInt();


        switch(number) {
            case 1://deposite case
                Depoiste deposite=new Depoiste();
                System.out.println("Enter amount:-");
                Long amount1=scanner.nextLong();
                try {
                    deposite.addAmount(amount1);
                } catch (DepoException de) {
                    DepoException depoException=new DepoException();

                    System.out.println(de);
                    System.out.println(depoException.lessAmount());
                } catch (Exception e) {

//e.printStackTrace();
                }
                break;
            case 2:
                Withroled withroled=new Withroled();
                Bank bank=new Bank();
                System.out.println("The balance is:- "+bank.getBalance());
                System.out.println("Enter Amount that you want to withdrow:- ");
                Long amount2=scanner.nextLong();
                try {
                    withroled.getAmount(amount2);
                } catch (Withdrow e) {
                    System.out.println(e.notAmount());
//e.printStackTrace();
                }
                break;
            default :
                Bank bank2=new Bank();
                System.out.println("The balance of given customer:- ");
                System.out.println("Bank name:- "+bank2.getBankName());
                System.out.println("Customer name:- "+bank2.getCustomerName());
                System.out.println("balence:- "+bank2.getBalance());
        }

    }
}
