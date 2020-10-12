#include<iostream>
using namespace std;
int main()
{
	int i,j,m,mat[10][10],d1=0,d2=0;
	cin>>m;
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			cin>>mat[i][j];
		}
	}
	for(i=0;i<m;i++)
	{
		for(j=0;j<m;j++)
		{
			if(i==j)
			{
				d1=d1+mat[i][j];
			}
			if((i+j)==(m-1))
			{
				d2=d2+mat[i][j];
			}
		}
	}
	if(d1==d2)
		cout<<"Yes";
	else
		cout<<"No";
}