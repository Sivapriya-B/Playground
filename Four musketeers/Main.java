#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,x3,y3;
  std ::cin>>x1>>y1>>x2>>y2>>x3>>y3;
  float x;
  float y;
  x= float(x1+x2+x3)/3;
  y= float(y1+y2+y3)/3;
  std ::cout<<x<<endl;
  std ::cout<<y;
  return 0;
}