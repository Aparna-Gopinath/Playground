#include<iostream>
using namespace std;
int main(){
  int n,add=5,s=6;
  cin>>n;
  while(n!=0){
    cout<<s<<" ";
    s=s+add;
    add+=5;
    n--;
  }
}