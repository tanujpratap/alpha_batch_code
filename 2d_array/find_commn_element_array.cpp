#include<iostream>
using namespace std;
int main(){
    int duplicate=0;
   int a[]={1,2,3,4};
   
   int sizea=4;
   int b[]={4,5,6,7};
   int sizeb=4;
   int c[]={4,8,9,10};
   int sizec=4;
   for(int i=0;i<sizea;i++){
    for(int j=0;j<sizeb;j++){
       if(a[i]==b[j]){
duplicate=a[i];
       }
        }
    }
    for(int k=0;k<sizec;k++){
        if(duplicate==c[k]){
            cout<<duplicate;
        }
    }
   }
