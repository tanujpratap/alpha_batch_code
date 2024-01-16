#include<stdio.h>
int sum(int a,int b);
int main(){
    int c;
    c=sum(10000,5);
    printf("the value of c is %d\n",c);
    return c;
}
int sum(int a,int b){
    int c;
    c=a+b;
    return c;

}