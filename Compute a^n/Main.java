#include<iostream>
using namespace std;
int power(int p, int q);
int main()
{
  int a,n,k;
  cout<<"Enter the value of a"<<endl;
  cin>>a;
  cout<<"Enter the value of n"<<endl;
  cin>>n;
  k=power(a,n);
  cout<<"The value of "<<a<<" power "<<n<<" is "<<k;
  return 0;
}
int power(int p, int q)
{
  int i,b=1;
  for(i=1;i<=q;i++)
  {
    b=b*p;
  }
  return b;
}