#include<stdio.h>
int add(int a,int b);//function declaration/prototype

int main()
{
    int a,b,c;
    printf("Enter the numbers\n");
    scanf("%d %d",&a,&b);
   c= add(a,b);//function call---->a,b=actual arguments
   printf("%d is the sum",c);
}
int add(int a,int b)//fuction definition---->formal arguments
{
int c;
c=a+b;
return c;
}