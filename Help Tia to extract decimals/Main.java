#include<iostream>
#include<string>
#include<math.h>
using namespace std;
int main() 
{
  std::string fnum;
	std ::string substr=".";
  std ::cin>>fnum;
  if (fnum.find(substr)!= string::npos)
  {
    size_t pos = fnum.find('.');
    string str3 = fnum.substr (pos+1);
    std ::cout<<"Floating part is : "<<str3;
  }
 else
 std ::cout<<"Floating part is : ";
return 0;
}