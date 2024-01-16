#include<stdio.h>
int main(){
    int i, a[10],even=0,odd=0;
    printf("enter rhe elements of an array");
    for(i=0;i<10;i++){
        scanf("%d\n",&a[i]);
    }
    for(i=0;i<10;i++){
        if(a[i]%2==0)
        even=even+1;
        else 
        odd=odd+1;
    }
    printf("%d\n",even);
    printf("%d\n",odd);
    return 0;

}