class MainAnd5{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalAnd5 logicalOperator1 = new LogicalAnd5();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAnd5Operator(true,true));
		
	// three parameter
		LogicalAnd5 logicalOperator2 = new LogicalAnd5();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAnd5Operator(true,true,true));
	
	//four parameter
		LogicalAnd5 logicalOperator3 = new LogicalAnd5();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAnd5Operator(true,true,true,true));
		
	// five parameter
		LogicalAnd5 logicalOperator4 = new LogicalAnd5();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAnd5Operator(true,true,true,true,true));
	}
}