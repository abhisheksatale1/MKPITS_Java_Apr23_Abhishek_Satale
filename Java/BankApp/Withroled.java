package BankApp;

public class Withroled {
    public static void getAmount(Long amount) throws Withdrow {

        Bank  bank=new Bank();
        Long balence=bank.getBalance();
        if(balence<amount) {
            throw new Withdrow();
        }
        else {

            balence=balence-amount;
            bank.setBalance(balence);
            System.out.println("amount withdrow:- "+amount);
        }
        System.out.println("Bank name:- "+bank.getBankName());
        System.out.println("Customer name:- "+bank.getCustomerName());
        System.out.println("balence:- "+bank.getBalance());

    }
}
