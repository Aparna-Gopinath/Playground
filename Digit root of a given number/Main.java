#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  int b=0;
  int c=9;
  if(n==0)
   std::cout<<b;
  else if(n%9==0)
    std::cout<<c;
  else
    std::cout<<n%9;
}