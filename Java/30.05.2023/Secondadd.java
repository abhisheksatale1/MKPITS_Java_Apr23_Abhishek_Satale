class Add{
public long Addlong (long number1, long number2){
	return number1+number2;
	}
	}
	class Secondadd{
	public static void main(String[]args){
		long ans;
		Add ad = new Add();
		ans= ad.Addlong(283728, 27823782);
		System.out.println(ans);
	}
	}