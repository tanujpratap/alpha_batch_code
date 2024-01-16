#include<stdio.h>
int main(){
    int i,arr[7]={12,67,45,34,87,90};
    for(i=2;i<=5;i++){
    arr[i]=arr[i+1];
    printf("%d ",arr[i]);
    }
    return 0;
}