#include<iostream>
using namespace std;
int main()
{
	int a;
	float t,p,q,r,s;
	cin>>a>>t;
    p=13.30,q=18.00,r=10.15,s=22.00;
	if(a<=13 && t==p || t==q)
		cout<<"$2.00"<<endl;
	else if(a<=13 && t==r || t==s)
		cout<<"$4.00"<<endl;
	else if(a>13 && t==p || t==q)
		cout<<"$5.00"<<endl;
	else if(a>13 && t==r || t==s)
		cout<<"$8.00";
	return 0;
}