#include<iostream>
using namespace std;
int main()
{
	float a=0.5;
	int i,n;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		cout<<a<<" ";
		a=a*3;
	}
	return 0;
}