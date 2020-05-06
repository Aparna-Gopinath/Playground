#include<iostream>
int main()
{
  int a,b,c;
  std::cin>>a>>b>>c;
  if(c>=9)
    std::cout<<"Sorry Doctor! You need more bacteria.";
  else
    std::cout<<"Doctor, you can proceed with your experiment.";
}