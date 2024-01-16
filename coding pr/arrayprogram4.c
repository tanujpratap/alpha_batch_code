#include<stdio.h>
int main(){
    int a[n],i, k,j,even[j],odd[k],sum=0,n;
printf("enter the size of an array\n");
scanf("%d",&n);
printf("enter the elements of an array");
for(i=0;i<n;i++){
    scanf("%d",&a[i]);
}
for(i=0 ;i<n;i++){
    if(a[i]%2==0){
        even[j]=a[i];
    }
        else{
            odd[k]=a[i];
        }
    
}
printf("\n");
printf("the array value is even value");
for(i=0;i<n;i++){
    printf("%d",even[j]);
}
printf("\n");
printf("the array value is odd value");
for(i=0;i<n;i++){
    printf("%d",odd[k]);
}
}