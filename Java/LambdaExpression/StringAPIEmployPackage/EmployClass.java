package StringAPIEmployPackage;

public class EmployClass {
   private String name;
    private int Payment;

    @Override
    public String toString() {
        return "EmployClass{" +
                "name='" + name + '\'' +
                ", Payment=" + Payment +
                '}';
    }

    public EmployClass(String name, int payment) {
        this.name = name;
        Payment = payment;
    }
}
