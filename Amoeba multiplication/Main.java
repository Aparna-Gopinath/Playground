#include<iostream>
using namespace std;
int main()
{
int n;
  cin>>n;
  int a[10000];
a[1]=0;
a[2]=1;
for(int i=3;i<=n;i++)
{
  a[i]=a[i-2]+a[i-1];
  
}
  cout<<a[n];
}