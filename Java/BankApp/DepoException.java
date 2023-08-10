package BankApp;


    public class DepoException extends Exception {
        public String lessAmount() {
            return "Amount should be greater than 100 rupee!!";
        }

    }

