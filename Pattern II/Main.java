#include<iostream>
using namespace std;
int main()
{
	int i,j,n,s=1,k=1;
	cin>>n;
	for(i=1;i<=n;i++)
	{
		for(j=1;j<=i;j++)
		{
			if(i%2!=0)
			{
				cout<<s;
				if(j<i)
				cout<<"*";
              	s++;
			}
			else
			{
				for(k=s+i-1;k>=s;k--)
				{
					cout<<k;
					if(k>s)
					cout<<"*";
				}
				s=s+i;
				break;
			}
		}
		cout<<("\n");
	}
}