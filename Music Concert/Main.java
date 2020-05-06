#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,a[50],i,odd=0,even=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even++;
    }
    else
    {
      odd++;
    }
  }
  cout<<odd<<endl<<even;
  return 0;
}