#include<stdio.h>
int main(){
    int i,j,rows,space;
    for(i=0;i<=5;i++){
        for(space=1;space<=rows-i;space--){
            printf(" ");
        }
        for(j=1;j<=i;j++){
            printf("* ");
        }
        printf("\n");
    } 
    return 0;

    
}