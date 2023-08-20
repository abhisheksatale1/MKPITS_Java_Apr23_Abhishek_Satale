//no agrument with no return type
#include<stdio.h>
#include<conio.h>
void funt(){
char ch;
scanf("%c",&ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
printf("this is vowel");}
else{
printf("this is consonant");
}
}
void main(){
funt();
getch();
}