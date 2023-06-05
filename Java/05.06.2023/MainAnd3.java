class MainAnd3{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalAnd3 logicalOperator1 = new LogicalAnd3();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAnd3Operator(false,true));
		
	// three parameter
		LogicalAnd3 logicalOperator2 = new LogicalAnd3();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAnd3Operator(false,false,true));
	
	//four parameter
		LogicalAnd3 logicalOperator3 = new LogicalAnd3();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAnd3Operator(true,false,false,true));
		
	// five parameter
		LogicalAnd3 logicalOperator4 = new LogicalAnd3();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAnd3Operator(false,false,false,true,false));
	}
}