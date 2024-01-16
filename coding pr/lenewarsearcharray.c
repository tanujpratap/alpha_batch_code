#include<stdio.h>
int main(){
    int a[5],i,found=0,ele=5;
    printf("enter the elements of an array:");
    
    for(i=0;i<5;i++){
        scanf("%d",&a[i]);
    }
    for(i=0;i<5;i++){
        if(a[i]==ele){
            found=1;
            printf("found");
        
        
        }
       
        
        
    
    }
    return 0;
    
}