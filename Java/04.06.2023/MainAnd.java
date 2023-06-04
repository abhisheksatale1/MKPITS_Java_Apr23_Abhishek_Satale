class MainAnd{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalAnd logicalOperator1 = new LogicalAnd();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.logicalAndOperator(true,true));
		
	// three parameter
		LogicalAnd logicalOperator2 = new LogicalAnd();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.logicalAndOperator(true,false,true));
	
	//four parameter
		LogicalAnd logicalOperator3 = new LogicalAnd();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.logicalAndOperator(true,false,true,false));
		
	// five parameter
		LogicalAnd logicalOperator4 = new LogicalAnd();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.logicalAndOperator(true,true,false,false,true));
	}
}