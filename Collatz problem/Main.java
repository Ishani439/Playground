#include<iostream>
using namespace std;
int main()
{
	int n,i;
	cin>>n;
	for(i=0;n!=1;i++)
	{
		cout<<n<<endl;
		if(n%2!=0)
		{
			n=3*n+1;
		}
		else
		{
			n=n/2;
		}
	}
	cout<<"1"<<endl<<i;
}