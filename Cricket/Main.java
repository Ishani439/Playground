#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
	int tb,tr,cr,cb;
	float ovfin,crr,trr,tov;
  	cin>>tb>>tr>>cr>>cb;
	tov=tb/6;
	ovfin=((cb/6)+((cb%6)*0.1));
	crr=(cr/ovfin);
	trr=(tr/tov);
	cout<<tov<<endl<<fixed<<setprecision(1)<<ovfin<<endl<<crr<<endl<<trr<<endl;
	if(crr>trr)
		cout<<"Eligible to Win";
	else
		cout<<"Not Eligible to Win";
	return 0;
}