#include<iostream>
using namespace std;
int main()
{
	int i,j,n,k=1;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		if(i%2!=0)
		{
			for(j=1;j<=n-1;j++)
			{
				cout<<k;
			}
			k++;
			cout<<k;
		}
		else
		{
			cout<<k+1;
			for(j=2;j<=n;j++)
			{
				cout<<k;
			}
          k++;
		}
		cout<<endl;
	}
}