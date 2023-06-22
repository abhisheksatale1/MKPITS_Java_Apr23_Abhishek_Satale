
public class CalculateService {

    
    public void calculate(String Operator ,double operend1 ,double operend2 ){

        switch (Operator){

            case"+":
                CalculateAddition calculateAddition = new CalculateAddition();
				calculateAddition.getCalculateValue(operend1,operend2);
                System.out.println("Addition of 10.0 + 10.01 is==" + calculateAddition.getCalculateValue(operend1,operend2));

                break;
            case "-":
                CalculateSubtraction calculateSubtraction = new CalculateSubtraction();
               calculateSubtraction.getCalculateValue(operend1,operend2);
			   System.out.println("Subtraction of 10.0 - 10.01 is==" + calculateSubtraction.getCalculateValue(operend1,operend2));
                break;
            case "*":
                CalculateMultiplication calculateMultiplication = new CalculateMultiplication();
                calculateMultiplication.getCalculateValue(operend1,operend2);
				System.out.println("Multiplication of 10.0 * 10.01 is==" + calculateMultiplication.getCalculateValue(operend1,operend2));
                break;
            case "/":
                CalculateDivision calculateDivision = new CalculateDivision();
                calculateDivision.getCalculateValue(operend1,operend2);
				System.out.println("Division of 10.0 / 10.01 is==" + calculateDivision.getCalculateValue(operend1,operend2));
				break;

        }
    }
}
