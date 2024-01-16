#include<stdio.h>
int main(){
    char name[30];
    printf("enter the string:");
    gets(name);
    strupr(name);
    puts(name);
}