#include<iostream>
using namespace std;
int main()
{
	int m,a=0,b=1,c,i;
	cin>>m;
	for(i=1;i<m;i++)
	{
		c=a+b;
		a=b;
		b=c;
	}
	cout<<a;
}