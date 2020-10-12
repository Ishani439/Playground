#include<iostream>
using namespace std;
int main()
{
	int n,c,r;
	cin>>r>>c>>n;;
	if((n>=1 && n<=c) || (n%c==0) || ((n-1)%c==0))
		cout<<"Yes";
  	else
		cout<<"No";
	return 0;
}