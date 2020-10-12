#include<iostream>
using namespace std;
int gcd(int a, int b);
int main()
{
  int m,n,k;
  cin>>m>>n;
  k=gcd(m,n);
  cout<<"G.C.D of "<<m<<" and "<<n<<" = "<<k;
  return 0;
}
int gcd(int a, int b)
{
  int i,h;
  for(i=1;i<=a;i++)
  {
    if(a%i==0 && b%i==0)
    {
      h=i;
    }
  }
  return h;
}