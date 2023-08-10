package BankApp;

public class Depoiste {
    public void addAmount(Long amount) throws DepoException {
        Bank bank=new Bank();
        Long balence=bank.getBalance();
        if(amount<100) {
            throw new  DepoException();
        }
        else {
            balence=amount+balence;
            bank.setBalance(balence);
        }
        System.out.println("Bank name:- "+bank.getBankName());
        System.out.println("Customer name:- "+bank.getCustomerName());
        System.out.println("balence:- "+bank.getBalance());
    }
}
