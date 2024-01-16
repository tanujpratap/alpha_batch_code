#include<stdio.h>
int main(){
    int a[5],i,j,size,de=0;
    printf("define the number of elements in an array");
    scanf("%d",&size);

    printf("enter the elements of an array");
    for(i=0;i<size;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<size;i++){
        for(j=i+1;j<size;j++){

        
        if(a[i]==a[j])
        de=de+1;

        }
        printf("%d",de);
    }
 //   printf("%d",de);
    return 0;
}