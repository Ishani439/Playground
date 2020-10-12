#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,r,i=0;
  cin>>n;
  do
  {
    r=n%10;
    n=n/10;
    i++;
  }while(n>0);
  cout<<i;
}