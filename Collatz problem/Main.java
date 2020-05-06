#include<iostream>
using namespace std;
void printcollatz(int n)

{int i,count=0;

  
while(n!=1)
 {
  cout<<n<<"\n";
  {
    count++;}
if(n%2==0)
{
  n=n/2;
 
}
   else if(n%2!=0)
   {
n=3*n+1;
 }}
  cout<<n<<"\n";
  cout<<count;
}
int main()
{
int n;
  cin>>n;
  printcollatz(n);
  return 0;
}