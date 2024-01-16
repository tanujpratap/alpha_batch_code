#include<stdio.h>
int main() {
    int i,a[10],even,odd;
    printf("enter the element of an array");
    for(i=0;i<10;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<10;i++){
        if(a[i]%2==0){
            even=even+1;
        }
        else{
            odd=odd+1;
        }
    }
        printf("%d ",even);
        printf("%d ",odd);


    
    return 0;
}