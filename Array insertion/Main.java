#include<iostream>
using namespace std;
int main()
{
  int a[20],n,l,v,i;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
  	cin>>a[i];
  }
  cout<<"Enter the location where you wish to insert an element"<<endl;
  cin>>l;
  if(l<=n)
  {
  cout<<"Enter the value to insert"<<endl;
  cin>>v;
  cout<<"Array after insertion is"<<endl;
  for(i=0;i<n;i++)
  {
  	if(i==l-1)
  	{
  		cout<<v<<endl;
	}
  	cout<<a[i]<<endl;
  }
  }
  else
  	cout<<"Invalid Input";
}