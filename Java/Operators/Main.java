class Main{
	public static void main(String []args){
		// Addition Operation 
		
		// Addition using Integer datatype
		ArithmaticOperator addition= new ArithmaticOperator();
		System.out.println("Addition of two Integer number is : " + (addition.additionInteger(40, 90)));
		
		// Addition using Float datatype
		ArithmaticOperator addition1 = new ArithmaticOperator();
		System.out.println("Addition of two Float number is : " + (addition1.additionFloat(40f, 90f)));
		
		// Addition using double datatype
		ArithmaticOperator addition2= new ArithmaticOperator();
		System.out.println("Addition of two Double number is : " + (addition2.additionDouble(40.56d, 56.89d)));
		
		// Additon using Long datatype
		ArithmaticOperator addition3= new ArithmaticOperator();
		System.out.println("Addition of two Long number is : " + (addition3.additionLong(5594, 3456)));
		
		// Addition using Short datatype
		//ArithmaticOperator addition4= new ArithmaticOperator();
		//System.out.println("Addition of two Short number is :" + (addition4.additionShort((short)4, (short)5)));
		
	}
} 

