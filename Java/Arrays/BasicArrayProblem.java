class BasicArrayProblem{
	public void BasicArray(){
		int rows = 5;
    char[] stars = new char[rows];
    for (int i = 0; i < rows; i++) {
      stars[i] = '*';
    }
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < rows; j++) {
        System.out.print(stars[j]);
      }
      System.out.println();
    }
  }

		
		public void BasicArray2(){
			int row=7;
		char [] stars = new char [row];
		for(int inner =0; inner<row;inner++){
			stars[inner]= '*';
		}
		for(int inner = 0; inner<row;inner++){
			for(int outer=0;outer<row;outer++){
				System.out.print(stars[inner]);
			}
			System.out.println();
		}
		}
		
		public void BasicArray3(){
			

      int rows = 5;
    char[] stars = new char[rows];
    for (int i = 0; i < rows; i++) {
      stars[i] = '*';
    }
    int[] pattern = new int[rows * 2];
    for (int i = 0; i < pattern.length; i++) {
      pattern[i] = i % rows;
    }
    for (int i = 0; i < pattern.length; i++) {
      System.out.print(stars[pattern[i]]);
    }
    System.out.println();
  }
  
		
		int rows=10;
		char[] stars = new char[columns];
		for (int i =0; i<rows; i++){
			
			
		
}

			