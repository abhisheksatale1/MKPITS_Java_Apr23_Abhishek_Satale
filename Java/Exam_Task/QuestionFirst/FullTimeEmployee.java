package QuestionFirst;

public class FullTimeEmployee {
    public class FullTimeEmploy extends Employ {
        public double calculateSalary(double paymentPerHour, double workinghour) {
            double payment = paymentPerHour * workinghour;
            return payment;
        }
    }
}
