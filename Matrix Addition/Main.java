#include<iostream>
using namespace std;
int main()
{
	int mat1[10][10],mat2[10][10],i,j,m,n;
	cin>>m>>n;
	for(i=1;i<=m;i++)
	{
		for(j=1;j<=n;j++)
		{
			cin>> mat1[i][j];
		}
	}
	for(i=1;i<=m;i++)
	{
		for(j=1;j<=n;j++)
		{
			cin>> mat2[i][j];
		}
	}
	for(i=1;i<=m;i++)
	{
		for(j=1;j<=n;j++)
		{
			cout<< (mat1 [i][j] + mat2 [i][j])<<" ";
		}
		cout<<endl;
	}
}