#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	int i,k;
	char s[200];
	gets(s);
	for(i=0;i<strlen(s);i++)
	{
		if(s[i]=='t')
		{
			if(s[i+1]=='h' && s[i+2]=='e')
			{
				continue;
			}
		}
		else if(s[i]=='h')
		{
			if(s[i-1]=='t' && s[i+1]=='e')
			{
				continue;
			}
		}
		else if(s[i]=='e')
		{
			if(s[i-2]=='t' && s[i-1]=='h')
			{
				continue;
			}
		}
		else if(s[i]==' ')
		{
			if(s[i-1]=='e' && s[i-2]=='h' && s[i-3]=='t')
			{
				continue;
			}
		}
		cout<<s[i];
	}
}