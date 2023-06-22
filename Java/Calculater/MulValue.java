public class MulValue extends CalculedDouble{
    @Override
	
    public void getCAlculatedValue(double operend1, double operend2) {
        double result = operend1*operend2;
        System.out.println("Multiplaciton  is :" +result);
    }
}