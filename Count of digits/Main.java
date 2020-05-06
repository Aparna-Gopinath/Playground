#include<iostream>
int main()
{
  // Type your code here
  int count=0,n;
  std::cin>>n;
  do
  {
    n=n/10;
    ++count;
  }
  while(n!=0);
    std::cout<< count;
  
}