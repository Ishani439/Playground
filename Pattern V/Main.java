#include<iostream>
using namespace std;
int main()
{
	int i,j,n,k=1,s,p,x=0;
	cin>>n;
	p=n;
	for(i=1;i<=n;i++)
	{
		if(i!=1)
		{
			for(j=1;j<=x;j++)
			{
				cout<<"-";
			}
		}
		for(j=1;j<=p;j++)
		{
			cout<<k<<"*";
			k++;
		}
		s=(k-1)+(p*(p-1))+1;
		for(j=1;j<=p;j++)
		{
			cout<<s;
			if(j<p)
			{
				cout<<"*";
			}
			s++;
		}
		p--;
		cout<<endl;
		x=x+2;
	}
}