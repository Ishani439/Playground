#include<iostream>
using namespace std;
int main()
{
  int n,r,odd=0,ev=0;
  cin>>n;
  while(n>0)
	{
		r=n%10;
		n=n/10;
		if(r%2!=0)
          odd=odd+r;
    	else
          ev=ev+r;
	}
 	if(odd==ev)
      cout<<"Yes";
  	else
      cout<<"No";
}