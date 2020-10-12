#include<iostream>
using namespace std;
int main()
{
  int x,y,a;
  cout<<"Enter first number :"<<" Enter second number : "<<"Menu"<<endl;
  cin>>x>>y>>a;
  cout<<"1.Addition"<<endl;
  cout<<"2.Subtraction"<<endl;
  cout<<"3.Multiplication"<<endl;
  cout<<"4.Division"<<endl;
  cout<<"5.Remainder"<<endl;
  switch(a)
  {
    case 1:
      	cout<<(x+y);
      	break;
 	case 2.:
  		cout<<x-y;
      	break;
  	case 3.:
  		cout<<x*y;
      	break;
  	case 4.:
  		cout<<x/y;
  	case 5.:
  		cout<<x%y;
      	break;
    default:
      	cout<<"Invalid operation";
      	break;
  }
  return 0;
}
  
  