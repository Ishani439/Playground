#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y;
  cin>>x;
  if(x<=200)
  {
    y=x*0.5;
    cout<<"Rs."<<y;
  }
  else if(x<=400)
    cout<<"Rs."<<(x*0.65+100);
  else if(x<=600)
    cout<<"Rs."<<(x*0.80+200);
  else
    cout<<"Rs."<<(x*1.25+425);
}