#include<iostream>
using namespace std;
int main()
{
  int a=11;
  int n,i;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    cout<<a*a<<" ";
    a=a+4;
  }
  return 0;
}