class Calculation{
	
	//--------Argument with no returntype-------
	
	public void addition(int number1, int number2){
		int sum= number1+ number2;
		System.out.println("Addition of 2-numbers = "+sum);
		
	}
	//--------Argument with  returntype-------
	
	public int subtraction(int number3, int number4){
		return number3 - number4;
	}
	

	//--------No Argument with  returntype -------
	
	public int multiplication(){
		int number5=7,number6=8;
		return number5 * number6;
		
	}
	
	//--------No Argument with  No returntype -------

     public void division(){
		 double number7=15, number8=12;
		 double divide=number7/number8;
		 System.out.println("Division of 2-numbers = "+divide);

	 }
	 
	 	//-------- Argument with  returntype -------
		
		public int addition1 (int number9 ,int number10 ){
			return number9+ number10 ;
		}

		
		 	//-------- Argument with  no returntype -------

		public void addition (int number1,int number2)
		

public static void main(int number1,int number2){
	int sum=number1s
    Calculation cal=new Calculation(); //Create object
	cal.addition(8,9);
	
	
	int substract =cal.subtraction(10,6);
	System.out.println("Subtraction of 2-numbers = "+substract);
	
	int multiple=cal.multiplication();
		System.out.println("Multiplication of 2-numbers = "+multiple);

     cal.division();
	 
	
int add1=cal.addition1(23,45);

System.out.println("adition of 2 number" +add1);
}
}