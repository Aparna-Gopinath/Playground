#include<iostream>
int gcd(int u,int v)
{
  return (v!=0)?gcd(v,u%v):u;
}
int main(void)
{
  int a,b,c;
  std::cin>>a>>b;
  c=gcd(a,b);
  if(gcd)
    std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<c;
  else
   std::cout<<"invalid";
  return 0;
}