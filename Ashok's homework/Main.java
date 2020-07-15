#include<iostream>
int main()
{
   int r,c,m1[10][10],m2[10][10],sum[20][20];
 std ::cin>>r>>c;
  int i,j;
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
     std :: cin>>m1[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
     for(j=0;j<c;j++)
     {
      std ::cin>>m2[i][j];
     }
  }
  for(i=0;i<r;i++)
  {
     for(j=0;j<c;j++)
     {
      sum[i][j]=m1[i][j]+m2[i][j];
       std ::cout<<sum[i][j]<<" ";
     }
    std ::cout<<"\n";
  }
    return 0;
}