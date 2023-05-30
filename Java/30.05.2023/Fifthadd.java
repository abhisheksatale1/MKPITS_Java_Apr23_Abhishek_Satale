class Add {
	public byte Addbyte (byte number1, byte number2){
		return number1+number2;
	}
}
class Fifthadd{
	public static void main(String []args){
		byte ans;
		Add ad=new Add();
		ans= ad.Addbyte(0.01, 0.03);
		System.out.println(ans);
	}
}