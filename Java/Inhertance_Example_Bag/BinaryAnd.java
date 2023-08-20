class BinaryAnd{
public int And(int a, int b){
return a & b;
}
public static void main (String []args){
	BinaryAnd Or=new BinaryAnd();
	System.out.println(Or.And(01010,010101));
}
}