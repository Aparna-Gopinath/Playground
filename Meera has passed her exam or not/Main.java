#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int i,n,a[50],pass,flag=0;
  cin>>n;
  for(i=0;i<n;i++)
  {
    cin>>a[i] ;
  }
  cin>>pass;
  for(i=0;i<n;i++)
  {
    if(a[i]==pass)
    {
      flag=flag+1;
    }
  }
  if(flag==1)
  {
    cout<<"She passed her exam";
  }
  else
  {
    cout<<"She failed";
  }
}