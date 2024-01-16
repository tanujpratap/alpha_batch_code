#include<stdio.h>
int main(){
    int i,n,a[10],temp,j;
    printf("enter the size of an array");
    scanf("%d",&n);
    printf("enter the element of an array");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        for(j=0;j<n-1;j++){
            if(a[j]>a[j-1]){
            temp=a[j];
            a[j]=a[j-1];
            a[j-1]=temp;
            }

        }
    }
    printf("the bubble shorted array is \n");
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}