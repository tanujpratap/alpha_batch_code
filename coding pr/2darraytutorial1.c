#include<stdio.h>
int main(){
    int a[2][3],i,j;
   printf("enter the element  matrix:");
    
    for(i=0;i<2;i++){
        for(j=0;j<3;j++){
            scanf("%d",&a[i][j]);
        }
    }
    printf("matrix\n");
    for(i=0;i<2;i++){
        for(j=0;j<3;j++){
            printf("%d",a[i][j]);
        }
        printf("\t");
    }
    printf("transpose matrix is\n");
    for(i=0;i<3;i++){
        for(j=0;j<2;j++){
            printf("%d\t",a[j][i]);
        }
        
        printf("\n");
    }
return 0;

}