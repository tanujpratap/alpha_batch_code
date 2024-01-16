#include<iostream>
#include<limits.h>
#include<conio.h>
using namespace std;
int get_max(int arr[][3],int rows,int cols){
    int maxi=INT_MIN;
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
if(arr[i][j]>maxi){
    maxi=arr[i][j];
}
    }
}
return maxi;
}
int get_min(int arr[][3],int rows,int cols){
    int min=INT_MAX;
for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
if(arr[i][j]<min){
    min=arr[i][j];
}
    }
}
return min;
}

int main(){
    int arr[3][3]={{1,2,3},{4,5,6},{7,8,9}};
 
cout<<get_max(arr,3,3);
cout<<endl;
cout<<get_min(arr,3,3);

}