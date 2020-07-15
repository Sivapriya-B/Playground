#include<iostream>
int main()
{
    int r,c;
  std ::cin>>r>>c;
  int i,j;
  int a[20][20];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std ::cin>>a[i][j];
    }
  }
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
     std ::cout<<a[j][i]<<" ";
    }
    std ::cout<<"\n";
  }
    return 0;
}