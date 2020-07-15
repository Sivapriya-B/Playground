#include<iostream>
using namespace std;
int main()
{
  int i,n,en,nt,s=0;
  std ::cin>>en>>nt;
  n=en+nt;
  for(i=1;i< n;i++)
  {
   if(n%i ==0)
      s=s+i;
  }
    if(s==n)
      std ::cout<<"They can read the message";
  else
      std ::  cout<<"They can't read the message";
  return 0;
}
    
        