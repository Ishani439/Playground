#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char a[50],b[50],c[50];
  int i,k;
  cin>>a>>b;
  k=strlen(b)-1;
  for(i=0;i<strlen(b);i++)
  {
    c[i]=b[k];
    k--;
  }
  c[i]='\0';
  if(strcmp(a,c)==0)
    cout<<"It is correct";
  else
    cout<<"It is wrong";
}