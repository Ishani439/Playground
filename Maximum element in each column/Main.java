#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10][10],i,j,m,n;
  cin>>m>>n;
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      cin>>a[i][j];
    }
  }
  for(j=0;j<n;j++)
  {
    int cmax=0;
    for(i=0;i<m;i++)
    {
      if(cmax<a[i][j])
      {
        cmax=a[i][j];
      }
    }
    cout<<cmax<<endl;
  }
}