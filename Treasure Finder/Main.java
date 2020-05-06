#include<iostream>
using namespace std;
int main()
{
  int b1,b2,b3;
  cin>>b1>>b2>>b3;
  if(b1>=b2 && b1>=b3)
  {
    if(b2>=b3)
    {
      cout<<"The treasure is in box which has number "<<b2;
    }
    else
    {
      cout<<"The treasure is in box which has number "<<b3;
    }
  }
    else if(b2>b1 && b2>=b3)
      if(b1>=b3)
      {
        cout<<"The treasure is in box which has number "<<b1;
      }
    else
    {
     cout<<"The treasure is in box which has number "<<b3;
    }
    else if(b1>=b2)
    {
       cout<<"The treasure is in box which has number "<<b1;
    }
    else
    {
       cout<<"The treasure is in box which has number "<<b2;
    }
    cout<<'\n';
    if((b2%b1)==0 && (b3%b1)==0)
       {
          cout<<"The code to open the box is "<<b1;
       }
       else
       {
          cout<<"The code to open the box is "<<1;
       }
       
}       