#include<stdio.h>
int main(){
    int i,j,rows,space,num=1;
    printf("enter thev number of rows");
    scanf("%d",&rows);
    for(i=1;i<=rows;rows++){
        for(space=1;space<=rows-i;space++){
            printf(" ");
        }
            for(j=1;j<=i;j++){
                printf("%d",j);
                
                printf("%d",num);
                num++;
            }
        printf("\n");
    }
    return 0;
}