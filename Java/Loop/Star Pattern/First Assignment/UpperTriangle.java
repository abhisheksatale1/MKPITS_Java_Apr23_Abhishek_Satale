class UpperTriangle extends Main{
public void upperTriangle(int number){
	//Upper Half
	int row, column, starrow = 5;       
 
for (row=0; row<starrow; row++)   
{  
    
for (column=starrow-row; column>1; column--)   
{  
 
System.out.print(" ");   
}   
  
for (column=0; column<=row; column++)   
{   
      
System.out.print("* ");   
}   
  
System.out.println();   
}   
}   
}  
	