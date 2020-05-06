#include<iostream>
using namespace std;
int main(){
  int n,i=1;
  cin>>n;
  for(;i<=4;i++){
    for(int j=1;j<=i;j++){
      cout<<n;}
    cout<<"\n";n++;
    }
  i--;n--;
  for(;i>=1;i--){
    for(int j=1;j<=i;j++)
        cout<<n;
     cout<<"\n";n--;
  }
}