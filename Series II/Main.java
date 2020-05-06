#include<iostream>
using namespace std;
int main(){
  int a,s=11;
  cin>>a;
  while(a!=0){
    cout<<s*s<<" ";
    s+=4;a--;
  }
}