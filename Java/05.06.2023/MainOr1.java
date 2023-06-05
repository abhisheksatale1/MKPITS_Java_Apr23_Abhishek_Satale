class MainOr1{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalOr1 logicalOperator1 = new LogicalOr1();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.LogicalOr1Operator(true,false));
		
	// three parameter
		LogicalOr1 logicalOperator2 = new LogicalOr1();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.LogicalOr1Operator(true,false,true));
	
	//four parameter
		LogicalOr1 logicalOperator3 = new LogicalOr1();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.LogicalOr1Operator(true,false,true,false));
		
	// five parameter
		LogicalOr1 logicalOperator4 = new LogicalOr1();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.LogicalOr1Operator(true,true,false,false,true));
	}
}