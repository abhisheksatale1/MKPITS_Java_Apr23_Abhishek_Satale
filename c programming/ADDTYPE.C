#include<stdio.h>
#include<conio.h>
int fun()
{
int a,b,add;
printf("enter the number");
scanf("%d%d",&a,&b);
add=a+b;
return add;
}
void main()
{
int s=fun();
printf("%d",s);
getch();
}