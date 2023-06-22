public class Main {
    public static void main(String[] args) {
        CAlculationService cAlculationService= new CAlculationService();
        cAlculationService.Calculate("-");
		cAlculationService.Calculate("+");
		cAlculationService.Calculate("*");
		cAlculationService.Calculate("/");
		cAlculationService.Calculate("%");
    }
	
		
}