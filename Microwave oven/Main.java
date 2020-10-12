#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float j,k;
  cin>>i>>j;
  k=((j/100)*50);
  if(i<=2)
    cout<<j+k;
  else if(i==3)
    cout<<2*j;
  else
      cout<<"Number of items is more";
}