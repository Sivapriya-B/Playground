#include<iostream>
using namespace std;
int main()
{
  int w, a,c,aa,cc,t;
  std ::cin>>w>>a>>c;
  aa = a*75;
  cc =c*30;
  t =aa+cc;
  if(t<=w)
  {
    std ::cout<<"Boat is stable ";
  }
  else
  {
    std ::cout<<"Boat will drow";
  }
 
  
  return 0;
}
  
  
  
