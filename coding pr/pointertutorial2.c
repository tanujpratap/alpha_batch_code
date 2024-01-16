#include<stdio.h>
int main(){
    char a=56;
    char *ptra=&a;
    printf("%d\n",ptra);
    printf("%d\n",ptra+5);
    return 0;
}