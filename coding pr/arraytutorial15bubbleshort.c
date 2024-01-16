#include<stdio.h>
int main(){
    int i,j,n,a[50],temp=0;
    printf("enter the size of an array:");
    scanf("%d",&n);
    printf("enter the elements of an array");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++){
        for(j=0;j<n-i-1;j++){
            if(a[j]<a[j+1]){
                a[j]=temp;
                a[j]=a[j+1];
                a[j-1]=temp;

            }

        }
    }
    printf("\n the sorted array is:");
    for(i=0;i<n;i++){
    printf("%d ",a[i]);
    }
}