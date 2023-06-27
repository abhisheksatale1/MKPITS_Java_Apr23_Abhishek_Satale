class StarPattern1{
public static void main(String []args){
int n=5;
for(int i=1; i<=5;i++){
for (int j=1; j<=5;j++){
System.out.print(" ");
}
for (int k=1; k<=2 *i-j;k++){
System.out.println("*");
}
System.out.println();
}
}
}
