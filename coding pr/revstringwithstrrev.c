#include<stdio.h>
#include<string.h>
int value;
int main(){
    char s1[30];
    printf("enter the string");
    gets(s1);
    strrev(s1);
    printf("%s",s1);
}