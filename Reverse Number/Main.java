#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  	int n,r,rev=0;
  	cin>>n;
  	while(n>0)
    {
      r=n%10;
      rev=rev*10+r;
      n=n/10;
    }
  	cout<<rev;
	return 0;
}