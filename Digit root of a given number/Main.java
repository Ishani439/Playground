#include<iostream>
using namespace std;
int droot(int p);
int main()
{
	int n;
	cin>>n;
	while(n>=10)
	{
		n=droot(n);
	}
	cout<<n;
	return 0;
}
int droot(int p)
{
	int r,s=0;
	while(p>0)
	{
		r=p%10;
		p=p/10;
		s=s+r;
	}
	return s;
}