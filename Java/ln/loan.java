package ln;

import intcal.InterestCalculation;

public class loan extends InterestCalculation {
    private String AccountNumber;
    private int amount;
    private int duration;

    public loan(String accountNumber, int amount, int duration) {
        AccountNumber = accountNumber;
        this.amount = amount;
        this.duration = duration;
    }

    public int getAmount() {
        return amount;
    }

    public int getDuration() {
        return duration;
    }
//    public void calculate(){
//        int total = amount*duration;
//
//    }
}
