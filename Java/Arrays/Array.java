public class Array{
	public static void main(String []args){
		int []age={3,5,6,7,8,4,6, 45, 34, 54, 52, 77, 
		22, 33, 44, 78, 99, 12, 15, 45, 66, 45, 33, 
		56, 43, 23, 78, 88, 54, 44, 3,5,6,7,8,4,6, 45 };
		 
		 
		 int sum =0; 
		for(int num=0;num<=age.length;num=num+4){
		 	
			sum=sum+(age[num]*age[num]);
			
						
					
		}
		System.out.print(sum);
			
		
	}
}