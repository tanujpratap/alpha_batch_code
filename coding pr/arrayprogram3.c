#include<stdio.h>
int main(){
   int a[5],b[5],i;
    printf("enter the elements of an array");
    for(i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<5;i++){
        b[i]=a[i];
        printf("%d",b[i]);
    }
return 0;
}