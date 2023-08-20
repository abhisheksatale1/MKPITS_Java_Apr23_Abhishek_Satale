class MainAnd2{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalAnd2 logicalOperator1 = new LogicalAnd2();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAnd2Operator(false,false));
		
	// three parameter
		LogicalAnd2 logicalOperator2 = new LogicalAnd2();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAnd2Operator(false,true,false));
	
	//four parameter
		LogicalAnd2 logicalOperator3 = new LogicalAnd2();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAnd2Operator(false,true,false,true));
		
	// five parameter
		LogicalAnd2 logicalOperator4 = new LogicalAnd2();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAnd2Operator(false,true,false,true,false));
	}
}