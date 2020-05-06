#include<iostream>
using namespace std;
int prft(int a){
  int temp=0;
  for(int i=1;i<a;i++){
    if(a%i==0)
      temp+=i;
  }
  if(temp==a)
    return 1;
  else
    return 0;
}
int main(){
  int a,b;
  cin>>a>>b;
  while(a<=b){
    if(prft(a)==1)
      cout<<a<<" ";
    a++;
  }
}