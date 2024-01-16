#include<stdio.h>
int main(){
    int n,i,a[n],j=0,k=0,even[j],odd[k];
    printf("enter the size of array");
    scanf("%d",&a[n]);
    printf("enter the element of an array");
    for(i=0;i<n;i++){
        scanf("%d",a[i]);
    }
    for(i=0;i<n;i++){
        printf("%d",a[i]);

    }
    for(i=0;i<n;i++){
        if(a[i]%2==0){
            even[j]=a[i];
            
        }
        else{
            odd[k]=a[i];
        }
    }
        printf("\n\n");
        printf("the even array is:");
        for(i=0;i<n;i++){
            printf("%d",even[i]);
        }
        printf("\n\n");
        printf("odd array is :");
        for(i=0;i<n;i++){
            printf("%d",odd[i]);
        }
        return 0;

    
}