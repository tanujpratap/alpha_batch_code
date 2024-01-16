#include<stdio.h>
int main(){
    int j,a[50], i,n,r,rev=0;
    printf("enter the size of array");
    scanf("%d",&n);
    printf("enter the element of an array");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);

    }
    for(i=0;i<n;i++){
    while(j!=0){
        r=j%10;
        rev=rev*10+r;
        j=j/10;

    
    }
    }
    printf("after reversing\n");
    for(i=0;i<n;i++){
    printf("%d",a[i]);
    }
    return 0;


}