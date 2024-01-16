#include<stdio.h>
int main(){
    int i,n,a[10],temp;
    printf("enter the size of an array");
    scanf("%d",&n);
    printf("enter the elements of an array");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);

    }
    for(i=0;i<n/2;i++){
        temp=a[i];
        a[i]=a[n-i-1];
        a[n-i-1]=temp;
    }
    printf("the reverse array is \n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;

    }
