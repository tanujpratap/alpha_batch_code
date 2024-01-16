#include<stdio.h>
int main(){
    int i,a[10],sum;
    float avg;
    printf("enter the elements of an array");
    for(i=0;i<9;i++){
        scanf("%d",&a[i]);

    }
    for(i=0;i<9;i++){
        sum=sum+a[i];
        printf("%d ",a[i]);
        printf("%d\n",sum);
    }
    avg=sum/10;
    printf("%f",avg);
    return 0;
}