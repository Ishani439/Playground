#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10][10],m,n,i,j,sum=0;
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
    for(j=0;j<n;j++)
    {
      if(i+j==n-1)
      {
        sum=sum+a[i][j];
      }
    }
  }
  for(j=0;j<n-1;j++)
  {
    i=0;
    sum=sum+a[i][j];
  }
  for(j=1;j<n;j++)
  {
    i=m-1;
    sum=sum+a[i][j];
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
        
  
}