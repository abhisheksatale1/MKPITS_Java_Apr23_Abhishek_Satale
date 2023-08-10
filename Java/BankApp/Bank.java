package BankApp;

public class Bank {
    private String bankName="HDFC";
    private String customerName;
    private Long balance;
    public Bank() {
        super();
        setCustomerName("swapnil_jounjalkar");
        setBalance(50000L);
    }
    public Bank(String bankName, String customerName, Long balance) {
        super();
        this.bankName = bankName;
        this.customerName = customerName;
        this.balance = balance;
    }
    public String getBankName() {
        return bankName;
    }
    public void setBankName(String bankName) {
        this.bankName = bankName;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public Long getBalance() {
        return balance;
    }
    public void setBalance(Long balance) {
        this.balance = balance;
    }


}

