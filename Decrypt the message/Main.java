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
  int a,b,c;
  cin>>a>>b;
  c=a+b;
  prft(c)==1?cout<<"They can read the message":cout<<"They can't read the message";
}