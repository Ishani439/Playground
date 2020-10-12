#include<iostream>
using namespace std;
int main()
{
	int n,c=0;
	float m=0;
	for(;c!=3;)
	{
		cin>>n;
		if(n>0)
		{
			if(n%2!=0)
			{
				m++;
				c++;
			}
			else
			{
				m=m-0.5;
			}
		}
		else
		{
			m=m-1;
			break;
		}
		}
		cout<<m;
}