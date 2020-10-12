#include<iostream>
using namespace std;
int main()
{
	int n,t,i,s=0;
	cin>>n;
	for(i=1;;i++)
	{
		cin>>t;
		s=s+t;
		if(s>=n)
		break;
	}
	cout<<"The number of turns is "<<i;
}