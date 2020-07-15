#include<iostream>
using namespace std;
int main()
{
  int a;
  float b;
  cin>>a>>b;
  float x=10.15,y=13.30,z=18.00,m=22.00;
  if(a>=13 && b==y ||b==z)
   cout<<"$5.00";  
  else if(a>=13 && b==x ||b==m)
    cout<<"$8.00";
  else if(a<13 &&  b==y ||b==z)
     cout<<"$2.00";
  else if(a<13 && b==x ||b==m)
     cout<<"$4.00";
  return 0;
}

    