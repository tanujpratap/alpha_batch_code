#include<stdio.h>
int main(){
int r,n,sum=0,temp;
printf("enter the number \n");
scanf("%d",&n);
temp=n;
while(n>0){
    
 r=n%10;
sum=sum+(r*r*r);
n=n/10;
}
if(temp==sum)
printf("armstrong number");
else
printf("not armstrong");
return 0;
}
