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
  for(i=0;i<m;i++)
  {
    int rsum=0;
    for(j=0;j<n;j++)
    {
      if(a[i][j]>rsum)
      {
        rsum=a[i][j];
      }
    }
    cout<<rsum<<endl;
  }
      
  
}