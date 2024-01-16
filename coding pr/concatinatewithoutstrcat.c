#include<stdio.h>
#include<string.h>
int main(){
    int len1,len2,i;
    char s1[30],s2[7];
    printf("enyter  the string");
    gets(s1);
    printf("enter the second string");
    gets(s2);
    strcat(s1,s2);
    len1=strlen(s1);
    len2=strlen(s2);
    for(i=0;i<=len2;i++){
        s1[len1+i]=s2[i];
        printf("the concatinate string is %s\n",s1);
    

    }




}