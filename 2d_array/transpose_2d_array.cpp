#include<iostream>
using namespace std;
int main(){
 int transpose[3][3];   
    int arr[][3]={{2,4,6},{1,3,5},{9,11,13}};
   
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++){
            transpose[i][j]=arr[j][i];
            cout<<transpose[i][j]<<" "; 

        }
        cout<<endl;
    }
    return 0;
}