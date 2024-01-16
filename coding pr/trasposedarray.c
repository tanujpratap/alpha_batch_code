#include<stdio.h>
int main(){
    int m,n,i,j,sum=0;
    printf("enter the number of rows and  column:");
    scanf("%d%d",&m,&n);
    int a[m][n];
    if(m==n){
        printf("enter the elements");
    }
        for(i=0;i<m;i++){
            for(j=0;j<n;j++){
                scanf("%d",&a[i][j]);
                if(i==j||i+j==m-1){

               sum+=a[i][j];
                }
            
        }

    }
printf("the array created:\n");
for(i=0;i<m;i++){
    printf("\t");
    for(j=0;j<n;j++){
        printf("%d\t",a[j][i]);
    }
        printf("\n");
    }
printf("the sum of diagonal element is %d\n",sum);
return 0;
        }