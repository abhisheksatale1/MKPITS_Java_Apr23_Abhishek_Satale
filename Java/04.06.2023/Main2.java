class Main2{
	public static void main (String []args){
		// Substraction Operator 
		
		//Substraction Operator using Integer datatype
		ArthmaticSubstraction substratction = new ArthmaticSubstraction();
		System.out.println("Substraction of two Integer is :" + (substratction.SubstractionInteger(54, 35)));
		
		// Substraction Operator using Float datatype
		ArthmaticSubstraction substraction1 = new ArthmaticSubstraction();
		System.out.println("Substraction of two Float is :" + (substraction1.SubstractionFloat(4.5f, 5.6f)));
		
		//Substraction Operator using Double datatype
		ArthmaticSubstraction substraction2 = new ArthmaticSubstraction();
		System.out.println("Substraction of two Double is :" + (substraction2.SubstractionDouble(45.45d, 65.45d)));
		
		//Substraction Operator using Long datatype 
		ArthmaticSubstraction substraction3 = new ArthmaticSubstraction();
		System.out.println("Substraction of two Long is :" + (substraction3.SubstractionLong(4567, 8876)));
	}
}