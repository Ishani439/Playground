#include<iostream>
using namespace std;
int main()
{
  int n,i,ar[20],j=0,k=0;
  cout<<"Enter the number of elements in the array"<<endl;
  cin>>n;
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
  {
    cin>>ar[i];
  }
  for(i=0;i<n;i++)
  {
  	if(ar[i]%2==0)
  		j++;
  	else
  		k++;
  }
  if(j==n)
  	cout<<"The array is Even";
  else if(k==n)
  	cout<<"The array is Odd";
  else
  	cout<<"The array is Mixed";
}