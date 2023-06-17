class MainAnd2{
	public static void main(String[] args){
	//logical operator using four parameter
		LogicalAnd2 logicalOperator1 = new LogicalAnd2();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator1.LogicalAnd1Operator(true,true,true, true));
	
	
	    LogicalAnd2 logicalOperator2 = new LogicalAnd2();
	    System.out.println("The value of given logical operator using four parameter is : " + logicalOperator2.LogicalAnd2Operator(true,true,true,false));
		
		LogicalAnd2 logicalOperator3= new LogicalAnd2();
		System.out.println("The value of given logical operator using four parameter is :" + logicalOperator3.LogicalAnd3Operator(true,true,false,false));
		
		
	}
	
}
