#include<stdio.h>
int main(){
    int i,a[5],b[5],c[5];
    printf("enter the elements of first array");
    for(i=0;i<5;i++){
        scanf("%d\n",&a[i]);

    }
    printf("enter the elements of second array");
    for(i=0;i<5;i++){
        scanf("%d\n",&b[i]);
    }
    for(i=0;i<5;i++){
        c[i]=a[i]+b[i];
        printf("%d\n",c[i]);
        printf("%d\n",a[i]);
        printf("%d\n",b[i]);
    }
    return 0;
}