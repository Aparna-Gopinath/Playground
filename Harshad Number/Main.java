#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c=0;
  cin>>a;
  int d=a;
  while(a>0)
  {
b=a%10;
    a=a/10;
    c=c+b;
}
  if(d%c==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}