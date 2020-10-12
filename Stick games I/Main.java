#include<iostream>
using namespace std;
int main()
{
  int n,m;
  cin>>n>>m;
  if(n==m)
  {
    if(m%2==0)
      cout<<"Mani Iyer";
    else
      cout<<"Arun Gupta";
  }
  else if(n<m)
  {
    if(n%2==0)
      cout<<"Mani Iyer";
    else
      cout<<"Arun Gupta";
  }
  else
  {
    if(m%2==0)
      cout<<"Mani Iyer";
    else
      cout<<"Arun Gupta";
  }
}