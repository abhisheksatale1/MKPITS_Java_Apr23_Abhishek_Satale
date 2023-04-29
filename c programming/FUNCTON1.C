//argument with return type
#include<stdio.h>
#include<conio.h>
int funt(int x, int y){
    int c;
    clrscr();
    c=x+y;
    printf("%d",c);
    return c;
    }
    void main(){
    int a=5, b=10;
    funt(a,b);
    getch();
    }
