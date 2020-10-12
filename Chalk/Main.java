#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n,d;
	float d1,d2;
	cin>>n;
	d1=(n/sqrt(n));
	d2=(d1/sqrt(n));
	d=n+d1+d2;
	cout<<d;
}