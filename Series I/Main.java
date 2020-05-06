#include<iostream>
using namespace std;
int main(){
  int c,mul=1;
  float s=0.5;
  cin>>c;
  cout<<0.5<<" ";
  while(c-1!=0){
    s=s+mul;
    mul*=3;
    cout<<s<<" ";
    c--;
  }
}