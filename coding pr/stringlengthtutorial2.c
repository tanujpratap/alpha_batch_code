#include<stdio.h>

int count=0;
int i;
int main(){
    char name[30];
    printf("enter the string");
    gets(name);
    while(name[i]!='\0'){
 count++;
 i++;
    }
    printf("the string length is -%d",count);
}