#include<iostream>
using namespace std;
int main()
{
  int w,m;
  std ::cin>>w>>m;
  if (w>m)
  {
    std ::cout<<"Yes, you can enter.";
  }
  else if (w==m)
  {
    std ::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  else 
  {
     std ::cout<<"Sorry, you can't enter";
  }
  return 0;
}
  