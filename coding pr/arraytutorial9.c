#include<stdio.h>
int main(){
    int i,a[10],positives=0,negatives=0,zero=0;
    printf("enter the elements of  an array");
    for(i=0;i<10;i++){
    scanf("%d",&a[i]);
    }
    for(i=0;i<10;i++){
        if(a[i]>0)
        positives=positives+1;
        else if(a[i]<0)
        negatives=negatives+1;
        else
        zero=zero+1;
    }
    printf("%d\n",positives);
    printf("%d\n",negatives);
    printf("%d\n",zero);
    return 0;
}