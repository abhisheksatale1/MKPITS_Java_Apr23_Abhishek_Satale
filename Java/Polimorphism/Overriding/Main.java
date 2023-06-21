class Main{
	public static void main (String []args){
		Vehical vehical = new Bike();
		vehical.run();
		
		Bag b = new Packet();
		b.pack();
		
		
		Addition add = new Addition1();
		float addition = add.Add(4,5);
		System.out.println(addition);
		
		
		SubstractionOverriding subtraction = new Substraction();
		double substra = subtraction.Sub(5, 4);
		System.out.println(substra);
		
		MultiplactionOverriding multiplaction = new Multiplaction();
		long mul = multiplaction.multi(68566,86565);
		System.out.println(mul);
		
		DivisionOverriding division = new Division();
		int divisi = division.div(55,5);
		System.out.println(divisi);
		
		
		ModulusOverriding modulus = new Modulus();
		float modu = modulus.modul(5,6,7);
		System.out.println(modu);
	}
}

