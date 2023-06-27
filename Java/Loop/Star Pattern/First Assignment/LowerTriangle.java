class LowerTriangle extends Main{
public void LowerTriangle(int number) {
        // LOWER HALF
      	int starrow=5;  
for (int row= 0; row<= starrow-1; row++)  
{  
for (int column=0; column<=row; column++)  
{  
System.out.print(" ");  
}  
for (int space=0; space<=starrow-1-row; space++)  
{  
System.out.print("*" + " ");  
}  
System.out.println();  
}  
}  
}  