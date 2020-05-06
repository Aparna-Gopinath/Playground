#include<iostream>
int dgt(int n){
  int cnt=0;
  while(n>0){
    cnt+=1;
    n=n/10;
  }
  return cnt;
}
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    int exp=dgt(n),add=0;
  	int temp=n;
  while(n>0){
    add+=power(n%10,exp);
    n=n/10;
  }
  if(add==temp)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}