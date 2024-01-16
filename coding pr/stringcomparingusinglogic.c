#include<stdio.h>
#include<string.h>
int main(){
    int i,flag=0,notsame;
    char s1[30];
    char s2[40];
    printf("enter the first string");
    gets(s1);
    printf("enter the second string");
    gets(s2);
    for(i=0;s1[i]!='\0'&&s2[i]!='\0';i++){
        if(s1[i]!=s2[i]){
            flag=1;
            break;
            


        }
    }
    if(flag==0){
    printf("same");
    }
    else{
        puts("notsame");
    }
    
}