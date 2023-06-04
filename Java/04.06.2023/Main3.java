class Main3{
	public static void main(String []args){
		// Multiplaction Operator 
		// Multiplaction Operator using Integer datatype
		ArthmaticMultiplaction multiplaction = new ArthmaticMultiplaction();
		System.out.println("Multiplaction of two Integer is :" + (multiplaction.MultiplactionInteger(45, 67)));
	
		// Float 
		ArthmaticMultiplaction multiplaction1 = new ArthmaticMultiplaction();
		System.out.println("Multiplaction of two Float is :" + (multiplaction1.MultiplactionFloat(45.3f, 45.2f)));
		
		//Double
		ArthmaticMultiplaction multiplaction2 = new ArthmaticMultiplaction();
		System.out.println("Multiplaction of two Double is :" +(multiplaction2.MultiplactionDouble(34.45d, 54.34d)));
		
		// Long 
		ArthmaticMultiplaction multiplaction3 = new ArthmaticMultiplaction();
		System.out.println("Multiplaction of two Long is :" +(multiplaction3.MultiplactionLong(3453, 6875)));
	}
}