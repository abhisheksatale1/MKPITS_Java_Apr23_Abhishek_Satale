class Add{
public int AddInt(int number1, int number2){
	return number1 + number2;
	}
	}
	class firstadd{
	public static void main(String args[]){
	int ans;
	 Add ad =new Add();
		ans= ad.AddInt(4,4);
		System.out.println(ans);
	}
}