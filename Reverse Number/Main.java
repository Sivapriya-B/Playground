#include <iostream>
int main() 
{
	int n,d,rev=0;
  std ::cin>>n;
  while(n>0)
  {
    d=n%10;
   rev=(rev*10)+d;
    n=n/10;
  }
  std ::cout<<rev;
  return 0;
}