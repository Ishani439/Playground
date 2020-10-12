#include<iostream>
using namespace std;
int main()
{
	int r,c,n;
	cin>>r>>c>>n;
	if(n>=(c+1) && n<=((c+1)+(c-1)) || n>=(1+(c*(c-2))) && n<=((1+(c*(c-2)))+(c-1)))
		cout<<("It is a mango tree");
	else
		cout<<("It is not a mango tree");
	return 0;
}