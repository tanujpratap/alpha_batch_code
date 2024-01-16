#include<stdio.h>
int main(){
    int i,j,a[50],n,found=0;
    printf("enter the size of array");
    scanf("%d",&n);
    printf("\n enter the elements of an array");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<n-1;i++){
        for(j=i+1;j<n;j++){
            if(a[i]!=a[j]){
                found=found+1;
            }
        }
    }
    printf("the unique number is:");
    for(i=0;i<n;i++){
        printf("%d",a[i]);
    }
}