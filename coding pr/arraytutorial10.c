#include<stdio.h>
int main(){
    int i,a[5],b[5],even,odd;
    printf("enter the elements of an array");
    for(i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<5;i++){
        if(a[i]%2==0)
        a[i]=even;
        else
        b[i]=odd;
    
        printf("%d\n",a[i]);
        
        printf(" %d\n",b[i]);
    }
    
    return 0;
}