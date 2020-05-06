#include<iostream>
using namespace std;
int main()
{ 
  int r,c,d,n,i;
  cin>>r>>c>>n;
  for(i=1;i<=c;i++)
  {
   if(i==n)
     d=1;
  }
  for(i=1;i<r*c;i+=5)
  {
    if(i==n)
      d=1;
  }
  if(d==1)
    cout<<"Yes";
  else
    cout<<"No";
}