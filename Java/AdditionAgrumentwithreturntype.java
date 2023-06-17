class AdditionAgrumentwithreturntype{
	public void addition (int number1, int number2){
		int sum=number1+number2;
		System.out.println("addition of two number"+sum);
	}
}


class main{
	public static void main (String args[]){
	AdditionAgrumentwithreturntype add = new AdditionAgrumentwithreturntype();
	add.addition(6,5);
}
}