#include <iostream> 
using namespace std; 
  
// function to find factorial of given number 
unsigned int factorial(unsigned int n) 
{ 
    if (n == 0) 
        return 1; 
    return n * factorial(n - 1); 
} 
int main() 
{ 
    int num ; 
  cin>>num;
    cout <<factorial(num)<< endl; 
    return 0; 
} 
