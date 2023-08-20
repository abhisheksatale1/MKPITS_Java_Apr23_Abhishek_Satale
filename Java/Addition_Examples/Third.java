class Add{
public float Addfloat(float number1, float number2){
	return number1+ number2;
}
}
class Third{
	public static void main(String[]args){
		float ans;
		Add ad =new Add();
		ans=ad.Addfloat(23.23f, 34.23f);
		System.out.println(ans);
	}
}