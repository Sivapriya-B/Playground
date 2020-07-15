#include<iostream>
using namespace std;
int main()
{
  int a;
  std ::cin>>a;
  if(a<=200)
    cout<<"Rs."<<int(0.5*a);
  else if(a<=400)
     cout<<"Rs."<<(0.65*a)+100;
  else if(a<=600)
     cout<<"Rs."<<(0.80*a)+200;
  else if(a>600)
    cout<<"Rs."<<(1.25*a)+425;
  return 0;
}