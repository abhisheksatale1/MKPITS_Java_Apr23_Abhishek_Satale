package intcal;
import ln.loan;
public class InterestCalculation {
    private final int rateOfInterest;
    public InterestCalculation() {
        rateOfInterest = 9;
    }
    public final void calculateInterest(String Accountnumber, int rateOfInterest, double amount, int duration){
        System.out.println("Rate of Interest= "+amount*rateOfInterest*duration/100);
    }
}