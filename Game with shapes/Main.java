#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  float r,l,ac,pi;
  cin>>r>>l;
  ac=2*r;
  if(ac==l)
  {
    cout<<"circle can be inside a square";
  }
  else
  {
    cout<<"circle cannot be inside a square";
  }
  return 0;
}
    
  
  
