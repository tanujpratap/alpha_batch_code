#include<stdio.h>
#include<string.h>
int main(){

    int temp,n ,i;
    char name[30];
    printf("enter the string");
    gets(name);
    n=strlen(name);
    for(i=0;i<n/2;i++){
        temp=name[i];
        name[i]=name[n-i-1];
        name[n-i-1]=temp;
    
        puts(name);


    }
    
}