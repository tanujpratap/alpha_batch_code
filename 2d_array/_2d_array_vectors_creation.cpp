#include<iostream>
using namespace  std;
#include<vector>
int main(){
    int row=3;
    int col=3;
    vector<vector<int>>arr(row,vector<int>(col,-8));
    for(int i=0;i<row;i++){
        for(int j=0;j<arr[i].size();j++){
            cout<<arr[i][j];
        }
        cout<<endl;
    }
    return 0;
}
