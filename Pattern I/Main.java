#include<iostream>
using namespace std;
int main()
{
	int i,j,n;
	cin>>n;
	for(i=1;i<=4;i++)
	{
		for(j=1;j<=i;j++)
		{
			cout<<n;
		}
      cout<<endl;
		n++;
	}
	n--;
	for(i=4;i>=1;i--)
	{
		for(j=1;j<=i;j++)
		{
			cout<<n;
		}
      cout<<endl;
		n--;
	}
}