#include<stdio.h>
#include<conio.h>
void main () {
clrscr();
int num1, num2, num3, num4, res;
printf("enter the value");
scanf("%d%d%d%d",&num1,&num2,&num3,&num4);
res=(num1+num2)*(num3/num4);
printf("%d", res);
getch();
}