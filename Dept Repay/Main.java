#include<iostream>
using namespace std;
int main()
{
  int x,y,r;
  float interest,amt,disc,finall;
  std ::cin>>x>>y>>r;
  interest=(x*y*r)/100;
  amt=x+interest;
  disc=interest*2/100;
  finall=x+interest-disc;
  std ::cout<<interest<<endl;
  std ::cout<<amt<<endl;
  std ::cout<<disc<<endl;
  std ::cout<<finall<<endl;
  return 0;
  
}