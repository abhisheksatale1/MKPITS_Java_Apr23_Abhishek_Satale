public class CAlculationService {
    void Calculate(String oprend){

        switch (oprend){

            case "+":
                AddValue addValue = new AddValue();
                addValue.getCAlculatedValue(3,4);
				break;
            case "-":
                SubValue subValue= new SubValue();
                subValue.getCAlculatedValue(3,4);
				break;
			case "*":
                MulValue mulValue= new MulValue();
                mulValue.getCAlculatedValue(3,4);
				break;

			case "/":
                DivValue divValue= new DivValue();
                divValue.getCAlculatedValue(3,4);
				break;
				
        }
    }
}
