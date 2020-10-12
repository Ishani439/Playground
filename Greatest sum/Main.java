#include<iostream>
using namespace std;
int main()
{
	int i,j,m,n,mat[10][10],rmax=0,cmax=0,r,c;
	cin>>m>>n;
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			cin>>mat[i][j];
		}
	}
	cout<<"Sum of rows is ";
	for(i=0;i<m;i++)
	{
		int rsum=0;
		for(j=0;j<n;j++)
		{
			rsum=rsum+mat[i][j];
		}
		cout<<rsum<<" ";
		if(rsum>rmax)
		{
			rmax=rsum;
			r=i+1;
		}
	}
	cout<<endl<<"Row "<<r<<" has maximum sum "<<endl;
	cout<<"Sum of columns is ";
	for(j=0;j<n;j++)
	{
		int csum=0;
		for(i=0;i<m;i++)
		{
			csum=csum+mat[i][j];
		}
		cout<<csum<<" ";
		if(csum>cmax)
		{
			cmax=csum;
			c=j+1;
		}
	}
	cout<<endl<<"Column "<<c<<" has maximum sum "<<endl;
}