#include<stdio.h>
int main(){
    char cat;
    char s1[30],s2[30];
    printf("enter the first string;");
    gets(s1);

    printf("enter the second string");
    gets(s2);
    strcat(s1,s2);
    printf("%s",s1,s2);

    
    
}