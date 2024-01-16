#include<stdio.h>
int main(){
    int i,a[10],b[10],c[10];
    printf("enter the elementsof first and second array\n");
    for(i=0;i<10;i++){
    scanf("%d %d",&a[i],&b[i]);
    }
    for(i=0;i<10;i++){
        c[i]=a[i]+b[i];
        printf("%d %d",a[i],b[i]);
        printf("%d ",c[i]);

    }
    return 0;
}