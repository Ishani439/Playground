#include<iostream>
#include<string.h>
using namespace std;
int main()
{
	int i,v=0,c=0,w=0,d=0,s=0;
	char a[200];
	gets(a);
	for(i=0;i<strlen(a);i++)
	{
		if((a[i]>=65 && a[i]<=90) || (a[i]>=97 && a[i]<=122))
		{
			if(a[i]=='A' || a[i]=='a' || a[i]=='E' || a[i]=='e' || a[i]=='I' || a[i]=='i' || a[i]=='O' || a[i]=='o' || a[i]=='U' || a[i]=='u')
				v++;
			else
				c++;
		}
		else if(a[i]==' ')
			w++;
		else if(a[i]>='0' && a[i]<='9')
			d++;
		else
			s++;
	}
	cout<<"Vowels:"<<v<<endl<<"Consonants:"<<c<<endl<<"White Spaces:"<<w<<endl<<"Digits:"<<d<<endl<<"Symbols:"<<s;
}