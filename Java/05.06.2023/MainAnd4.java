class MainAnd4{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalAnd4 logicalOperator1 = new LogicalAnd4();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAnd4Operator(true,false));
		
	// three parameter
		LogicalAnd4 logicalOperator2 = new LogicalAnd4();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAnd4Operator(true,false,false));
	
	//four parameter
		LogicalAnd4 logicalOperator3 = new LogicalAnd4();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAnd4Operator(true,false,true,true));
		
	// five parameter
		LogicalAnd4 logicalOperator4 = new LogicalAnd4();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAnd4Operator(true,true,false,true,false));
	}
}