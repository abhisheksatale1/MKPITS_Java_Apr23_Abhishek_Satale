class Main5{
	public static void main (String [] args){
		// Modulus
		// Integer 
		ArthmaticModulus modulus = new ArthmaticModulus();
		System.out.println("modulus of two Integer is :" + (modulus. ModulusInteger(45,5)));
	
		// Float 
		ArthmaticModulus modulus1 = new ArthmaticModulus();
		System.out.println("modulus of two Float is :" + (modulus1. ModulusFloat(45.2f,43.4f)));
		
		//Double 
		ArthmaticModulus modulus2 = new ArthmaticModulus();
		System.out.println("modulus of two Double is :"+ (modulus2. ModulusDouble(45.34, 45.32)));
		
		// Long 
		ArthmaticModulus modulus3 =new ArthmaticModulus();
		System.out.println("modulus of two Long is :" + (modulus3. ModulusLong(34534, 53223)));
	
	}	
}