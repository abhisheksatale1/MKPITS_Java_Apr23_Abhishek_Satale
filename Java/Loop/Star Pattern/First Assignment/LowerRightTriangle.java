class LowerRightTriangle extends Main{
public void LowerRighttriangle(int number){
	int starrow=5;      
  
for (int row= starrow-1; row>=0 ; row--)  
{  
 
for (int column=0; column<=row; column++)  
{  

System.out.print("*" + " ");  
}  
  
System.out.println();  
}  
}  
}