#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,r,y;
  float i,a,d,fs;
  cin>>x>>r>>y;
  i=x*r*y/100;
  a=x+i;
  d=(2*i)/100;
  fs=a-d;
  cout<<i<<"\n";
  cout<<a<<"\n";
  cout<<d<<"\n";
  cout<<fs;
}