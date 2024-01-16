#include<stdio.h>
int main(){
    int i;
    char name[30];
    printf("enter the string:");
    gets(name);
    for(i=0;name[i]!='\0';i++){
        if(name[i]>=65&&name[i]<=90){
            name[i]=name[i]+32;
        }
    }
    puts(name);
}