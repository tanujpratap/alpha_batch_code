#include<stdio.h>
int sum(){
    int sum=0,a,b;
    printf("enter the two number");
    scanf("%d%d\n",&a,&b);
    sum=a+b;
printf("%d",sum);

}
int main(){
    sum();
    printf("hello");
    sum();
    sum();
}