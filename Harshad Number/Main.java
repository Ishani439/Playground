#include<iostream>
using namespace std;
int main()
{
	int n,r,cpy,s=0;
	cin>>n;
	cpy=n;
	while(n>0)
	{
		r=n%10;
		n=n/10;
		s=s+r;
	}
	if(cpy%s==0)
	cout<<"Harshad Number";
	else
	cout<<"Not Harshad Number";
}