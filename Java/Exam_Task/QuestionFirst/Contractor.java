package QuestionFirst;


    public class Contractor extends Employ{

        public double calculateSalary( double paymentPerHour, double workinghour){
            double payment=paymentPerHour*(workinghour*30);
            return payment;
        }
    }

