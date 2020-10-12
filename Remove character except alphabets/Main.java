#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  	int i,j=0;
  	char a[200],b[200];
  	cin>>a;
	for(j=0;j<strlen(a);j++)
    {
    	if((a[j]>=65 && a[j]<=90) || (a[j]>=97 && a[j]<=122))
    	{
        	b[i]=a[j];
        	i++;
	 	}
    }
    b[i]='\0';
	cout<<b;
}