#include<iostream>
using namespace std;
int main()
{
  int n,a,c,sum,sum1;
  cin>>n;
  while(n>0)
  {
    a=n%10;
    n=n/10;
    c=a%2;
    if(c==0)
    {sum=sum+a;
    }
    else
      sum1=sum1+a;
  }
  if(sum==sum1)
    cout<<"Yes";
  else
    cout<<"No";
}