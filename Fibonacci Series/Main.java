#include<iostream>
using namespace std;
void fibo(int x);
int main()
{
  int n;
  cin>>n;
  fibo(n);
  return 0;
}
void fibo(int x)
{
  int i,a=0,b=1,c;
  for(i=1;i<=x;i++)
  {
    c=a+b;
    if(i<x)
    {
    	a=b;
    	b=c;
    }
  }
  cout<<"The term "<<x<<" in the fibonacci series is "<<a;
}