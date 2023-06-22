

public class Main {
    public static void main(String[] args) {
        CalculateService calculateService=new CalculateService();
        calculateService.calculate("+",10.0,10.1);
        calculateService.calculate("-",10.0,10.1);
        calculateService.calculate("*",10.0,10.1);
        calculateService.calculate("/",10.0,10.1);
    }
}