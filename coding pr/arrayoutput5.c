#include<stdio.h>
int main(){
    int i,arr[7]={12,67,45,34,87,90,23};
    for(i=7;i>=3;i--){ 
        arr[i-1]=arr[i];
        printf("%d ",arr[i]);


    }
    return 0;

    
}