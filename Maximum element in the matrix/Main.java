#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a[10][10],m,n,i,j,max=0;
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
      if(max<a[i][j])
      {
        max=a[i][j];
      }
    }
  }
  cout<<"The maximum element is "<<max;
      
  
}