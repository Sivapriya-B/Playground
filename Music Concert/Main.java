#include<iostream>
int main(){
  int n,m=0,w=0,*ptr;
  std ::cin>>n;
  ptr=(int *) malloc(n*sizeof(int));
  for(int i=0;i<n;i++)
 std ::cin>>*(ptr+i);
  for(int i=0;i<n;i++)
  {
    if(*(ptr+i)%2)
      m++;
    else
      w++;
  }
  std ::cout<<m<<"\n"<<w;
  return 0;
}