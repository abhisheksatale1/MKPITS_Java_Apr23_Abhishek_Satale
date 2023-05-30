class Add{
public double Adddouble (double number1, double number2){
	return number1+number2;
}
}
class Forthadd{
	public static void main (String []args){
		double ans;
		Add ad= new Add();
		ans= ad.Adddouble(2.34534d, 2.34335d);
		System.out.println(ans);
	}
}