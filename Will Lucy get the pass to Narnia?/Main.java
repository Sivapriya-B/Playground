#include<iostream>
using namespace std;
int main()
{
  int a,b,c;
  std ::cout<<"Enter first number :";
  std ::cin>>a;
  std ::cout<<" Enter second number :";
  std ::cin>>b;
  std ::cout<<" Menu"<<"\n";
  std ::cin>>c;
  std ::cout<<"1.Addition"<<"\n";
  std ::cout<<"2.Subtraction"<<"\n";
  std ::cout<<"3.Multiplication"<<"\n";
  std ::cout<<"4.Division"<<"\n";
  std ::cout<<"5.Remainder"<<"\n";
  switch(c)
  {
    case 1 :cout<<a+b<<"\n";
      break;
    case 2 :cout<<a-b<<"\n";
      break; 
     case 3 :cout<<a*b<<"\n";
      break; 
     case 4 :cout<<a/b<<"\n";
      break;
     case 5 :cout<<a%b<<"\n";
      break;
     default :cout<<"Invalid operation";
      break;
  }
  return 0;
}
  
  