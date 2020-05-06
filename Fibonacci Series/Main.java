#include<iostream>
using namespace std;
int fibonacci(int n)
{
  if(n<=1)
    return n;
  return fibonacci(n-1)+fibonacci(n-2);
}
int main()
{
  int n;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fibonacci(n-1); 
}