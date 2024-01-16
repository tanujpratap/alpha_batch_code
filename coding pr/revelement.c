#include<stdio.h>
int main(){
    int n,a[50],i,temp;
    printf("enter the sizze of array");
    scanf("%d",&n);
    printf("enter the element of and array");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);

    }
    for(i=0;i<n/2;i++){
        temp=a[i];
        a[i]=a[n-1-i];
        a[n-1-i]=temp;

    }


    printf("the reverse element is \n");
        for(i=0;i<n;i++){
            printf("%d\n ",a[i]);
           
        
    
}
}