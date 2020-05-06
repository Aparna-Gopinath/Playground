#include <iostream>
int main() 
{
	// Type your code here
  int reverse=0,remainder,n;
  std::cin>>n;
  while(n!=0)
  {
    remainder=n%10;
    reverse=reverse*10+remainder;
    n/=10;
  }
  std::cout<<reverse;
	return 0;
}