class Addition4{
	public int addInt(int number1, int number2){
		return( number1+number2);
	}
}
	class Addition2{
	public static void main(String[] args){
		int ans;
		
		Addition4 add =new Addition4();
		ans= add.addInt(15, 34);
		System.out.println(ans);
	}
}