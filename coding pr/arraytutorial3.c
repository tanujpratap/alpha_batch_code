#include<stdio.h>
int main(){
    int i,mark[10],sum=0;
    float avg;
    printf("enter the elements of an array");
    for(i=0;i<9;i++){
    scanf("%d",&mark[i]);
    }
    for(i=0;i<9;i++){
        sum=sum+mark[i];
        printf("%d\n",mark[i]);
        printf("%d\n",sum);
    }
    avg=sum/10;
    printf("%f\n",avg);
    return 0;

}