class StarPatternHolloRectangle{
	public void holorectangle(){
		
		// outer loop
		for(int rowcounter=1;rowcounter<=4;rowcounter++){
			//inner loop
			for(int columncounter=1;columncounter<=5;columncounter++){
				if(rowcounter==1||columncounter==1||rowcounter==4||columncounter==5){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println(" ");
			}
			
		}
}		
			
		