//wap to compare using str cmp
#include<stdio.h>
#include<string.h>
int main(){
char s1[30];
char s2[30];
int value,same,notsame;
printf("enter the first string");
gets(s1);
printf("enter the second string");
gets(s2);
value=strcmp(s1,s2);
if(value==0){
    printf("same");


}
else{
    printf("not same");

}
printf("%d",value);
}