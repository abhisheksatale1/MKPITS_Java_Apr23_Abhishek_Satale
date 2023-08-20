class MainNot{
	public static void main(String[] args){
	//logical operator using two parameter
		LogicalNot logicalOperator1 = new LogicalNot();
		System.out.println("The value of given logical operator using two parameter is : " + logicalOperator1.LogicalNotOperator(true,true));
		
	// three parameter
		LogicalNot logicalOperator2 = new LogicalNot();
		System.out.println("The value of given logical operator using three parameter is : " + logicalOperator2.LogicalNotOperator(true,false,true));
	
	//four parameter
		LogicalNot logicalOperator3 = new LogicalNot();
		System.out.println("The value of given logical operator using four parameter is : " + logicalOperator3.LogicalNotOperator(true,false,true,false));
		
	// five parameter
		LogicalNot logicalOperator4 = new LogicalNot();
		System.out.println("The value of given logical operator using five parameter is : " + logicalOperator4.LogicalNotOperator(true,true,false,false,true));
	}
}