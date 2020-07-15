#include<iostream>
#include<string>
#include<algorithm>
int main() 
{ 
int i;
  std ::string str;
  getline(std ::cin,str);
 reverse(str.begin(),str.end());
  std ::cout<<str;
  
  return 0;
  }