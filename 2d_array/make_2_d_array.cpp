#include<iostream>
using namespace std;
int main(){
    int row=3;
    int col=4;
    int arr [row][col]={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){  
            cout<<arr[i][j]<<endl;
        }
    }
    return 0;
}