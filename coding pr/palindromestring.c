#include<stdio.h>
#include<string.h>
void main(){
char str[40],rev[40];
int i,len,flag=1;
printf("enter the string:");
scanf("%[^\n]s",str);
len=strlen(str);
i=len;
while(i>0){
    rev[len-i]=str[i-1];
    i--;

}
for(i=0;i<len;i++){
    if(str[i]==rev[i])
    flag=1;
    else{
        flag=0;
        break;
    }
}
if(flag){
printf("the string is palindrome\n");
}
else{
printf("the strimng is non palindrome \n");
}
}