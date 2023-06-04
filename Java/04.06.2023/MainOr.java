class MainOr{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalOr logicalOperator1 = new LogicalOr();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.LogicalOrOperator(true,true));
		
	// three parameter
		LogicalOr logicalOperator2 = new LogicalOr();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.LogicalOrOperator(true,false,true));
	
	//four parameter
		LogicalOr logicalOperator3 = new LogicalOr();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.LogicalOrOperator(true,false,true,false));
		
	// five parameter
		LogicalOr logicalOperator4 = new LogicalOr();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.LogicalOrOperator(true,true,false,false,true));
	}
}