//overloding in Polymormorphism 
public class Main{
	public static void main(String []args){
		MultipleArgumentPolymorphism Poly =new MultipleArgumentPolymorphism();
		Poly.substraction("Abhishek", "Ashish");
	

	// using string data type overloding polymormorphism
		circle cir = new circle();
		cir.Areaofcircle();
		
	// addition int data type overloding polymormorphism
		Additionpolymorphism Add = new Additionpolymorphism();
		int sum =Add.additionInteger(3,4,5,6);
		System.out.println(sum);
		
		double sum1=Add.additionInteger(3,5);
		System.out.println(sum1);
	
	// substracition overloding polymormorphism
	
	Substractionpolymorphism sub = new Substractionpolymorphism();
	int sub2 = sub.substractionInteger(4,5,6,7);
	System.out.println(sub2);
	
	//division of 2 and 3 overloding Polymorphism
	
	DivisionPolymorphism Div = new DivisionPolymorphism();
	int division = Div.DivisionInteger(4,5,6);
	System.out.println(division);
	
	
	//Multiplaction of 2 and 3 overloding polymorphism
	
	MultiplactionPolymorphism Multi = new MultiplactionPolymorphism();
		double Multiplaction= Multi.Multiplactiondouble(5,6);
		System.out.println(Multiplaction);
		
	// Area of circle and area of area of Rectange
	
	Area area= new Area();
	double Area = area.areadouble(5);
	System.out.println(Area);
	
}
}