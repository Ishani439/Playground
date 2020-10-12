#include<iostream>
#include<cmath>
using namespace std;
int main()
{
	int n,i,d=0,r1,r2,s,cpy,t,sum;
	cin>>n;
	cpy=n;
	while(n>0)
	{
		r1=n%10;
		n=n/10;
		d++;
	}
	s=cpy*cpy;
	t=pow(10,d);
	r2=s%t;
	s=s/t;
	sum=r2+s;
	if(sum==cpy)
	cout<<"Kaprekar Number";
	else
	cout<<"Not a Kaprekar Number";
}